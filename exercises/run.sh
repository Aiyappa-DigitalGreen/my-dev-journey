#!/bin/bash
# ============================================================
#  run.sh — the ONE command that runs any Kotlin file
#
#  Usage:   ./run.sh w1/01_hello.kt
#
#  Why this exists: Kotlin needs TWO steps to run a file
#  (translate it, then execute it). This script does both,
#  so you type one thing instead of two.
# ============================================================

set -e

FILE="$1"

if [ -z "$FILE" ]; then
  echo "Usage: ./run.sh <file.kt>"
  echo "Example: ./run.sh w1/01_hello.kt"
  exit 1
fi

if [ ! -f "$FILE" ]; then
  echo "No such file: $FILE"
  exit 1
fi

OUT=".build"

# 🐛 BUG FIX 2026-08-03. Without this line, .build KEEPS every class ever
# compiled. The "find ... | head -1" below then picks whichever it stumbles
# on first — which can be an OLD program. Symptom: you run 04_templates.kt
# and watch 03_workshop.kt's output appear, with no error to warn you.
# Wiping the folder first guarantees only today's file is in there.
rm -rf "$OUT"

echo "→ translating $FILE ..."
kotlinc "$FILE" -d "$OUT"

# Kotlin turns a file named  hello.kt  into a class named  HelloKt.
# Find whichever class it produced, so you never have to guess the name.
CLASS=$(cd "$OUT" && find . -name "*Kt.class" | head -1 | sed 's|^\./||; s|\.class$||; s|/|.|g')

if [ -z "$CLASS" ]; then
  echo "Could not find a runnable class — does your file have  fun main()  in it?"
  exit 1
fi

echo "→ running ..."
echo "------------------------------"
kotlin -cp "$OUT" "$CLASS"
echo "------------------------------"

# 02 · `println` and `fun main() { }`

**Learned:** 2026-08-03 · **Track A · W1 · Lesson 1 · Concepts 2 & 3**
*Cheat sheet — built for a 2-minute re-read.*
*Builds on: [01 · What is a program?](01-what-is-a-program.md)*

---

## Part 1 — `println`

### The PROBLEM it solves

A computer doing work makes **no sound and shows no picture**. It adds, compares
and decides entirely inside itself, silently. Without an instruction to *say
something*, there is no way to tell whether it did brilliant work or nothing.

**The computer's work is invisible. `println` is how a program talks.**

### The PICTURE

A magnificent cook is locked in a kitchen with **no serving hatch**. He cooks all
day; you sit outside starving, with no evidence he exists.

`println` **is the serving hatch** — the one opening between the world inside the
computer and me outside it. Nothing else comes out.

### Every token

```kotlin
println("Hello Aiyappa")
```

| Token | What it is |
|-------|-----------|
| `println` | The **name of the tool**. `print` = show it on screen (the name is from the 1960s, when output came out on **paper**). `ln` = **line** → after showing it, move down to a new line. Lowercase, exact — `Println` fails. |
| `(` `)` | **Parentheses.** Where you hand the tool the thing it should work on. Always a pair. |
| `"` `"` | **Double quotes.** They say *"stop reading this as an instruction — this is plain text, hand it out exactly as written."* Without them the computer tries to interpret the words as tool names. |
| `Hello Aiyappa` | The message itself. |

📌 **String** = a piece of plain text in code. Named that because it's characters
threaded together like beads on a string. I'll hear this word forever.

### `print` vs `println`

```kotlin
print("Kodagu")      // no line break — cursor stays put
print("Madikeri")
// → KodaguMadikeri     (one line, jammed together)

println("Kodagu")    // line break after
println("Madikeri")
// → Kodagu
//   Madikeri
```

`print` is `println` with the "go to a new line" part removed.

### Two ways to print a blank line

```kotlin
println("")   // hand it empty text
println()     // hand it nothing at all   ← the one a professional writes
```

**The `ln` fires no matter what** — even with nothing to show, it still moves to a
new line. That's the whole trick.

### 🧭 WHERE & WHEN — `println`

- **WHERE:** the developer's tool, not a shipped-app feature. Its real home is
  **debugging** — *"is the program even reaching this line? what does this value
  actually hold?"* Print-debugging is the oldest technique alive and engineers with
  20 years' experience still use it daily.
- **WHEN:** something is invisible and I need it visible. Learning. Terminal tools.
- **⛔ WHEN NOT — three reasons (senior signal):**
  1. **Never leave it in shipped code.** Android uses `Log.d(...)` / Timber instead —
     those carry a **tag** and a **level** so they can be filtered, and debug logs get
     stripped from release builds. A stray `println` can't be filtered or switched off.
  2. **🔒 Never print sensitive data.** Passwords, tokens, phone numbers, medical
     data. Logs are files — collected, shipped to servers, read by people. Printing
     an auth token is a real security incident and a failed audit.
  3. **A debugger beats prints** for anything non-trivial — breakpoints pause and
     show everything at once instead of guess → print → run → guess again.
- **FROM SCRATCH — why "Hello World" exists:** it's not tradition, it's a **smoke
  test**. It proves the editor saved, the translator understood, the machine ran,
  and output reached my eyes. Confirm the pipe works *before* building on it.

---

## Part 2 — `fun main() { }`

### The PROBLEM it solves

A file grows to 400 instructions — some for logging in, some for saving a note, some
for sending mail. Hand it over and say "go."

**Where does it start?** And which instructions belong to which job? To the machine
it's 400 lines in a row with no grouping and no front door. Two needs:

1. Instructions must be **grouped into named jobs**, so I can say *"do the log-in
   job"* instead of relisting thirty lines.
2. Exactly one job must be marked **"START HERE."**

### The PICTURE — the office building

Many rooms (accounts, reception, storeroom), each doing a different job. A visitor
arrives — which room do they walk into? There must be **one main entrance**. Every
other room is reachable *from* it, but everyone comes through that door first.

- **room** = **function** — a named group of instructions doing one job
- **main entrance** = `main` — the one function the computer walks into first

### Every token

```kotlin
fun main() {
    println("Hello Aiyappa")
}
```

| Token | What it is |
|-------|-----------|
| `fun` | Short for **function** (not "enjoyment"). Announces: *"a named job starts here."* |
| `main` | The **name** — and it's **special**. On startup the system hunts for a function named exactly `main`, enters it, runs it top to bottom. No `main` → it refuses to run, because it has no idea where to begin. Other functions can be named anything; `main` is claimed. |
| `(` `)` | Same parentheses as `println`. `main` gets handed nothing, so they sit **empty** — still required, because they're how the computer recognises a function rather than a name floating in space. |
| `{` `}` | **Curly braces = the walls of the room.** They answer *where does this job start and end?* Everything between them belongs to `main`. Always a pair. |
| 4 spaces | **Indentation.** Kotlin does **not** need it — the program runs identically without it. It's purely for human eyes, showing that `println` lives *inside* `main`. *(Python, in W10, DOES require it. Kotlin doesn't. Everyone indents anyway.)* |

> **Forgetting the closing `}` is the most common beginner error there is** — and now
> it has a meaning: *I opened a room and never built its far wall.*

### Read as English

> *"Define a job named `main`. It takes nothing. Its walls open here `{`. Inside:
> reach for `println`, hand it the text. Its walls close here `}`."*

### 🧭 WHERE & WHEN — `main`

- **WHERE:** every standalone Kotlin program has exactly one `main`.
- **⛔ WHEN NOT — worth knowing before W5:** an **Android app has no `main` I ever
  write.** Android itself is the front door and calls *into* my code when the user
  taps the icon. **I write the rooms; the system owns the entrance.**

---

## ✅ What I actually built

`exercises/w1/02_output.kt` — written, run, verified:

```kotlin
fun main() {
    println("Name: Aiyappa")
    println("City: Madikeri")
    println()
    println("Kodagu")
}
```

Run it with:
```
cd ~/Desktop/MyDevJourney/exercises
./run.sh w1/02_output.kt
```

---

## 🎤 Interview Q&A

**Q: "What's the entry point of a Kotlin program?"**
> A top-level function named `main`. The runtime looks for that exact name to know
> where execution begins — without it there's nothing to start. Worth adding: on
> Android you don't write one. The framework owns the entry point and calls into
> your components, which is why Android code is structured around lifecycle
> callbacks rather than a linear `main`.

**Q: "Would you use `println` for logging in a production Android app?"**
> No. `println` has no tag and no severity level, so it can't be filtered or
> switched off, and it survives into release builds. I'd use `Log`/Timber with
> proper levels and strip debug logging from release. The bigger issue is
> discipline about *what* gets logged — logs get collected and read, so anything
> sensitive in a log line is a data-leak path, not a debugging convenience.

**Q: "Why does `println()` with empty parentheses still print something?"**
> The `ln` part is independent of the content. It emits a line separator whether or
> not there's text, so an empty call produces a blank line. It's the clearest way to
> express "I want a line break, not a value."

---

## 🔁 Recall prompts (out loud, no notes)

1. Why does the computer need a function called `main` specifically?
2. What do the curly braces `{ }` actually answer?
3. Give two reasons you'd never ship a `println` in an Android release build.
4. Does Kotlin need indentation? Why does everyone do it anyway?

---

**Open item for next session:** the 👓 "what's wrong with this code?" rep on three
broken programs (println outside the braces · missing `}` · a file with no `main`).

**Next:** `val` / `var` — storing things.

# 03 · `val` / `var` and String Templates (`$`)

**Learned:** 2026-08-03 · **Track A · W1 · Lesson 1 · Concepts 4 & 5**
*Cheat sheet — built for a 2-minute re-read.*
*Builds on: [02 · println and main](02-println-and-main.md)*

---

## Part 1 — variables (`val` / `var`)

### The PROBLEM

Everything written so far was **typed in advance and hardcoded**:

```kotlin
println("Name: Aiyappa")
```

Two things are broken:

- **A · Nothing has a single home.** If my name appears in 20 of 200 lines, changing it
  is 20 edits and one miss. *(Concept 1's **exact** property: 20 copies of a fact =
  20 chances to be wrong.)*
- **B · The program has no memory.** A real program *discovers* things while
  running — what the user typed, what the server replied. With no jars, the computer
  works something out and it evaporates before the next line.

### The PICTURE — jars with paper labels

I don't carry two kilos of rice around the kitchen. I pour it into a jar, write
**rice** on the label, and say *"pass me the rice."* I refer to the **label**, never
the contents.

- **one home** for the thing
- **a short name** for a big thing
- **contents can change; the label doesn't** — refill the jar and every recipe
  saying "rice" still works

> jar = **variable** · label = **name** · what's inside = **value**

### Every token

```kotlin
val name = "Aiyappa"
println(name)
```

| Token | What it is |
|-------|-----------|
| `val` | Keyword. Announces *"I am creating a labelled jar."* Short for **value**. |
| `name` | **The label — I invented it.** Unlike `main`, this is my choice. Good names are an engineering skill: code is read far more than written. |
| `=` | ⚠️ **NOT "equals".** It's an **arrow pointing left**: *take the thing on the RIGHT and put it INTO the jar on the LEFT.* An action, not a fact. Proper name: **assignment**. |
| `"Aiyappa"` | The **value** going in the jar. |

### 👀 The quotes rule, doing new work

```kotlin
println("name")   // → name       the four letters n-a-m-e
println(name)     // → Aiyappa    the contents of the jar
```

Same rule from Concept 2:
**quotes ON = don't interpret · quotes OFF = interpret it as a label and fetch.**

### `val` vs `var`

```kotlin
val score = 0
score = 10        // ❌ error: 'val' cannot be reassigned.

var score = 0
score = 10        // ✅ (no `var` on line 2 — `var` CREATES the jar, once)
```

| | Full name | The jar | Rule |
|---|---|---|---|
| `val` | **val**ue | Sealed after filling | Set once, read forever. Reassigning is a **compile** error. |
| `var` | **var**iable | Refillable | Reassign as often as needed. |

### ⭐ THE SENIOR IDEA — why `val` exists at all

`var` can do everything `val` can, plus more. So why ever use `val`?

> **Because most bugs are something changing when you didn't expect it to.**

A phone number in a `var` inside a 3,000-line app. One line somewhere — a file I've
never opened, written by someone who left — quietly changes it. Now the confirmation
SMS goes to the wrong person. To find it I'd have to check every line that could
touch it.

Make it a `val` and that **entire class of bug becomes impossible** — proven by the
compiler before the program runs. I don't need to trust my teammates or my own
six-months-ago memory.

> **A `val` is a promise the compiler enforces: *this will not change from under you.***

**⭐ THE RULE: default to `val`. Reach for `var` only when I can name the reason it
must change.** Not "it might change later" — that's a guess, and converting it costs
one keystroke on the day it's true.

### 🧭 WHERE & WHEN

- **WHERE:** a profile screen — the user's ID is a `val` (fetched once). "Is the
  avatar still loading" is a `var` (starts `true`, becomes `false`).
- **WHEN:** the moment a value is used more than once, or is discovered at runtime
  rather than typed in advance.
- **⛔ WHEN NOT:**
  - Don't name a value used once and obvious — `val one = 1` helps nobody.
  - Don't reach for `var` speculatively.
  - **🔥 Android:** shared mutable state — a `var` several parts of the app can
    write to — is the biggest single source of mobile bugs. **Jetpack Compose (W5)
    is built almost entirely around controlling who is allowed to change what.**
    This small habit is the foundation of that whole architecture.
- **FROM SCRATCH:** write `val`. If the compiler complains, change it to `var`.
  Let the machine decide.

### 🎓 One layer deeper (noticed 2026-08-03)

I made `seatsLeft` a `val` — correct by the rule, since it never changes in that
program. In a **real** app it'd be a `var`… or better, **not stored at all**:
compute it as `totalSeats - registered`, so it can never disagree with reality.

> **Two facts that must match are two facts that will eventually disagree.**

`val` vs `var` is the small question. *"Should this be stored at all?"* is the layer
below it, and that's where senior answers live.

---

## Part 2 — String templates (`$`)

### The PROBLEM

Gluing text and values with `+`:

```kotlin
println("Hi " + name + ", " + count + " seats left in " + city + " on " + date)
```

The **sentence has disappeared** — I can't read what this prints without mentally
assembling it. Every `+` is a place to misplace a space; every quote pair is a place
to lose one.

### The PICTURE — a pre-printed certificate

> *This certifies that ____________ completed ____________ on ____________.*

The sentence is printed once and stays readable. The **blanks** get filled per
student. `$` marks a blank.

### How it works

```kotlin
val name = "Aiyappa"
println("Workshop: $name")     // → Workshop: Aiyappa
```

> **`$` punches a hole in the quotes rule:** *"pause plain-text mode — the next word
> is a label, fetch its contents, drop them here, resume plain text."*

Proper name: a **string template**.

**Where the label ends** — at the first character that can't be part of a name:

```kotlin
println("Workshop: $name!")    // → Workshop: Aiyappa!
```

### The `${ }` form — two situations that need it

```kotlin
// A — the label runs into other letters
println("$cityworkshop")       // ❌ hunts for a jar named "cityworkshop"
println("${city}workshop")     // ✅ Madikeriworkshop

// B — anything more than a bare fetch
println("Next year: ${count + 1}")
```

`{ }` marks *exactly how much is the label* — the same "start and end" job the braces
do on `main`.

**A literal dollar sign:**

```kotlin
println("Price: \$500")        // → Price: $500
```

`\` is an **escape**: *"next character is plain text, ignore its special power."*

### 🧭 WHERE & WHEN

- **WHERE:** everywhere text meets data — every label on every screen.
- **⛔ WHEN NOT — the first two are senior-level interview answers:**
  1. **🔒 Never build a database query by gluing user input into a string.** A user
     can type something that *isn't a name* and make the database run it — that's
     **SQL injection**, still one of the most common serious breaches worldwide.
     Databases provide a safe way to pass values. *(Properly in W11–W12.)*
  2. **📱 Never for user-facing Android text.** UI text belongs in a **string
     resource file** with placeholders so the app can be translated to Kannada or
     Hindi without touching code. A `$` template hardcodes English forever.
     *(W5. Right for a log line, wrong for a UI label.)*
  3. **Don't stuff long calculations inside `${ }`.** Compute into a `val` first.
     `${ }` holds a fetch, not a paragraph.
- **FROM SCRATCH:** write the sentence in plain English, then replace the changing
  parts with `$label`. That's the certificate.

---

## ✅ What I built

`exercises/w1/03_workshop.kt` and `exercises/w1/04_templates.kt` — both run, both
verified.

```kotlin
fun main() {
    val workshopCity = "Madikeri"
    val seatsLeft = 12
    println("$workshopCity workshop has $seatsLeft seats left.")
    println("Tag: #${workshopCity}workshop2026")
}
```

---

## 🐛 The stale-build bug (2026-08-03) — worth remembering forever

`04_templates.kt` printed **`03_workshop.kt`'s output**, with no error at all.

**Cause:** `run.sh` compiled into `.build` but never emptied it, so every class ever
compiled piled up. The script then did `find . -name "*Kt.class" | head -1` —
*"grab the first one you find"* — and grabbed an old program.

**Which of Concept 1's three properties failed? COMPLETE.** A missing step —
"empty the folder first" — exactly like never writing "turn on the stove."

**Fix:** `rm -rf "$OUT"` before compiling.

**📱 This is called a stale build and it never goes away.** Android Studio's
**Build → Clean Project** menu item exists for this exact reason. *"Have you tried a
clean build?"* is not folklore — it's this.

**The habit it cost me:** I pasted code without running it, twice. Had I run it, I'd
have found this bug instead of Claude. → *Never trust output — mine or AI's — until
I've tested it.*

---

## 🎤 Interview Q&A

**Q: "`val` vs `var` — when do you use each?"**
> `val` is a read-only reference, `var` is reassignable. I default to `val` and only
> use `var` when I can articulate why the value must change over its lifetime. The
> reason isn't style — immutability removes a whole class of bug where something
> mutates from a place you didn't expect, and the compiler enforces it rather than
> me relying on convention. It matters more on a team than alone, and it's the
> foundation of how state is managed in Compose.

**Q: "Is a `val` the same as a constant?"**
> Not quite. `val` means the *reference* can't be reassigned — the object it points
> at may still be mutable internally. A true compile-time constant is `const val`,
> which only works for primitives and Strings known at compile time. Worth being
> precise about, because "val means immutable" is a common oversimplification.

**Q: "What's wrong with building a query using string templates?"**
> It's an injection vector. If any part of that string comes from user input, the
> user controls part of the query, and can make the database execute something you
> never intended. The fix is parameterised queries — the values travel separately
> from the statement, so they can never be interpreted as code. Same principle
> applies to building HTML or shell commands from user input.

---

## 🔁 Recall prompts (out loud, no notes)

1. What does `=` actually mean, and why is calling it "equals" misleading?
2. Why does `println(name)` behave differently from `println("name")`?
3. `var` can do everything `val` can. So why does `val` exist?
4. When is `${ }` required instead of plain `$`?
5. What is a stale build, and which of the three program properties does it violate?

---

**Next:** types (`Int`, `String`, `Boolean`, …) — what kind of thing is in the jar.

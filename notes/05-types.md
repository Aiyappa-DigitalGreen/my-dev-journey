# 05 · Types — what KIND of thing is in the jar

**Learned:** 2026-08-03 · **Track A · W1 · Lesson 1 · Concept 6**
*Cheat sheet — built for a 2-minute re-read.*
*Builds on: [03 · val/var and string templates](03-variables-and-string-templates.md)*

---

## The PROBLEM — one symbol, two behaviours

```kotlin
println(5 + 3)        // → 8      numbers get ADDED
println("5" + "3")    // → 53     text gets CONCATENATED (glued end to end)
```

> **`+` does not have one meaning.** It behaves differently depending on **what KIND of
> thing** you give it.

So before running `a + b`, the computer must answer a question: **"what kind of things
are these?"** Numbers → add. Text → glue.

**That question — *what kind of thing is this?* — is what a TYPE is.**

---

## The PICTURE — a photograph of a ₹500 note vs the actual note

Both show "500". You can hold either. **You cannot buy tea with the photograph.**

- `"500"` = the **photograph** — a picture of a number, made of the characters `5`,`0`,`0`
- `500` = the **actual note** — a quantity you can do arithmetic with

They look identical on screen. **The quotes are the difference between a photo and the
real thing.**

---

## 💣 Why this is not trivia — the form-input bug

A user types `25` into an "Enter your age" box.

**Everything typed into a text box arrives as TEXT.** The keyboard has no idea what a
number is — it sends characters. So the program receives `"25"` — the photograph.

```kotlin
age + 1        // expecting 26
               // → "251"
```

**No crash. No error. No warning.** A confident, wrong answer shown to a user.
Same shape as the stale-build bug: the machine did exactly what was asked, and what was
asked was wrong.

---

## The four types needed now

| Type | What it holds | Examples |
|------|--------------|----------|
| **`Int`** | whole numbers (short for **integer**) | `25`, `0`, `-7` |
| **`Double`** | numbers **with** a decimal point | `99.5`, `3.14` |
| **`String`** | text, in `" "` | `"Aiyappa"` |
| **`Boolean`** | exactly **two** values, nothing else | `true`, `false` |

*(`Double` = "double precision", historical name — ignore it, use it for decimals.
`Boolean` is named after George Boole, a mathematician. Not an abbreviation.)*

```kotlin
val age = 25              // Int
val price = 99.5          // Double
val name = "Aiyappa"      // String
val isRegistered = true   // Boolean
```

📌 **I never wrote the type.** Kotlin looked at `25` and worked out *"Int"*. That's
**type inference**. I can state it if I want — `val age: Int = 25` — same thing.

✅ **`is` as a prefix for a Boolean is the correct convention** (`isPaid`, `isLoading`).

---

## ⚠️ THE GAP THE TYPE SYSTEM DOESN'T CATCH

```kotlin
val quantity = "3"
val total = quantity + 1
println(total)            // → 31     ← IT RUNS. No error at all.
```

**Kotlin lets you glue anything onto a String.** It converts the `1` to the character
`1` and sticks it on. The developer wanted `4`.

**The asymmetry, worth remembering:**

| | Result |
|---|---|
| `"3" + 1` | ✅ compiles → `"31"` — **silently wrong** |
| `1 + "3"` | ❌ **compile error** — a number refuses to absorb text |

**The danger only runs one direction: text-first silently swallows numbers.**

---

## ⭐ RULE 1 — is it really a number?

Phone number `9480499344`. `Int` or `String`?

**`String`.** Two reasons, and the second is the senior one:

1. **It doesn't fit.** An `Int` maxes out around **2.1 billion**; 9.4 billion overflows it.
2. **⭐ A phone number is not a quantity. It's a name made of digits.**
   Is `9480499344 + 1` a meaningful phone number? Is the *average* of two phone numbers
   anything? No. Nothing about it behaves like a number.

**And storing it as a number destroys information:**

- `080-2222-3333` → as a number the **leading zero vanishes**: `80...`
- `+91` → the `+` is gone
- PIN code `002233` → becomes `2233`

> ### **If you'd never do arithmetic on it, it isn't a number — even if it's made
> entirely of digits.**

**All Strings:** phone numbers · PIN codes · Aadhaar · order IDs · OTPs · account
numbers. Common interview question; most candidates get it wrong.

---

## ⭐ RULE 2 — 💸 NEVER use `Double` for money

```kotlin
println(0.1 + 0.2)        // → 0.30000000000000004
```

**This is not a Kotlin bug — every language does it.** `Double` stores numbers in
binary, and `0.1` **cannot be represented exactly in binary**, the same way `1/3` can't
be written exactly in decimal. It stores almost-0.1, and the error surfaces on addition.

**Real consequence:** 200 students × ₹499.50 in a `Double` won't total `₹99,900.00` —
it'll be `₹99,900.000000001` or `₹99,899.999999998`. Compare that to the payment
gateway and they disagree. Now you're debugging money.

**The fix — store money as a whole number of paise:**

```kotlin
val feePerSeatPaise: Int = 49950     // ₹499.50, exact. Divide by 100 only to DISPLAY.
```

Whole numbers are exact, always. Add it a million times, still exact.
*(Large systems use `BigDecimal`; paise-as-integer is the common mobile answer.)*

📌 **PUT THE UNIT IN THE NAME** — `feePerSeatPaise`, not `fee`. Six months later
`fee = 49950` looks like a ₹49,950 charge and someone will "fix" it.
Same for `Ms`, `Bytes`, `Seconds`, `Kb`.

---

## 🧭 WHERE & WHEN

- **WHERE:** every form field and every API response. `price`, `quantity`, `name`,
  `isLoggedIn` — each is a type decision, and each wrong one is a bug.
- **WHEN to write the type explicitly:** when the value is a placeholder to fill later,
  and (later in the course) on anything other people call, where the type is
  documentation. Otherwise let inference do it.
- **⛔ WHEN NOT:** don't annotate the obvious (`val name: String = "Aiyappa"` adds
  nothing). And never `Double` for money.
- **FROM SCRATCH — two questions for any new value:**
  1. *"Would I ever do arithmetic on this?"* → number, else String
  2. *"Is it money?"* → integer paise, never `Double`

---

## ✅ What I built

`exercises/w1/05_types.kt` — 5 of 6 types right first try; the money one was the trap.

```kotlin
fun main() {
    val studentName: String = "Aiyappa"
    val phone: String = "9480499344"          // String — a name made of digits
    val numberOfSeats: Int = 2
    val feePerSeatPaise: Int = 49950          // ₹499.50 exact — never Double for money
    val isBooked: Boolean = true
    val boookingRference: String = "TT0042"

    println("$studentName ($phone) booked $numberOfSeats seats. Paid: $isBooked")
}
```

*(Naming notes I chose to leave in the file: `isBooked` vs `isPaid` are **different
facts** — a student can be booked and unpaid, and that distinction IS business logic.
And `boookingRference` compiles fine, which is the point: **the computer accepts any
label; only humans suffer.**)*

---

## 🏆 The best moment of this topic

The exercise asked for `... booked 2 seats. Paid: true`. My code said `seats.Paid:` —
**one space missing.**

I predicted my output character-for-character **before running it**, and found the bug
with no compiler involved.

> **That is why predict-before-you-run exists.** Ten seconds, one bug caught. It turns
> *"looks about right"* into *"I know what this does"* — and it's the same muscle that
> spots a wrong space in a price label before a user does.

*(Concept 1 again: **exact**. A space is a character. The computer will not add one
because it can tell what you meant.)*

---

## 🎤 Interview Q&A

**Q: "Would you store a phone number as an Int or a String?"**
> A String. It exceeds Int's range, but the real reason is that it isn't a quantity —
> you never do arithmetic on it, so nothing about number semantics applies. Storing it
> numerically also destroys data: leading zeros disappear, and `+91` can't be
> represented. The general rule I use is that digits alone don't make something a
> number; being arithmetically meaningful does.

**Q: "Why shouldn't you use a Double for currency?"**
> Because binary floating point can't represent most decimal fractions exactly — `0.1 +
> 0.2` gives `0.30000000000000004`. Errors accumulate over repeated arithmetic, so
> totals drift and stop reconciling against a payment provider. I'd store money as an
> integer count of the smallest unit — paise — or use BigDecimal where precision and
> rounding rules need to be explicit. And I'd put the unit in the variable name so
> nobody misreads the magnitude.

**Q: "Kotlin is statically typed — does that mean type errors can't happen?"**
> No. It catches a lot, but not everything. `"3" + 1` compiles and produces `"31"`,
> because String defines a plus that accepts anything. Interestingly `1 + "3"` is a
> compile error, so the hole is one-directional. That's a good reminder that a type
> system reduces a class of bugs rather than eliminating them, and that reading your own
> code still matters.

---

## 🔁 Recall prompts (out loud, no notes)

1. Why does `"5" + "3"` give `53` while `5 + 3` gives `8`?
2. What's the difference between a photograph of ₹500 and a ₹500 note — in code terms?
3. Why does everything typed into a form arrive as a String, and what bug does that cause?
4. Give the one-line rule for whether something made of digits should be a number.
5. Why is `Double` wrong for money, and what do you use instead?
6. Which way round does the `String`/`Int` `+` hole run, and why does that matter?

---

**Next:** operators (doing things to what's in the jars) → then `readLine` (getting
input from a real user).

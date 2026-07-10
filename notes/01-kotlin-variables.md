# 01 · Kotlin Variables (`val` / `var`) — cheat sheet

> A **variable** = a *labeled jar* that holds a value so the program can remember it.

## The two jars
| Keyword | Meaning | Jar analogy | Use when |
|---|---|---|---|
| `val` | read-only, set once | sealed jar 🔒 | value should never change (default choice) |
| `var` | changeable | jar with a lid 🔄 | value genuinely needs to change |

**Rule of thumb:** reach for `val` first; use `var` only when you must reassign.

## Anatomy of the first program
```kotlin
fun main() {                     // main = the box the program runs first
    val name = "Aiyappa"         // sealed jar holding text (a String)
    var age = 25                 // lidded jar holding a whole number (an Int)
    age = 26                     // allowed only because age is a var
    println("Hi $name, you are $age")  // prints: Hi Aiyappa, you are 26
}
```
- `fun` = function (named box of instructions). `main` = where the program starts.
- `()` = where a function takes inputs (empty = none). `{ }` = the walls of the box.
- `=` = "put the right value INTO the left jar" (assignment, NOT math equals).
- `"..."` = text (a **String**). No quotes on a number = an **Int**.
- `$name` = **string interpolation** — drop the jar's value into the text.

## 🎤 Interview answers (3-layer)
**val vs var**
- Simple: "`val` = sealed jar; `var` = jar with a lid."
- Pro: "`val` is a **read-only** variable — assigned once, can't be **reassigned**. `var` is **mutable**. I default to `val` for **immutability**: it prevents accidental **state** changes."

**What does `$` do?**
- Simple: "Grabs a jar's value and drops it into the text."
- Pro: "**String interpolation** — inserts a variable's value into a string instead of **concatenating** with `+`."

## Glossary
- **declare** = make a variable · **assign** = put a value in · **reassign** = swap in a new value
- **read-only / immutable** = can't change · **mutable** = can change · **state** = the data held right now
- **String** = text · **Int** = whole number · **concatenate** = join text with `+`

## Gotchas
- Reassigning a `val` → compile error. That's a *feature* (catches bugs).
- `$` only pulls values **inside** quotes. Outside quotes it's not needed.

🔗 Run it yourself: play.kotlinlang.org

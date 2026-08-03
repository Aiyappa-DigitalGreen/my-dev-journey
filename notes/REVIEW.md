# 🔁 Spaced-Repetition Review Queue

This is my anti-forgetting tracker. Every finished topic gets a row here.
At the **start of each session**, Claude checks which reviews are **due today** and quizzes me
with quick active-recall questions (no re-reading — I try to remember first).

**Why:** the brain forgets most new info within a week unless it's *retrieved*. Recalling a topic
at growing gaps (1 → 3 → 7 → 21 days) locks it into long-term memory.

**How to read the table:** put the date learned, then tick each review as it's done on/after its
due date. When all four are ticked ✅, the concept is durable.

> ♻️ **CLEARED 2026-07-31 — fresh start.** The old Kotlin-variables row was removed because that
> topic is being re-taught from scratch (see PROGRESS.md CURRENT STATUS). Nothing carries over.

| Topic | Learned | +1 day | +3 days | +7 days | +21 days |
|-------|---------|:------:|:-------:|:-------:|:--------:|
| **01 · What is a program?** (exact · complete · ordered) | 2026-08-03 | ⬜ 08-04 | ⬜ 08-06 | ⬜ 08-10 | ⬜ 08-24 |
| **02 · `println` + `fun main() { }`** (hatch · front door · walls) | 2026-08-03 | ⬜ 08-04 | ⬜ 08-06 | ⬜ 08-10 | ⬜ 08-24 |
| **03 · `val`/`var` + string templates `$`** (jars · default to val · certificate) | 2026-08-03 | ⬜ 08-04 | ⬜ 08-06 | ⬜ 08-10 | ⬜ 08-24 |
| **04 · Big-O basics** 🔄 *intuition only — symbols NOT solid* (Track B) | 2026-08-03 | ⬜ 08-04 | ⬜ 08-06 | ⬜ 08-10 | ⬜ 08-24 |
| **05 · Types** (photo of ₹500 · digits≠number · never Double for money) | 2026-08-03 | ⬜ 08-04 | ⬜ 08-06 | ⬜ 08-10 | ⬜ 08-24 |

---
### Quick recall log (optional)
Jot how a review went so we know what needs more work.
- _(e.g. "2026-07-05 — recalled val vs var easily; forgot what `when` does → reviewed again")_
- **2026-08-03** — Day 1. Derived exact/complete/ordered himself from a failed tea recipe. Understood
  `ln` deeply enough to predict the trailing cursor position unprompted, and reached for `println()`
  (empty parens) for a blank line without being shown it. Strong first day.
  ⚠️ **Open, carried to next session:** the 👓 "what's wrong with this code?" rep — three broken
  programs (`println` outside the braces · missing `}` · a file with no `main`). Do this *before*
  starting `val`/`var`; it's the real test that the wrapper concept landed.
- **2026-08-03 (later, same day)** — ✅ Code-review rep done, 3/3, with reasoning past what was taught
  (spotted that a defined-but-uncalled function never runs). `val`/`var` + `$` landed cleanly; he
  reached for `$` and `${ }` correctly.
  🔄 **BIG-O IS NOT SOLID — this is the one to re-open next session.** He said *"I seriously did not
  understand anything"* after the notation was introduced, and he was right to. Cause was **my
  delivery, not his ability**: he answered the concrete register questions perfectly (500 → 9,
  1,000,000 → 20) and then got a 5-row formula table dropped on top of a brand-new abstract idea.
  Reteaching in plain English worked immediately — he produced his own `O(n)` (one bus-ticket
  counter) and his own `O(1)` (a restaurant seating people) unprompted.
  **Where he's genuinely still wrong:** he thinks already-sorted data costs `O(n log n)`. It's `O(1)`
  to grab the last item — `O(n log n)` is the price of *doing* the sort. Corrected in note 04; **check
  this specific point at the next review.**
  **Method note for future sessions: dense tables lose him. One scene at a time, his own examples,
  no symbols until the intuition is load-bearing.**

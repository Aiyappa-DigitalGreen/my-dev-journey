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

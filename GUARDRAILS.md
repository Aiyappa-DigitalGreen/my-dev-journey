# 📏 Guardrails & Rules — read before teaching

Rules for my guided learning course. Any Claude session should follow them until the course is
complete. (There's also a `/teach` skill that automates this — just type `/teach`.)

## 🧒 RULE ZERO — assume I know NOTHING (added 2026-07-31, overrides everything)
I am starting from **absolute zero**. I do not know what `println` is. I do not know what
`fun main()` means, what `{ }` do, or why code has brackets at all.
- **Explain every token**, including scaffolding: `fun` · `main` · `()` · `{ }` · `println` · `val` ·
  quotes · `$` · `//` · indentation. Nothing is "obvious".
- **Banned words:** "as you know", "obviously", "simply", "just", "of course". If it wasn't taught
  in an earlier lesson of this plan, I have not seen it.
- Deferring a concept is fine — **say it out loud** ("that `{` is a lambda, W3, ignore for now").
  Never skip silently.
- **📛 My existing apps (Tutr, KodaguBus, RationSmart, etc.) do NOT count and are out of scope
  until W20 (interview prep).** Never assume knowledge from them. Never use them to skip a topic.
- **The December deadline buys speed with HOURS (5–6/day), never with shallower explanations.**
  If something has to give, it's syllabus breadth — never the depth of a single explanation.

## The golden rules
1. **Sync first.** `git -C ~/Desktop/MyDevJourney pull` at the start; commit + push at the end,
   so progress travels across my devices.
2. **Never delete or overwrite my files without asking me first.** Create and move freely;
   confirm before any removal.
3. **Read `PROGRESS.md` first, every session**, and teach from the CURRENT STATUS.
4. **Teach like I'm 10.** Simple language, analogies, define every jargon word.
5. **Be honest.** Don't mark things done that I didn't do. Don't sugarcoat difficulty.

## 🖐️ THE 5 P's — the pattern for EVERY concept (added 2026-07-31)
> **Never start with syntax.** A concept learned as *the answer to a problem* sticks, because that's
> also how it gets retrieved later — real work arrives as problems, not as syntax.

| | Step | Ask |
|---|------|-----|
| 1️⃣ | **PROBLEM** | What was broken *before* this existed? What pain made someone invent it? |
| 2️⃣ | **PICTURE** | What's it like? A concrete analogy from real life (pen vs pencil, not "a container") |
| 3️⃣ | **PROOF** | The smallest thing that works — every token explained (Rule Zero) |
| 4️⃣ | **PLACE** | Where in a real app · when to reach for it · **when NOT to + what instead** |
| 5️⃣ | **PASS IT ON** | I explain it back out loud, no notes. If I stumble → that's the gap → reteach differently |

**Rules for using it:**
- Steps 1 and 2 come **before** any code appears on screen. Ever.
- Step 4 is where senior-level judgement lives — **never skip "when NOT to."**
- Step 5 is the only real test. Me saying "got it" is not step 5.
- One concept at a time through all five. Never run two concepts in parallel.
- **Remembering is separate:** the 5 P's make me *understand*; spaced repetition
  (1 → 3 → 7 → 21 days, `notes/REVIEW.md`) makes me *keep* it. Both are required.

## Every topic follows this format
**🖐️ The 5 P's above ARE the lesson.** They map onto the session flow like this:
🧒 ELI5 = P1+P2 → 💻 live code (I write the key 5–10 lines, every token explained) = P3
→ **🧭 WHERE & WHEN** = P4 → 🏋️ exercise in chat + 🎤 Q&A recall = P5
→ 📝 notes file → 🎞️ slides file.

### 🧭 WHERE & WHEN — mandatory step (added 2026-07-31, never skip)
Knowing *what* a thing is isn't enough — I need to know **when to reach for it**. Every concept
must answer all four, out loud, with a concrete example:
1. **WHERE** does this show up in a real app? (name an actual screen/feature, not "in programs")
2. **WHEN** do I reach for it? What problem makes me think "ah, I need this"?
3. **WHEN NOT?** What do I use *instead*, and why? ← **this is the senior signal, never skip it**
4. **FROM SCRATCH:** if I were building a feature that needs it, what's step 1?

### Making it stick
- **Kid-level analogy before syntax, every time.** If I can't picture it, I'll forget it.
- One vivid example beats three abstract ones. Reuse a running example across a topic.
- Connect every new concept to one I already learned in this plan — never leave it floating.

## Level: teach from zero, aim at senior  (added 2026-07-31)
- **Teaching baseline = absolute zero** (Rule Zero above). Non-negotiable.
- **Destination = 5-year Android developer + AI.** I have 5 years of professional Android
  experience; I'm rebuilding foundations, not starting a career. Do **not** teach to a junior
  ceiling.
- Every phase in PROGRESS.md has a **🎓 SENIOR LAYER** — those items are mandatory, not bonus.
- At senior level **system design > DSA**, and *why/when/when-not* matters more than *how*.

## Understanding-first + never forget (the most important rule)
- **Understanding over memorizing.** Always teach *why* a thing exists + a real-world analogy
  + connect it to what I already know, BEFORE the syntax. Never say "just memorize this."
- **Make me explain it back** (Feynman): after teaching, ask me to explain it simply. If I
  stumble, that's the gap — reteach it a different way.
- **Retrieval, not re-reading:** quiz me; don't just repeat the answer.
- **Spaced repetition:** at the START of each session, run a 2-min recall warm-up on topics that
  are "due" (see `notes/REVIEW.md`). Review intervals: +1 day, +3 days, +7 days, +21 days.
  Add every finished topic to `notes/REVIEW.md` and check what's due each session.
- **Weekly recap:** end of each week, a short mixed quiz across that week's topics.
- Notes must be **short cheat-sheets** built for fast re-review, not walls of text.

## AI-era rules (added 2026-07-01)
- **Two modes.** Train 🔴 AI-OFF (code from scratch, cold — interviews have no AI) *and* 🟢 AI-ON
  (direct + judge AI). Every in-chat exercise is AI-OFF by default.
- **Prompting basics.** Teach the fundamentals of giving AI good context (specific · examples ·
  constraints · iterate) as part of spec-writing — not gimmicks.
- **🗣️ English speaking, in the flow.** After each topic I explain it back *out loud in English*
  (Feynman), and I *speak* my interview-Q&A answers. Nudge me to do this, don't let it slide.
- **Explain-every-line rule.** I may use AI to help me code from Day 1, but I must be able to
  explain *why* each line exists. If I can't, that's a gap — reteach it. No copy-paste I can't defend.
- **No skipped foundations.** When Claude says "line-by-line," it means EVERY token — including
  scaffolding like `fun main()`, `println`, `{ }`, `( )`, `//`, `$`. Don't wave past anything as
  "obvious." If a concept is deferred to a later week, say so explicitly — never skip silently.
- **Read & judge, not just write.** Include "what's wrong / unsafe / slow with this code?" review
  reps regularly — spotting bad code is now the scarce skill.
- **Verify everything.** Don't trust my output *or* AI's until it's tested. Bring testing/debugging
  in early, not just in the testing week.
- **Ship real projects.** Shipped, deployed, explainable projects are the real deliverable; be honest
  that finishing lessons ≠ job-ready.

## Gap protocol (added 2026-07-10)
Forgetting has turned out to be caused by **long gaps between sessions**, not the teaching
format — confirmed after a 9-day gap between the first lesson and the next touch.
- At the start of a session, check how many days passed since the last dated entry in
  `notes/REVIEW.md` / the PROGRESS LOG.
- If the gap is roughly **>5-7 days**: say so plainly, then do a **compressed re-teach** of the
  last topic (ELI5 + the one worked example, faster this time) BEFORE quizzing or moving to new
  material. A big gap is expected decay, not a personal failure — don't just cold-quiz and shrug.
- Don't silently let a big gap pass unmentioned.
- On a busy stretch, a short touch beats skipping entirely — even just re-reading a `notes/`
  cheat sheet and explaining it out loud for 5 minutes keeps a topic alive.

## Two daily tracks  (updated 2026-07-31 for the December target)
- **Track A — Skills** (~4h): the roadmap (Kotlin → Android → Backend → AI-in-Android → AI Engineering).
- **Track B — DSA** (~1.5h): daily problem-solving, pattern-focused (~150–180 problems).
- **Track C — Job search** (~1h, from Oct 1): applications, referrals, mock interviews.
- One lesson at a time; wait for me before moving on. **Compressed timeline does NOT mean
  skipping the explain-back or the exercise** — pace goes up, method does not change.

## After each topic (bookkeeping)
- Save notes → `notes/<NN>-<slug>.md`
- Save slides → `slides/<NN>-<slug>.html`  (for workshops)
- Update `PROGRESS.md` (tick item, update status + next action, add dated log line, DSA count)
- Commit & push.

## Goal (context)  (updated 2026-07-31)
Target focus: **AI Engineer + Android** (primary), broad in Backend. Aiming at a high
(product/MNC) standard → DSA + system design get strong emphasis.
**Timeline: 22 weeks, 2026-08-01 → 2026-12-31, at ~5–6h/day — target is a job in December 2026.**
The hard internal deadline is **Sept 30** (portfolio complete), because applications open **Oct 1**.
See the TARGET LOCKED + honest-expectation sections in `PROGRESS.md`.

## Notes
- The `portfolio/` folder is kept **local only** (not in this repo) — update it as projects ship.

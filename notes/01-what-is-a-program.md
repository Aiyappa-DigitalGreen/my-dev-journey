# 01 · What Is a Program?

**Learned:** 2026-08-03 · **Track A · W1 · Lesson 1 · Concept 1**
*Cheat sheet — built for a 2-minute re-read, not for reading once.*

---

## The one-line definition

> **A program is a list of instructions, written in a language the computer understands,
> that it follows one at a time, in order, exactly as written — without ever guessing
> what you meant.**

---

## Why programs exist (the PROBLEM)

The computer is a helper that is:

- **unbelievably fast** — thousands of operations a second
- **never bored, never tired** — task #1000 gets the same care as task #1
- **completely without common sense** — it cannot guess, ever

That third one is the whole problem. A human helper fills in the gaps. This one
falls into every gap you leave.

**A program is how you get useful work out of a fast, tireless helper that
understands nothing.**

---

## The PICTURE — the tea recipe

A program is a **recipe written for someone who has never cooked, has never seen
food, and does exactly what is written and nothing more.**

My own recipe, written naturally:

```
take water, boil it, add 1 tablespoon of tea powder,
boil for 5 more minutes, pour it to cup, add sugar
```

Executed with zero common sense:

| Step | What the computer did |
|------|----------------------|
| take water | Held it in bare hands. No vessel was ever created. Water on the floor. |
| boil it | Stove was never turned on. Nobody said to turn it on. |
| add tea powder | Added it **to the floor** — no container exists. |
| boil 5 **more** min | "More" refers to earlier boiling that never happened. |
| pour to cup | No cup exists. No straining step → leaves go in the drink. |
| add sugar | How much? Never said → **adds sugar forever.** |

Output: a floor, some leaves, and infinite sugar. 🫖

---

## ⭐ THE THREE PROPERTIES — the core of this topic

| # | Property | My own word for it | What breaks without it |
|---|----------|-------------------|------------------------|
| 1 | **EXACT** | *quantity* | The instruction is there but too vague to act on — *"take water"*: how much, into what? |
| 2 | **COMPLETE** | *process* | The instruction is **absent** — turn on the stove, strain the leaves. My brain patched these silently because my brain knows tea. |
| 3 | **ORDERED** | *"pour before water makes no sense"* | Every step present and precise, wrong sequence → cup gets filled before water exists. |

> **Every bug I will ever write is one of these three.** Not most — all. A 2am
> production crash is one of these three wearing a costume.

**Why I couldn't see the holes in my own recipe:** my brain auto-filled them. That
is exactly why the gaps are invisible to the person who wrote the code.

---

## 🧭 WHERE & WHEN

**WHERE it shows up** — the login screen of any app:

```
check email box isn't empty → check password isn't empty → send both to server
→ WAIT for the answer → if correct: open home screen → if wrong: show red error
```

- **exact** — which box, what counts as "empty"
- **complete** — the WAIT step. Drop it and the app opens the home screen before
  the server has answered.
- **ordered** — check before sending, never send before checking

**WHEN to reach for a program** — the task is **repetitive** and **rule-based**:
I can say the rules out loud, and I'll do it many times.

**WHEN NOT TO ← the senior signal**

- **When I'll do it twice.** Writing a program to rename 2 files costs more than
  renaming 2 files. Automating something rare is a **net loss**.
- **When it needs judgement, not rules.** If I can't say the rules out loud, I
  can't write them down.
- **When a tool already exists.** The fastest program is the one someone else wrote.

**FROM SCRATCH — step 1 is NOT typing code.** Step 1 is writing the steps in plain
English, exactly like the tea recipe. Every professional does this first.

---

## 🎤 Interview Q&A

**Q: "What is a program?"**
> A program is an ordered sequence of unambiguous instructions that a machine
> executes literally. The important word is *literally* — the machine supplies no
> intent of its own, so anything I leave implicit becomes a defect. In practice
> that means three requirements: the instructions must be precise, none may be
> missing, and the sequence must be correct.

**Q: "Why do experienced developers still write bugs?"**
> Because the gaps are invisible to the author. When I wrote a tea recipe I never
> mentioned turning on the stove — not carelessness, my brain filled it in
> automatically because I know how tea works. The same thing happens with domain
> knowledge in code: the step I never questioned is the step I never wrote. That's
> the argument for code review and tests — they're a second brain that doesn't
> share my assumptions.

**Q: "When would you decide NOT to automate something?"**
> When the frequency doesn't repay the build-and-maintain cost, when the task needs
> judgement I can't express as rules, or when a tool already solves it. Automation
> is an investment, and a program nobody needs is still code somebody has to
> maintain.

---

## 🔁 Recall prompt (say it OUT LOUD, no notes)

> *"A program is ______. It must be exact, complete and ordered, because ______.
> The tea recipe failed because ______."*

---

**Next:** Concept 2 — `println`, the first real instruction.

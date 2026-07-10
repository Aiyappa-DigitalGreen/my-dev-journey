# 🎓 My Dev Journey — Progress Tracker

> **THIS FILE IS THE SOURCE OF TRUTH.** Works across any device via GitHub.
> In any new chat, say:
> **"Read my Desktop/MyDevJourney/PROGRESS.md and continue teaching me from where I left off."**

---

## 👤 Who I am
- **Total beginner**, coding from zero. Teach me **like I'm 10** — simple words, analogies, explain all jargon.
- **Every topic:** 🧒 ELI5 → 💻 live code → 🏋️ exercise (in chat) → 🎤 Q&A recall → 📝 notes file in `notes/`.
- Math rusty → teach through code + intuition. Machine: 16GB RAM (Colab for heavy training).
- **Target focus (T-shaped):** PRIMARY = **AI Engineer + Android combo** ("mobile / on-device AI" niche); broad in Backend. ML + Deep Learning + Gen AI are learned as **foundations for AI Engineering**.
- **Ambition level:** aiming high (product/MNC standard) → so **DSA + System Design get strong emphasis**.
- **Learning flow:** **Android → Backend → AI/ML**.

---

## 🤖 HOW I LEARN IN THE AI ERA  (added 2026-07-01 — read this every session)
> AI tools now write huge amounts of code. That means my value is **judgment**, not typing.
> The whole plan below is aimed at making me the person who can **direct AI, catch its mistakes,
> and own the outcome** — the profile that's valuable *because* of AI, not replaced by it.

1. **Two modes — I train BOTH:**
   - 🔴 **AI-OFF** — I code from scratch, cold, no help. *Interviews give me a blank editor and no AI.*
     Every lesson's in-chat exercise is AI-OFF by default. This builds the raw muscle.
   - 🟢 **AI-ON** — I use AI to build faster, then **direct + judge** its output. This is the day job.
   Rule for both: **explain every line.** If I can't say *why* a line exists (mine or AI's), that's a
   gap → reteach. No copy-paste I can't defend.
2. **Reading & judging code > writing code.** When anyone can *generate* code, the scarce skill is
   spotting what's wrong with it. Every week includes "here's some code — what's broken / unsafe /
   slow about it?" review reps.
3. **Ship real, public projects.** Anyone can make a to-do app now. My differentiator is *shipped,
   deployed, working* things I can talk about like an engineer. The projects (Notes, Weather, RAG
   bot, capstone) are the **real deliverable** — the lessons just get me there.
4. **The moat = the skills AI is worst at:** system design, verification/testing, debugging,
   security judgement. These get strong, continuous emphasis.
5. **Spec-writing + prompting basics.** Breaking a fuzzy problem into a clear spec and giving AI good
   context (be specific · give examples · state constraints · iterate) is part of the job. I learn the
   *fundamentals*, not gimmicks — and it doubles as clear-thinking practice.
6. **English speaking, woven into the flow.** After each topic I explain it back **out loud in English**
   (Feynman), and I **speak** my interview-Q&A answers instead of just reading them. Goal: explain
   technical things clearly and confidently — the skill that decides interviews and standups.

⚠️ **Honest expectation:** I am **not** job-ready at 6 months. This is ~10–11 months, and even then
entry-level is competitive. What gets me hired = **2–3 genuinely impressive shipped projects + being
able to reason about them**, not finishing a checklist. DSA (~300–400 problems) is an **interview
gate** at MNCs — necessary to get in the door, but it's a hoop, not the daily job. Keep it moving,
don't let it eat the plan.

---

## 🔄 CONTINUE FROM ANY DEVICE
This folder is a GitHub repo: **github.com/Aiyappa-DigitalGreen/my-dev-journey**
- **Start of session:** `git -C ~/Desktop/MyDevJourney pull`
- Learn with Claude (`/teach` or "read PROGRESS.md and continue").
- **End of session:** `git -C ~/Desktop/MyDevJourney add -A && git -C ~/Desktop/MyDevJourney commit -m "progress" && git -C ~/Desktop/MyDevJourney push`
- **On a phone (no laptop):** open the Claude app, point it at the repo's PROGRESS.md, learn concepts/recall; update files next time you're on a laptop.

---

## 🧭 WHERE KEY TOOLS LIVE
| Topic | Where | Why there |
|-------|-------|-----------|
| **Git & GitHub** | Month 1, W4 (used every week after) | Version control habit + this repo |
| **SQL** | M3 W10 + **M4 W15 (deep dive)** + ML data | Core backend + data skill |
| **Excel / Spreadsheets** | M5 W17 (data on-ramp → pandas) | Gentlest intro to data thinking |
| **Command line** | Month 1, W4 | Needed for Git, Python, deploy |
| **DevOps basics** | Interlude after M4 (builds on M1 Git + M4 Docker/CI-CD/cloud) | Ship & run apps reliably |

---

## 🏋️ TWO PARALLEL DAILY TRACKS (~2 hrs/day)
- **Track A — SKILLS (~1 hr/day):** the monthly curriculum below.
- **Track B — DSA (~1 hr/day):** systematic problem-solving from Day 1, a strong foundation built over time.

---

## 📅 TRACK A — SKILLS ROADMAP  (flow: Android → Backend → AI/ML)
Legend: ⬜ not started · 🔄 in progress · ✅ done

### MONTH 1 — Programming Fundamentals + Kotlin
- 🔄 W1: Variables, types, operators, I/O, conditionals (`if/else`, `when`) · **🔴 AI-OFF code-from-scratch reps** · **🤖 first AI-ON rep + prompting basics (explain-every-line)** · **👓 first "what's wrong with this code?" review rep** · **🗣️ explain-back out loud in English**
- ⬜ W2: Loops, functions, collections (List/Map/Set), null safety · code-reading reps continue
- ⬜ W3: OOP — classes, inheritance, interfaces, sealed & data classes, lambdas, scope functions · **✍️ spec-writing: break a fuzzy task into a clear spec for AI**
- ⬜ W4: Coroutines intro, generics · **⭐ Git & GitHub** · **command line** · AI-assisted dev deep-dive (review + debug AI output) · console mini-project

### MONTH 2 — Android + Jetpack Compose (Part 1)
- ⬜ W5: Android Studio, project structure, Gradle basics, first Composable, Preview
- ⬜ W6: Compose UI — layouts, modifiers, text/images/buttons, theming
- ⬜ W7: State & recomposition, user input, lists (LazyColumn)
- ⬜ W8: Navigation, multi-screen → **Project: Notes app**

### MONTH 3 — Android Part 2: Architecture, Data, Networking (DEPTH — primary role)
- ⬜ W9: MVVM + MVI, ViewModel, StateFlow/Flow deeply, Clean Architecture + repository pattern
- ⬜ W10: Room database + **⭐ SQL basics**
- ⬜ W11: HTTP/REST/JSON, Retrofit, Dependency Injection (Hilt) → **Project: Weather app**
- ⬜ W12: Testing (unit + Compose UI), debugging/profiling, publish to Play Store → **Milestone: app live**

### MONTH 4 — Backend with Python + FastAPI
- ⬜ W13: Python crash course (fast)
- ⬜ W14: FastAPI — routes, request/response, JSON, REST design
- ⬜ W15: **⭐ SQL deep dive** (joins, aggregation, indexes, normalization) + PostgreSQL + SQLAlchemy + auth (JWT) + security basics
- ⬜ W16: Docker, CI/CD (GitHub Actions), cloud deploy, connect Android↔API → **Milestone: full-stack deployed**

### 🔧 DEVOPS BASICS — interlude (~2 weeks, right after Month 4)
*Just the essentials — not in depth. Consolidates the Git (M1) + Docker/CI-CD/cloud (M4) work into a clear mental model of "get code running reliably for real users."*
- ⬜ D1: Linux/shell essentials · **environment variables & secrets** (`.env`, keeping API keys safe) · SSH basics · what a "server" really is
- ⬜ D2: Docker deeper (images vs containers, `docker-compose`) · a full **CI/CD pipeline** (test → build → deploy) with GitHub Actions · **cloud deploy** + basic **logging & monitoring** · awareness of Infrastructure-as-Code · *(leads into "LLMOps" — deploying/serving AI models — in M7)*

### MONTH 5 — Data + ML Foundations  (AI/ML begins — foundation for Gen AI)
- ⬜ W17: **⭐ Data handling — Excel/Spreadsheets → pandas + NumPy** (dataframes, cleaning, pivots, basic viz)
- ⬜ W18: Math for ML (intuition): vectors/matrices, gradients, probability/stats — via code
- ⬜ W19: ML foundations + scikit-learn (workflow, train/test, regression, classification)
- ⬜ W20: Model evaluation + full ML mini-project → **Project: predictor / spam classifier**

### MONTH 6 — Deep Learning + On-device AI
- ⬜ W21: Neural networks explained + PyTorch basics (Colab)
- ⬜ W22: CNN image classifier (train + evaluate)
- ⬜ W23: Sequence models + the Transformer idea
- ⬜ W24: On-device AI (TensorFlow Lite/LiteRT, ML Kit) — run a model INSIDE Android

### MONTH 7 — AI Engineering (PRIMARY — go DEEP) 🔥
- ⬜ W25: LLM internals (tokens/embeddings/context/temperature) + prompt engineering + structured output
- ⬜ W26: Embeddings + Vector DBs (Chroma/FAISS/Pinecone) — semantic search
- ⬜ W27: RAG (chunking→index→retrieve→generate) → **build a RAG chatbot over my docs**
- ⬜ W28: Agents (tool use, ReAct) + Agentic AI + MCP & connectors + evals/guardrails/streaming/cost → **build an AI agent**

### MONTH 8 — Capstone (the centerpiece project)
- ⬜ W29: Capstone part 1 — Android app + FastAPI + on-device model + a RAG/agent feature
- ⬜ W30: Capstone part 2 — deploy everything, write docs
- ⬜ W31: Portfolio + GitHub + LinkedIn presence
- ⬜ W32: Buffer / polish / open-source contribution

### MONTHS 9–11 — ADVANCED PRACTICE & SYSTEM DESIGN
- ⬜ W33–36: System Design — LLD (SOLID, design patterns) + HLD (scaling, caching, DBs, queues, CAP) + mobile/API/LLM design
- ⬜ W37–40: Advanced DSA — hard timed sets, pattern drills, mixed problems
- ⬜ W41–44: Capstone polish + portfolio + building in public + start applying to roles

---

## 📈 TRACK B — DSA ROADMAP (daily, ~1 hr, starts Day 1)
Build to ~300–400 problems for a strong foundation. Log your count in the status section.
- ⬜ M1: Big-O, arrays, strings, two-pointers, hashmaps
- ⬜ M2: sliding window, stacks, queues, linked lists
- ⬜ M3: recursion, backtracking, binary search
- ⬜ M4: trees, BST, traversals (BFS/DFS)
- ⬜ M5: heaps/priority queues, tries, intervals
- ⬜ M6: graphs (BFS/DFS, topological sort, union-find, Dijkstra)
- ⬜ M7: dynamic programming (1D/2D, knapsack, LIS), greedy
- ⬜ M8: advanced DP, bit manipulation, pattern review
- ⬜ M9–11: hard mixed sets, timed practice, pattern mastery

---

## 🧠 Practice & recall (continuous)
Per-topic 🎤 Q&A every lesson · topic question banks in `notes/practice/` · system design + advanced DSA in the advanced phase.

## 🧵 Cross-cutting throughout
Git/GitHub · command line · SQL · debugging/profiling · testing · **DevOps basics** (Docker · CI/CD · cloud · secrets · logging/monitoring) · deployment · reading docs · building in public.

**AI-era skills woven into every week (added 2026-07-01):**
- **AI-OFF coding muscle** — regular code-from-scratch reps (interviews have no AI); every in-chat exercise is AI-OFF.
- **AI-ON dev** — use AI to build faster, then direct + judge it; *explain every line* (no crutch).
- **Code reading & review** — "what's wrong / unsafe / slow about this code?" reps each week.
- **Verification mindset** — never trust output (mine or AI's) until I've tested it; write tests early, not just in W12.
- **Spec-writing + prompting basics** — decompose fuzzy problems into clear specs + good context for AI.
- **Security judgement** — AI-generated code is often insecure; learn to spot the holes (grows through M3–M4).
- **🗣️ English speaking** — explain each topic back out loud; speak interview answers; build clarity + confidence.

---

## 📍 CURRENT STATUS
- **Phase:** Month 1 · Week 1 (both tracks begin together)
- **Last completed:** ✅ Track A W1 L1 — Kotlin variables (`val`/`var`, `$` interpolation). Exercise passed.
- **Next action:** **Track A** → W1 L2: types, operators & I/O (`readLine`). **Track B** → DSA: Big-O + arrays intro (starting now).
- **DSA problems solved:** 0
- **Notes written:** `01-kotlin-variables.md` (+ slide `01-kotlin-variables.html`)

## 📓 PROGRESS LOG (newest at top)
- **2026-07-01** — ✅ Track A W1 L1: Kotlin variables done — learner wrote a correct `val`/`var` + `$` program first try. Added a **3-layer interview-answer format** (simple → professional → glossary) per learner request to sound technical in interviews. Logged topic to REVIEW.md (due 07-02/04/08/22). Next: Track B DSA Big-O + arrays.
- **2026-07-01** — Added **two-mode practice** (🔴 AI-OFF code-from-scratch for interviews + 🟢 AI-ON direct/judge), **prompting basics**, and **🗣️ English speaking** (explain-back out loud + spoken interview answers) woven into the flow.
- **2026-07-01** — **AI-era realignment.** Added "How I learn in the AI era" principles (explain-every-line, read/judge > write, ship real projects, moat = system design/verification/debugging/security, spec-writing). Pulled AI-assisted coding + code-review reps forward to W1; made verification/security/spec-writing continuous cross-cutting skills. Honest expectation note added (not job-ready at 6mo; projects are the real deliverable; DSA = interview gate).
- **2026-07-01** — Added a light **DevOps Basics** interlude after Month 4 (Linux/shell, secrets, Docker/compose, CI/CD, cloud deploy, logging) + built-in understanding-first & spaced-repetition method.
- **2026-07-01** — Repo cleaned to a pure learning journey; portfolio kept local only.
- **2026-07-01** — Synced to GitHub at github.com/Aiyappa-DigitalGreen/my-dev-journey. Resumable from any device via git pull/push.
- **2026-07-01** — Plan finalized: AI Engineer + Android focus; two parallel daily tracks (Skills + DSA); ~10–11 months.

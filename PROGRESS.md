# 🎓 My Dev Journey — Progress Tracker

> **THIS FILE IS THE SOURCE OF TRUTH.** Works across any Claude account/computer/session.
> In any new chat, say:
> **"Read my Desktop/MyDevJourney/PROGRESS.md and continue teaching me from where I left off."**
> We'll push this `MyDevJourney/` folder to GitHub in Month 1 for full portability.

---

## 👤 Who I am
- **Total beginner**, coding from zero. Teach me **like I'm 10** — simple words, analogies, explain all jargon.
- **Every topic:** 🧒 ELI5 → 💻 live code → 🏋️ exercise (in chat) → 🎤 interview Q&A → 📝 notes file in `notes/`.
- Math rusty → teach through code + intuition. Machine: 16GB RAM (Colab for heavy training).
- **Target role (T-shaped):** PRIMARY = **AI Engineer + Android combo** ("mobile / on-device AI" niche); broad in Backend. **ML + Deep Learning + Gen AI are learned as FOUNDATIONS for AI Engineering** — NOT a separate ML-Engineer track (no heavy model-training-from-scratch career focus).
- **Company target:** **Product companies / MNCs** → hardest bar → **DSA + System Design are top priority**.
- **Learning flow:** **Android → Backend → AI/ML** (then Interview Intensive).

---

## 🧭 WHERE YOUR REQUESTED TOOLS LIVE (quick answer)
| Topic | Where it's taught | Why there |
|-------|-------------------|-----------|
| **Git & GitHub** | Month 1, W4 (then used every week after) | Version control is a daily habit + your portfolio |
| **SQL** (queries/joins/indexes) | Month 3 W10 (Room) + **Month 4 W15 (dedicated deep dive)** + reused in ML data | Huge MNC interview topic; backend needs it |
| **Excel / Spreadsheets** | **Month 5 W17** (data on-ramp → pandas) | Gentlest intro to data thinking before real ML data |
| **Command line** | Month 1, W4 | Needed for Git, Python, deploy |

---

## 🏋️ HOW THIS WORKS: TWO PARALLEL DAILY TRACKS (~2 hrs/day)
MNCs filter on DSA, so it runs EVERY DAY from Day 1 — like a gym habit — not saved for the end.
- **Track A — SKILLS (~1 hr/day):** the monthly curriculum below.
- **Track B — DSA (~1 hr/day):** systematic, building to ~300–400 problems.

---

## 📅 TRACK A — SKILLS ROADMAP  (flow: Android → Backend → AI/ML)
Legend: ⬜ not started · 🔄 in progress · ✅ done

### MONTH 1 — Programming Fundamentals + Kotlin
- ⬜ W1: Variables, types, operators, I/O, conditionals (`if/else`, `when`)
- ⬜ W2: Loops, functions, collections (List/Map/Set), null safety
- ⬜ W3: OOP — classes, inheritance, interfaces, sealed & data classes, lambdas, scope functions
- ⬜ W4: Coroutines intro, generics · **⭐ Git & GitHub** · **command line** · using AI tools to code · console mini-project

### MONTH 2 — Android + Jetpack Compose (Part 1)
- ⬜ W5: Android Studio, project structure, Gradle basics, first Composable, Preview
- ⬜ W6: Compose UI — layouts, modifiers, text/images/buttons, theming
- ⬜ W7: State & recomposition, user input, lists (LazyColumn)
- ⬜ W8: Navigation, multi-screen → **Project: Notes app**

### MONTH 3 — Android Part 2: Architecture, Data, Networking (DEPTH — primary role)
- ⬜ W9: MVVM + MVI, ViewModel, StateFlow/Flow deeply, Clean Architecture + repository pattern
- ⬜ W10: Room database + **⭐ SQL basics** (tables, CRUD, queries)
- ⬜ W11: HTTP/REST/JSON, Retrofit, Dependency Injection (Hilt) → **Project: Weather app**
- ⬜ W12: Testing (unit + Compose UI), debugging/profiling, publish to Play Store → **Milestone: app live**

### MONTH 4 — Backend with Python + FastAPI
- ⬜ W13: Python crash course (fast)
- ⬜ W14: FastAPI — routes, request/response, JSON, REST design (pagination/versioning/errors)
- ⬜ W15: **⭐ SQL DEEP DIVE** (joins, aggregation, indexes, normalization) + PostgreSQL + SQLAlchemy ORM + auth (JWT) + security basics
- ⬜ W16: Docker, CI/CD (GitHub Actions), cloud deploy, connect Android↔API → **Milestone: full-stack deployed**

### MONTH 5 — Data + ML Foundations  (AI/ML begins — foundation for Gen AI)
- ⬜ W17: **⭐ Data handling — Excel/Spreadsheets → pandas + NumPy** (dataframes, cleaning, pivots, basic viz)
- ⬜ W18: Math for ML (intuition): vectors/matrices, gradients, probability/stats — via code
- ⬜ W19: ML foundations + scikit-learn (workflow, train/test, regression, classification)
- ⬜ W20: Model evaluation + full ML mini-project → **Project: predictor / spam classifier** + ML system design intro

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

### MONTH 8 — Capstone (portfolio centerpiece)
- ⬜ W29: Capstone part 1 — Android app + FastAPI + on-device model + a RAG/agent feature
- ⬜ W30: Capstone part 2 — deploy everything, write docs
- ⬜ W31: Portfolio + GitHub + LinkedIn + resume that pass MNC screening
- ⬜ W32: Buffer / polish / open-source contribution

### MONTHS 9–11 — INTERVIEW INTENSIVE (the MNC gauntlet)
- ⬜ W33–36: System Design — LLD (SOLID, design patterns) + HLD (scaling, caching, DBs, queues, CAP) + mobile/API/LLM design
- ⬜ W37–40: DSA hard sets (timed), company-tagged problems, mixed pattern drills
- ⬜ W41–44: Mock interviews (**AI Engineer + Android + Backend**) + behavioral/STAR + **salary negotiation** + apply + referrals

---

## 📈 TRACK B — DSA ROADMAP (daily, ~1 hr, starts Day 1)
Build to ~300–400 problems. Log your count in the status section.
- ⬜ M1: Big-O, arrays, strings, two-pointers, hashmaps
- ⬜ M2: sliding window, stacks, queues, linked lists
- ⬜ M3: recursion, backtracking, binary search
- ⬜ M4: trees, BST, traversals (BFS/DFS)
- ⬜ M5: heaps/priority queues, tries, intervals
- ⬜ M6: graphs (BFS/DFS, topological sort, union-find, Dijkstra)
- ⬜ M7: dynamic programming (1D/2D, knapsack, LIS), greedy
- ⬜ M8: advanced DP, bit manipulation, pattern review
- ⬜ M9–11: hard mixed sets, timed mocks, company tags

---

## 🎤 Interview prep (continuous)
Per-topic 🎤 every lesson · domain question banks in `notes/interview/` (Kotlin/Android · Backend · SQL · ML · AI Eng · DSA · Behavioral) · system design + mocks in the Interview Intensive.

## 🧵 Cross-cutting throughout
Git/GitHub · command line · SQL · debugging/profiling · testing · Docker · CI/CD · cloud · deployment · reading docs · AI-assisted dev · building in public.

---

## 📍 CURRENT STATUS
- **Phase:** Month 1 · Week 1 (both tracks begin together)
- **Last completed:** _(nothing yet — plan finalized)_
- **Next action:** **Track A** → W1 L1: Variables in Kotlin (play.kotlinlang.org). **Track B** → DSA: Big-O + arrays intro.
- **DSA problems solved:** 0
- **Notes written:** _(none yet)_

## 🔄 CONTINUE FROM ANY DEVICE
This folder is a public GitHub repo: **github.com/Aiyappa-DigitalGreen/my-dev-journey**
Live portfolio: **aiyappa-digitalgreen.github.io/my-dev-journey/**
- **Start of session:** `git -C ~/Desktop/MyDevJourney pull`
- Learn with Claude (`/teach` or "read PROGRESS.md and continue").
- **End of session:** `git -C ~/Desktop/MyDevJourney add -A && git -C ~/Desktop/MyDevJourney commit -m "progress" && git -C ~/Desktop/MyDevJourney push`
- **On a phone (no laptop):** open the Claude app, point it at the repo's PROGRESS.md, learn concepts/Q&A; update files next time you're on a laptop.

## 📓 PROGRESS LOG (newest at top)
- **2026-07-01** — Synced to GitHub (public) at github.com/Aiyappa-DigitalGreen/my-dev-journey + GitHub Pages live for the portfolio. Now resumable from any device via git pull/push.
- **2026-07-01** — Privacy locked: everything LOCAL only, no cloud artifacts. Added `GUARDRAILS.md`, a `/teach` skill (auto-runs the course), a workshop `slides/_TEMPLATE.html`, and glowed-up standalone `portfolio/` (attractive dark animated hero, GitHub links activate as projects are built). Restored `Desktop/learning/` (pointer to here). Verified no other projects were lost.
- **2026-07-01** — Moved plan to new folder `MyDevJourney/`. Added explicit **Git/GitHub**, dedicated **SQL deep dive** (W15) + SQL basics (W10), and **Excel→pandas** data on-ramp (W17). Confirmed flow Android→Backend→AI/ML. Plan finalized: AI Engineer+Android primary, Product/MNC target, two parallel daily tracks (Skills+DSA), ~10–11 months. Ready to start.

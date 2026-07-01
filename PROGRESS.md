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
Git/GitHub · command line · SQL · debugging/profiling · testing · **DevOps basics** (Docker · CI/CD · cloud · secrets · logging/monitoring) · deployment · reading docs · AI-assisted dev · building in public.

---

## 📍 CURRENT STATUS
- **Phase:** Month 1 · Week 1 (both tracks begin together)
- **Last completed:** _(nothing yet — plan finalized)_
- **Next action:** **Track A** → W1 L1: Variables in Kotlin (play.kotlinlang.org). **Track B** → DSA: Big-O + arrays intro.
- **DSA problems solved:** 0
- **Notes written:** _(none yet)_

## 📓 PROGRESS LOG (newest at top)
- **2026-07-01** — Added a light **DevOps Basics** interlude after Month 4 (Linux/shell, secrets, Docker/compose, CI/CD, cloud deploy, logging) + built-in understanding-first & spaced-repetition method.
- **2026-07-01** — Repo cleaned to a pure learning journey; portfolio kept local only.
- **2026-07-01** — Synced to GitHub at github.com/Aiyappa-DigitalGreen/my-dev-journey. Resumable from any device via git pull/push.
- **2026-07-01** — Plan finalized: AI Engineer + Android focus; two parallel daily tracks (Skills + DSA); ~10–11 months.

# 07 · Authentication vs Authorization — who you are vs what you may do

**Learned:** 2026-09-28 · **Backend · Authentication · Concept 2**
*Cheat sheet — 2-minute re-read. No code yet.*
*Builds on: [06 · Why tokens exist](06-why-tokens-exist.md)*

---

## The PROBLEM — a valid token isn't enough

```
"Show me order #1001" + my token ✅   → mine → fine
"Show me order #1002" + my token ✅   → someone else's name, address, phone ❌
```

The token check **passes** — the server knows exactly who I am. So a **second** question is needed:
**does this data belong to the person asking?**

```
Check 1: token → who is this?        → Aiyappa ✅
Check 2: order #1002 → who owns it?  → Priya
         Aiyappa == Priya?           → ❌ refuse
```

**Both checks pass → data. Either fails → denied.** *(his own words)*

---

## The PICTURE — the hotel 🏨

| | Hotel | Name | Question |
|---|---|---|---|
| Front desk checks your ID, gives a key card | knows **who** you are | **AuthN** — Authentication | *Who are you?* |
| Card opens **Room 204 only**, not 205, not the manager's office | decides **where** you may go | **AuthZ** — Authorization | *What may you do?* |

**Memory trick:** auth-**N** = **N**ame · auth-**Z** = **Z**one. AuthN always comes first.

---

## Two different "no" answers

| Situation | Code | Meaning | Does logging in again help? |
|---|---|---|---|
| No / expired / fake token | **401 Unauthorized** | "I don't know **who** you are" | ✅ yes |
| Valid token, not your data | **403 Forbidden** | "I know you — **not allowed**" | ❌ no |

⚠️ "401 Unauthorized" really means **unauthenticated**. Bad name from decades ago. Interviewers love it.

---

## 💣 IDOR — the real-world bug

**Insecure Direct Object Reference:** the server checks the token (authN) but **forgets the
ownership check** (authZ) → change `1001` → `1002` → someone else's data. One of the most common
real security bugs. **Rule:** every request touching someone's data checks **who owns it**, on the
**server**. Hiding the button in the app is not protection — anyone can send requests directly.

---

## 🧭 Where & When
- **WHERE:** orders, chats, bank statements, profile edits · **roles** (admin deletes any post, user only their own).
- **WHEN:** any request that asks for a thing **by ID** → alarm: *"did I check who owns this?"*
- **WHEN NOT:** public data (restaurant list, public profile) — no owner to check.
- **FROM SCRATCH:** step 1 = write down, per piece of data, **who may see / change it**. Code comes after.

---

## 🎤 Interview Q&A

**Q1. AuthN vs AuthZ?** Authentication verifies *who* the user is (password/token). Authorization
decides *what* they may do (ownership, admin role). AuthN comes first — you can't decide
permissions for someone you haven't identified.

**Q2. 401 vs 403?** 401 = not authenticated (missing/expired/invalid token) → log in again.
403 = authenticated but not permitted → logging in again won't help.

**Q3 (senior). What is IDOR, how do you prevent it?** The API trusts a client-supplied ID without
checking ownership, so `/orders/1001` → `/orders/1002` leaks data. Prevent it with a server-side
ownership check on every object access; never rely on the UI hiding things.

---

## 5 reasoning questions (+ model answers)

1. **My token is valid. Why might the server still refuse me?**
   → AuthN passed, but AuthZ failed: the data isn't mine / my role isn't allowed → 403.
2. **Which check happens first, and why?**
   → Authentication. Permissions depend on *who* you are, so identity must be known first.
3. **The app never shows other users' orders. Is that enough protection?**
   → No. Anyone can send requests directly (change the ID). The server must check ownership.
4. **User gets 401. What should the app do? And for 403?**
   → 401: send to login (token missing/expired). 403: show "not allowed" — re-login won't fix it.
5. **Name a feature where authorization is about a *role*, not ownership.**
   → Admin panel: an admin may delete any post; a normal user only their own.

---

**Next (Concept 3):** Passwords — why storing them as plain text is a disaster → hashing + salt.

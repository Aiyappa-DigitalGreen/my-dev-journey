# 09 · Sessions & cookies: the server's notebook + the browser's pocket

**Learned:** 2026-10-06 · **Backend · Authentication · Concept 4**
*Cheat sheet, 2-minute re-read. No code yet.*
*Builds on: [06 · Why tokens exist](06-why-tokens-exist.md) · [07 · AuthN vs AuthZ](07-authn-vs-authz.md) · [08 · Passwords](08-password-hashing-salt.md)*

---

## The PROBLEM: the server forgets you after every request
HTTP is **stateless**: every request arrives like it's from a stranger.
```
POST /login  (username + password) → "Login OK ✅"
GET  /feed                         → "Who are you?" 🤨
```
Sending the password on every request = slow + risky (more chances to leak).

---

## The PICTURE: the forgetful bank clerk 🏦
| Bank | Web term |
|---|---|
| Clerk's notebook of customers | **Session store** (on the server) |
| One row in the notebook | **A session** |
| Card handed to you after the first ID check | **Session ID** |
| Wallet that shows the card automatically | **Cookie** |

*(He designed the notebook + card himself.)*

---

## Session = the record lives on the SERVER
```
Session store:   8f3k29xq7b → user: Aiyappa, logged in 10:30
```
The browser gets **only the ID**, never your details.

**Why a random ID, not `NAME: Aiyappa`?** A name can be **forged** (Ravi writes it on paper).
A random ID is impossible to **guess**, and means nothing without the server's notebook.

## Cookie = the browser stores it AND sends it automatically
```
Server → Set-Cookie: sessionId=8f3k29xq7b
Browser, on every later request → Cookie: sessionId=8f3k29xq7b
```
- A cookie is a **storage + delivery mechanism**, not a login method by itself.
- You write **no code** to send it; the browser does it for that website.

## Together
Session (server notebook) + cookie (carries the ID) = classic website login.
**Logout:** server deletes the notebook row → the card is now useless instantly.

---

## 🧭 Where & When
- **WHERE:** traditional websites: banking portals, admin panels, college sites.
- **WHEN:** browser-based app, one server you control, need instant logout/kick-out.
- **WHEN NOT:** mobile apps & public APIs. No browser cookie jar; use a **token** in a header (Concept 5).
  Also many servers sharing one notebook gets hard at scale.
- **FROM SCRATCH:** on login → create random ID → save `ID → user` → `Set-Cookie`. On each request → read cookie → look up → found = logged in, missing = **401**.

---

## 🎤 Interview Q&A
**Q1. What's the difference between a session and a cookie?**
A session is server-side state about a logged-in user. A cookie is a small value the browser stores and
sends automatically. They're commonly paired: the session ID travels in a cookie.

**Q2. Why must a session ID be random?**
So it can't be guessed or forged. The ID carries no meaning by itself; only the server's store maps it to a user.

**Q3 (senior). Sessions vs tokens: when would you choose sessions?**
Browser apps where instant revocation matters (logout, ban), and a single backend or shared store (e.g. Redis).
Tokens fit mobile/API clients and many stateless servers.

---

## 5 reasoning questions (+ model answers)
1. **Why can't the server remember me after login on its own?**
   → HTTP is stateless: each request is independent, with no memory of earlier ones.
2. **Where is my data in session-based login?**
   → On the server, in the session store. The browser only holds a random ID.
3. **Why not write the username in the cookie instead of a random ID?**
   → Anyone could forge it. A random ID can't be guessed, and is meaningless without the server's store.
4. **How does logout work with sessions?**
   → The server deletes the session row; the old ID now matches nothing → 401.
5. **Why don't Android apps usually use cookies for login?**
   → There's no browser auto-sending them; apps store a token and attach it to each request themselves.

---
**Explain-back (his words, 2026-10-06):** *"session is stored in server, cookie stores session id in browser"* ✅ (completed: + browser sends it automatically on every request).

**Next (Concept 5):** Tokens & JWT deeper: expiry, refresh tokens, why JWT logout is hard (the Instagram-30-days puzzle).

# 06 · Why tokens exist — the forgetful server & the wristband

**Learned:** 2026-09-28 · **Backend · Authentication · Concept 1** *(pulled forward from W12 at his request)*
*Cheat sheet — built for a 2-minute re-read. No code yet — this is the PROBLEM + PICTURE.*

---

## Three words first

| Word | Meaning | Example |
|------|---------|---------|
| **Client** | the thing that *asks* | Swiggy app on your phone |
| **Server** | a computer elsewhere that *answers* | Swiggy's computer in a data centre |
| **Request** | one message client → server | "show me my past orders" |

---

## The PROBLEM — the server forgets you after every request

> A server keeps **no memory between requests**. Every request arrives like a stranger.
> Official word: **stateless**.

- Request 1: "I'm Aiyappa + password" → ✅ welcome
- Request 2 (one second later): "show my orders" → 🤷 *who are you?*

**Naive fix:** send the password on every tap. It *works* (old "Basic Auth") — but the
password now travels ~1,000 times a week. More copies = more chances to leak.

---

## The PICTURE — the club wristband 🎟️

Pay + show ID **once** at the door → get a **wristband** → any bouncer lets you back in.
You don't hand over your **wallet** every time you re-enter.

> **Hand over something cheap to lose instead of the valuable secret.** *(he derived this himself)*

| | 🔑 Password | 🎟️ Token (wristband) |
|---|---|---|
| Works where | often **everywhere** (reused) | **only this service** |
| Lasts | years | **short — expires** |
| If stolen | change it everywhere | server **cancels it**, issues a new one |

---

## The flow

```
1. LOGIN (once)      App → Server : email + password
                     Server checks ✅ → App : token "a7f3k9x2..."
2. EVERY TAP AFTER   App → Server : "show my orders" + token
                     Server : valid token → it's Aiyappa ✅
```

- "Log out of all devices" (Google/Netflix) = server cutting off every wristband.
- Swiggy logging you out after weeks = the token expired.

---

## ⚠️ The misconception to kill

**A token is NOT an encrypted password.** It's a **new random string** the server invents.
- Encrypted password → can be *decrypted* back to the password ❌
- Random token → there's **no password inside** to recover ✅

---

## ❓ His follow-up: "What if I don't send the token?"

Take the wristband off → the bouncer treats you as a **stranger**. Same on the server:

```
App → Server : "show my orders"      (no token)
Server → App : 401 Unauthorized      ("prove who you are first")
App          : sends you to the Login screen
```

- **Rule:** missing · expired · fake · cancelled token → **all the same → 401 → log in again.** *(he predicted this himself)*
- **Public data needs no token.** Swiggy's restaurant list loads while logged out.
- **The app attaches the token automatically** to every request (one piece of code, e.g. a Retrofit interceptor — W8).
- 🤔 **Open puzzle → Concept 5:** tokens expire in 30 days, so why doesn't Instagram log you out every month? *(hint: refresh token)*

---

## 🧭 Where & When
- **WHERE:** every logged-in app — Swiggy, Instagram, banking apps.
- **WHEN:** any time a server must know *who* sent each request after login.
- **WHEN NOT:** public data (a restaurant list, a news feed anyone can read) — no identity needed, no token.
- **FROM SCRATCH:** step 1 = a login endpoint that checks the password and hands back a token.

---

## 🎤 Interview Q&A

**Q1. Password vs token?**
A password proves who you are and is long-lived, often reused across sites. A token is issued
by the server *after* the password is verified — random, scoped to one service, short-lived.
The password crosses the network once; a leaked token can be revoked without a password change.

**Q2. "HTTP is stateless" — what does that mean and why do we need tokens?**
Stateless = the server keeps no memory between requests, so every request must prove on its own
who it's from. Sending the password each time works but multiplies exposure; a token gives each
request that proof cheaply and safely.

---

## 5 reasoning questions (+ model answers)

1. **Why can't the server just "remember" me after login?**
   → Servers are stateless by design: each request is handled independently (often by
   different machines), so identity must travel *with* each request.
2. **Sending the password every request works — so what's wrong with it?**
   → The secret is exposed on every request; a single leak exposes a long-lived, reused secret.
3. **Why is losing a token less bad than losing a password?**
   → It only works for one service, expires soon, and can be cancelled; the password is reused
   and permanent.
4. **Is a token an encrypted version of my password?**
   → No. It's a random value unrelated to the password; nothing can be decrypted out of it.
5. **What does "log out of all devices" do on the server side?**
   → Invalidates every token issued to that account, so all those "wristbands" stop working.

---

**Next (Concept 2):** Authentication ("who are you?") vs Authorization ("what may you do?").

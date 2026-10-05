# 08 · Passwords — plain text ❌ → hashing → salt → slow blender

**Learned:** 2026-10-05 · **Backend · Authentication · Concept 3**
*Cheat sheet — 2-minute re-read. No code yet.*
*Builds on: [06 · Why tokens exist](06-why-tokens-exist.md) · [07 · AuthN vs AuthZ](07-authn-vs-authz.md)*

---

## The PROBLEM — the server must check your password without keeping it

**Database** = a giant spreadsheet on the server. Login = compare what you typed with the stored column.

| user | password |
|---|---|
| Aiyappa | `Coorg@1234` ← readable = **plain text** ❌ |

💥 **RockYou (2009):** plain-text table stolen → **32 million** readable passwords. People **reuse**
passwords → one small leak opens Gmail, bank, everything.

---

## Step by step — how he got there

| His idea | Verdict | Why |
|---|---|---|
| Encrypt it, decrypt at login | ❌ | Encryption needs a **key**; the key sits on the server; hacker steals both → unlocks **everyone**. 💥 **Adobe (2013)**, ~150M accounts. |
| Blend what I type the same way, compare the results | ✅ **HASHING** | *(he derived this himself)* — nothing is ever unlocked |
| Add something extra per user | ✅ **SALT** | *(his words: "add something extra to hashing data")* |

---

## The PICTURE — the smoothie blender 🥤

- **Hash** = one-way blender. **No key.** Smoothie can't become a banana again.
- Same fruit in → **same smoothie out**, every time → that's how login checks work.
- Change one letter → completely different hash:

```
Coorg@1234  →  a28ed1c3451948ba…
Coorg@1234  →  a28ed1c3451948ba…   same ✅
Coorg@1235  →  663a88b2e304d062…   totally different
```

**Signup:** store `hash(password)` only. **Login:** `hash(typed)` == stored? → ✅
→ That's why apps send a **reset link**: they genuinely don't know your old password.

---

## ⚠️ Three words — never mix them up *(he said "key" 4× — this is the gap)*

| Word | Picture | Job | Secret? |
|---|---|---|---|
| **Key** | key to a locked box | **unlocks** encrypted data | ✅ yes |
| **Hash** | the smoothie | one-way result, can't be unlocked | stored |
| **Salt** | pinch of salt | makes each user's hash **unique** | ❌ **no** |

> **Password storage = hash + salt. There is NO key anywhere.** Thinking "key" about passwords = the Adobe mistake.

---

## Why salt — the hacker's tricks without it

Hacker can't reverse… but can **blend guesses** and compare:
- **Dictionary attack** — blend `123456`, `password`, `qwerty`… → look for matches.
- **Duplicates** — same hash = same password → crack one, get all *(he spotted this: Aiyappa & Ravi)*.
- **Rainbow table** — guesses blended **once, in advance**, reused on every stolen database.

**Salt** = random string per user, blended in with the password:
```
x7Kq + Coorg@1234 → 87bab6ec…  (Aiyappa)
M2pz + Coorg@1234 → 819b5f17…  (Ravi)   same password, different hash ✅
```
- Stored **in plain sight** next to the hash — server needs it at login: `hash(x7Kq + typed)`.
- Not secret, and doesn't need to be: its job is **uniqueness**, not hiding. Kills duplicates + rainbow tables.

---

## 🐢 Why a SLOW blender — bcrypt / argon2

Salt stops shortcuts; hacker can still guess **one user at a time**.

| | one blend | you log in | 1 billion guesses |
|---|---|---|---|
| SHA-256 (fast) | ~1 billionth s | instant | **~1 second** 😱 |
| bcrypt (slow) | ~0.1 s | unnoticed | **~3 years** 🐢 |

> **You blend once; the hacker blends billions of times.** Slowness hurts them a billion times more.

bcrypt makes the salt for you and stores it inside its output: `$2b$12$<salt><hash>` (`12` = cost, turn it up over time).

---

## 🧭 Where & When
- **WHERE:** signup + login endpoints of every app with accounts; behind every "Forgot password?" link.
- **WHEN:** storing anything you only need to **check**, never **read back** (passwords, PINs, security answers).
- **WHEN NOT:** data you must read back (address, chat message) → **encryption**. Tokens → random strings, a different tool. **Never write your own blender** — use bcrypt/argon2 from a trusted library.
- **FROM SCRATCH:** signup → `bcrypt.hash(password)` → store only that. Login → `bcrypt.verify(typed, stored)`.

⚠️ **Hashing does not stop break-ins** (that's locks/AuthN). It makes stolen data **useless** — thieves leave with smoothies.

---

## 🎤 Interview Q&A

**Q1. How should passwords be stored?** Never plain text, never reversible encryption. Hash with a
slow, salted algorithm (bcrypt/argon2); at login, hash the input and compare.

**Q2. What's a salt — must it be secret?** A random per-user value mixed into the hash so identical
passwords give different hashes, defeating rainbow tables and hiding duplicates. Not secret — stored
beside the hash because verification needs it.

**Q3 (senior). Why not SHA-256 for passwords?** It's built to be fast — GPUs do billions/sec, so
brute force is cheap. bcrypt/argon2 are deliberately slow with a tunable cost (argon2 also
memory-hard), making each guess expensive for attackers but negligible for one real login.

---

## 5 reasoning questions (+ model answers)

1. **Why is encrypting passwords not good enough?**
   → The decryption key must live on the server; a breach usually takes the key too, unlocking every password.
2. **If nothing can be reversed, how does the server check my login?**
   → It hashes what I typed (with my stored salt) and compares it to the stored hash. Same input → same hash.
3. **Two users have the same hash in an unsalted table. What does the hacker learn?**
   → They share a password. Crack one, get both — and precomputed tables crack common ones instantly.
4. **The salt is stored in plain sight. Isn't that a leak?**
   → No. Its job is uniqueness, not secrecy; the server needs it to verify logins.
5. **Why is a slow hash better here when faster is usually better?**
   → The user hashes once per login (0.1 s unnoticed); the attacker hashes billions of guesses (years).

---

**Next (Concept 4):** Sessions & cookies — where does the wristband from lesson 06 actually live, and how does the server remember it?

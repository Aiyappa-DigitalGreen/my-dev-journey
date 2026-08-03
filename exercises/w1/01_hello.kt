// ============================================================
//  W1 · Lesson 1 · Concept 2 — println
//  Aiyappa · MyDevJourney
// ============================================================
//
//  Everything on a line after  //  is a COMMENT.
//  A comment is a note for HUMANS. The computer skips it entirely.
//  It is not an instruction. You could delete every // line in this
//  file and the program would behave exactly the same.
//
//  Why comments exist: your instruction list is read by other people
//  (and by you, six months later, having forgotten everything).
//
// ------------------------------------------------------------
//  About the line below —  fun main() {
//
//  This is the WRAPPER that holds your instruction list.
//  I am NOT explaining it yet. It is Concept 3, immediately after
//  this one. I am telling you it exists and that I owe you the
//  explanation, so you know I skipped nothing on purpose.
//
//  For right now, treat it as: "the instruction list starts here."
// ------------------------------------------------------------

fun main() {

    // 🏋️ YOUR TASK — write ONE line of code below this comment.
    //
    // Make the computer shout the words:   Hello Aiyappa
    //
    // The tool for shouting is:  println
    // Words that the computer should treat as plain text go inside
    // double quotes, like this:  "some words here"
    //
    // TODO: write your one line here
    println("Hello Aiyappa")


}

// ------------------------------------------------------------
//  HOW TO RUN THIS FILE
//
//  ⚠️ CORRECTED 2026-07-31. The old instruction here said:
//        kotlin ~/Desktop/.../01_hello.kt        <-- WRONG, this errors
//     because the  kotlin  command EXECUTES an already-translated
//     program; it cannot read a raw .kt source file.
//     Running a .kt file takes TWO steps:
//        kotlinc  = translate  (note the c = compile)
//        kotlin   = execute the translation
//     run.sh does both for you.
//
//  Open Terminal and paste these two lines:
//
//      cd ~/Desktop/MyDevJourney/exercises
//      ./run.sh w1/01_hello.kt
//
//  If it worked, the terminal prints:   Hello Aiyappa
// ------------------------------------------------------------

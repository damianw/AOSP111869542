Sample for AOSP Issue 111869542
===============================

This project reproduces [AOSP Issue 111869542](https://issuetracker.google.com/issues/111869542).

There are three drawables relevant to the issue:
- [`gradient_broken.xml`](app/src/main/res/drawable/gradient_broken.xml): uses both theme attributes
  and direct color references, causing the crash.
- [`gradient_working1.xml`](app/src/main/res/drawable/gradient_working1.xml): uses only direct color
  references, and works fine.
- [`gradient_working2.xml`](app/src/main/res/drawable/gradient_working1.xml): uses only theme
  attributes, and works fine.

Correspondingly, there are three activities which load each of the backgrounds:
-  [`BrokenActivity.kt` (In launcher as `GD: Broken`)](app/src/main/java/com/github/damianw/aosp111869542/BrokenActivity.kt): loads a layout
   containing `gradient_broken` as a background, and crashes.
-  [`WorkingActivity1.kt` (In launcher as `GD: Working1`)](app/src/main/java/com/github/damianw/aosp111869542/WorkingActivity1.kt):
   loads a layout containing `gradient_working1` as a background, and works fine.
-  [`WorkingActivity2.kt` (In launcher as `GD: Working2`)](app/src/main/java/com/github/damianw/aosp111869542/WorkingActivity2.kt):
   loads a layout containing `gradient_working2` as a background, and works fine.

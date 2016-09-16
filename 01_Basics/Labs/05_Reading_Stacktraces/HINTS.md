# Learn By Cloning
## Lesson: Basics
## Lab: 05

### Quiz

For each of these questions, you can read off the line that's producing the throwable easily - just read the stack trace.
If you're still unsure, either read the `README.md` or google "Reading Java stacktraces".

For the final question:
- Arrays will throw `ArrayIndexOutOfBoundsException` when you're accessing an invalid index.
- In this case, `myLongs.length` is an invalid index.
- It needs to be in `[0, myLongs.length)`. This syntax means `0 <= index < myLongs.length`.
- Fix the `for-loop` using your knowledge of flow control from the previous lab!

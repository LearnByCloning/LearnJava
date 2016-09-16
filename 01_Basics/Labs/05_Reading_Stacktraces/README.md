# Learn By Cloning
## Lesson: Basics
## Lab: 05

### Goal:
- Understand what Throwables, Exceptions, and Errors are.
- Understand how a Throwable is caught.
- Understand how to diagnose a Throwable and fix it. 

### What you need to do:
- Research what a Throwable is (the Oracle documentation is excellent for this)
- Research what an Exception is, and what an Error is (again, consult the Oracle documentation)
- Understand that a Throwable represents a run-time bug in your program, not a compile-time one.
- Research what the difference between an Exception and an Error is.
- Research the `try-catch` flow control operators (this has probably been demonstrated in documentation already)
- Research how to print a stacktrace given a Throwable object.

### How to read a stacktrace

#### Example 1
The following example is based on the attached file, `Example_01.java`. It is included in this directory.

You can follow along by compiling the file, and running it.

After running these commands, the following stacktrace is printed to the `STDERR` output stream. In Java, it is represented by the `System.err` variable.

```
Exception in thread "main" java.lang.NullPointerException
        at Example_01.main(Example_01.java:5)
```

##### Let's break down what exactly this stacktrace is telling us.
- The throwable is produced on the Thread called `main`. This is explained in more detail in the Threading lesson.
- The type of throwable being produced is a `java.lang.NullPointerException`.
    - A NullPointerException (commonly referred to as an NPE by Java pros) means that you are trying to access a `null` variable.
    - You could be trying to access a field or run a method: The exception is thrown in either case, as `null` implements no fields or methods.
- The exception occurred in the class named `Example_01`, in the method named `main`, which is inside of it.
- The exception occurred at `line 5` of the class `Example_01.java`.

#### Example 2
The following example is based on the attached file, `Example_02.java`. It is included in this directory.

You can follow along by compiling the file, and running it.

##### After running these commands, the following stacktrace is printed to the `STDERR` output stream.
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "hello world"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Example_02.getIntegerFromString(Example_02.java:11)
        at Example_02.main(Example_02.java:5)
```

##### Woah there! That's a lot more text! Why is that?
Well, a Java stacktrace tells you the methods that are called, and ultimately which line threw the throwable.

##### Let's break down what exactly this stacktrace is telling us.
- First of all, we can see that it's throwing a `java.lang.NumberFormatException`.
    - A NumberFormatException (no cool name for this one, sorry!) means that the String that we tried to parse doesn't represent a number!
    - For example, `"123"` represents a number but `"learning java"` doesn't.
- Next, we can see that the error message says `For input string: "hello world"`
    - In the case of NumberFormatException, this means that you've tried to find the number in the String `"hello world"` (which of course there isn't one)
- Next, we can see the call stack:
    - First, we run code inside `NumberFormatException.forInputString`. This isn't our code, so we'll move on.
    - Second, we run code inside `Integer.parseInt`. This isn't our code, so we'll move on.
    - Third, we run code inside `Integer.parseInt`. This also isn't our code so we'll move on.
    - Fourth, we run code inside `Example_02.getIntegerFromString`. This is our code! We might be doing something wrong here.
        - The exception is happening on `line 9` of `Example_02.java`.
        - So what is on line 9? Well, it's just a call to `Integer.parseInt`.
        - There's nothing wrong there, so that isn't the problem.
        - Therefore, the problem must be with the next line of the stack trace!
    - Fifth, we run code inside `Example_02.main`. This is our code! We MUST be doing something wrong here, since it's also the last line of the stack trace.
        - The exception is happening on `line 5` of `Example_02.java`.
        - So what is on line 5? Well, we're calling `Example_02.getIntegerFromString` with the argument `"hello world"`.
        - That's what it meant when it said that in the error message! Fantastic.
        - If we only call the method with a string that represents an integer, there is no error!
        - Now that we've successfully diagnosed where the exception is, we can fix it (well, you can... I'm not doing *all* of the work around here!)


### Conclusion:
- You should now be able to understand what Throwables, Exceptions, and Errors are.
- You should now be able to use a `try-catch` block to catch exceptions that are raised.
- You should now be able to read stack traces.

### Quiz:
##### I'm sorry that GFM doesn't render line numbers in code blocks. You'll just have to count. :(

Which line of the following code produces a Throwable?

What can be done to prevent it?
```java
public class App {

    public static void main(String[] args) {
        String myString = "helloWorld";
        myString = myString.substring(0, 11);
        System.out.println(myString);
    }

}
```

Which line of the following code produces an Error?
```java
public class App {

    public static void main(String[] args) {
        long[] myLongs = new long[1000 * 1000 * 1000 * 1000];
        System.out.println(myLongs);
    }

}
```
If you don't get an exception here, you've got a beastly computer.

Which line of the following code produces an Exception?

What can be done to prevent it?
```java
public class App {

    public static void main(String[] args) {
        long[] myLongs = new long[3];
        for (int i = 0; i <= myLongs.length; i++) {
            myLongs[i] = i;
        }
    }

}
```

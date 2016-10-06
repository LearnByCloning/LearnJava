# Learn By Cloning
## Lesson: Basics
## Lab: 07

### Goal:
- Understand what the Javadoc standard is, why it is useful and how to implement it
- Improve programming habits to encourage documentation

### Introduction to Javadoc
Javadoc is a tool which generates API documentation automatically. Developed by Oracle, it has widely become the standard for documentation of Java projects. 

The tool reads specially crafted comment blocks in the source code, which it then converts into a rich HTML for every class, field and method.

Here is an [example](http://docs.oracle.com/javase/1.5.0/docs/api/index.html) Javadoc generated website, which is the documentation for the J2SE v1.5 API.z

### Javadoc comment specifications
Javadoc comment blocks allow for special tags, which can be associated with many things - e.g. a method parameter or an exception which may be thrown.

### How to implement Javadoc comments
Unlike regular comments, Javadoc comment blocks begin with the `/**` tag, and closes with `*/`.

Example 1: A method which has been documented using the Javadoc standard:
```
/**
 * Calculate the difference between two doubles.
 * 
 * @param  x       the first number
 * @param  y       the second number
 * @return         The difference between x and y
 */
private double calculateDifference(double x, double y) {
    return x - y;
} 
```

Example 2: A method which capitalizes a name, but may throw an Exception:
```
/**
 * Capitalizes a name
 * 
 * @param  name                     the name to be capitalized
 * @return                          the capitalized name 
 * @throws IllegalArgumentException throws when name is null
 */
public String capitalizeName(String name) throws IllegalArgumentException {
    if (name == null) {
        throw new IllegalArgumentException();
    } else {
        return name.toUpperCase();
    }
}
```

### Practice
Try creating (or fixing) Javadoc for the following methods:
```
public void setAmount(int newAmount) {
   this.amount = newAmount;
}
```

```
public double getBalance() {
   return this.balance;
}
```

_Hint:_ NumberFormatException is thrown when a String does not contain any numeric characters. 
```
public int parseIntFromString(String input) throws NumberFormatException {
    return Integer.parseInt(input);
}
```

### Conclusion
Javadoc provides a simple but powerful method for code documentation. The examples above cover a very small scope of available tags, and only reference some style guidelines.
For more information, visit [Oracle's website](http://www.oracle.com/technetwork/articles/java/index-137868.html).
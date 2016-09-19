# Learn By Cloning
## Lesson: Object Oriented Programming
## Lab: 02

### Goal:
- Understand the `static` keyword
- Understand static fields
- Understand static methods
- Understand when it is appropriate in OOP to use `static`

### What you need to do:

As with multiple lessons in this section, we will be walking you through the information and how to utilize it.
Research any terms that are used which are unfamiliar.

#### Static in Fields

In the last lesson, you learned about fields of data in your objects. We created a `Cat` class (or "blueprint"). Static fields are fields of data which "global" if you will. Take the following code:

```java
public class Cat {
    static String phrase = "I hate dogs!";
    private final int id;
    private int age;
    private int weight;
    
    // You should already know what this method is.
    public Cat(int id, int age, int weight) {
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    public void print() {
        System.out.printf("I'm cat: %d! I'm %d years old and I weigh %d kilogram%s. My phrase is %s\n",
                id,
                weight,
                age,
                (weight != 1) ? "s" : "",
                phrase);
    }
}
```

The difference between this class and the one in the last lesson is that I added a static field named `phrase`. If any modifications were made to the field `phrase`, it would change for all the `Cat` objects/instances.

Let's say along side this class I have this main class:

```java
public class Example {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, 6, 2);
        Cat cat2 = new Cat(2, 4, 3);
        Cat cat3 = new Cat(3, 9, 1);

        cat1.print();
        Cat.phrase = "Meow!";
        cat1.print();
        cat2.print();
        cat3.print();
    }
}
```

Executing this code would give the following output:

```
I'm cat 1! I'm 6 years old and I weigh 2 kilograms. My phrase is I hate dogs!
I'm cat 1! I'm 6 years old and I weigh 2 kilograms. My phrase is Meow!
I'm cat 2! I'm 4 years old and I weigh 4 kilograms. My phrase is Meow!
I'm cat 3! I'm 3 years old and I weigh 1 kilogram. My phrase is Meow!
```

With the line `Cat.phrase = "Meow!"` I have changed the field's value for all the objects!
This displays the basic essence of static.

#### Static in Methods

You have actually used a static method before! Do you know how with every program we start with a method that looks like this:

```java
public static void main(String[] args) {

}
```

This is an example of a static method. A static method is simply a method which is in a class and is not within the scope of an instance.

That's a lot of fancy talk, let's simplify it:
 - Static methods cannot call methods which are inside the class that aren't static.
 - Static methods cannot read fields which are inside the class that aren't static.
 - Everything else is fine.

Here is some code to demonstrate this:

```java
public class Example {
    private static int mySpecialNumber = 2;
    private int randomNumber;

    public Example() {
        // don't expect to know learn what this does yet
        // Assume we are setting the field 'randomNumber' to a random number
        this.randomNumber = ThreadLocalRandom.instance().nextInt();
    }

    // This is our static method
    public static void printSpecialNumber() {
        // If the following line were uncommented, this code wouldn't
        // work, this is because 'randomNumber' is not static!
        // mySpecialNumber += randomNumber;
        Example example = new Example();

        // This works because we are accessing 'randomNumber' from within the object 'example'
        // and mySpecialNumber is static
        mySpecialNumber += example.randomNumber;
        System.out.println(mySpecialNumber);
    }
}
```

#### Appropriate usage of static

Coming soon.

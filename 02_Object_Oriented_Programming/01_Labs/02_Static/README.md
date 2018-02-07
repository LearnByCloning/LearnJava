# Learn By Cloning
## Lesson: Object Oriented Programming
## Lab: 02

### Goal:
- Understand the `static` keyword
- Understand static fields
- Understand static methods
- Understand when it is appropriate in OOP to use `static`

### What you need to do:

As with multiple labs in this section, we will be walking you through the information and how to utilize it.
Research any terms that are used which are unfamiliar.

#### Static in Fields

In the last lesson, you learned about fields of data in your objects. Earlier we created a Cat `class` (or "blueprint"). Remember how we found out that the data (fields, such as age and weight) of each instance of an `object` made from a specific `class` has its own data, in other words they don't share it, well what if you want to share this data? When you want to share the data amongst all instances of a `class` you call that field 'static'.

Lets modify our code from `Lab_01` to include a counter! We're going to count how many times a cat has been 'constructed!'.

```java
public class Example {
    public static void main(String[] args) {
        new Example();
    }

    public Example() {
        // We change how we're printing the cats!
        Cat cat1 = new Cat(1, 6, 2);

        cat1.print();

        Cat cat2 = new Cat(2, 4, 3);

        cat1.print();
        cat2.print();

        Cat cat3 = new Cat(3, 9, 1);

        cat1.print();
        cat2.print();
        cat3.print();
    }

    /*
     * Since our cat class is called an `inner class` (aka its a class inside a class (in our case the Example class))
     * We need to call it a `static` class to be able to use static fields in it. You don't need to understand this completely yet!
     */
    public static class Cat {
        // We start counter with the initial value of 0.
        public static int counter = 0;
        
        private final int id;
        private int age;
        private int weight;

        // You should already know what this method is.
        public Cat(int id, int age, int weight) {
            this.age = age;
            this.weight = weight;
            this.id = id;

            /*
             * Here we change the value of counter.
             * Remember this changes the value of counter for ALL cats!
             */
            counter++;
        }

        public void print() {
            System.out.printf("%d cat%s created so far! I'm cat: %d! I'm %d years old and I weigh %d kilogram%s.\n",
                    counter,
                    (counter != 1) ? "s" : "",
                    id,
                    age,
                    weight,
                    (weight != 1) ? "s" : "");
        }
    }
}
```

I want you to make this modification to your own Cat `class` and run it. What do you expect it to print?

```
1 cat created so far! I'm cat: 1! I'm 6 years old and I weigh 2 kilograms.
2 cats created so far! I'm cat: 1! I'm 6 years old and I weigh 2 kilograms.
2 cats created so far! I'm cat: 2! I'm 4 years old and I weigh 3 kilograms.
3 cats created so far! I'm cat: 1! I'm 6 years old and I weigh 2 kilograms.
3 cats created so far! I'm cat: 2! I'm 4 years old and I weigh 3 kilograms.
3 cats created so far! I'm cat: 3! I'm 9 years old and I weigh 1 kilogram.
```

Make sure you completely understand what happened here.

Lets get more technical with what static fields actually are. Static fields are independent of the creation of `objects`. In other words, you can access data inside `static` fields without creating an `object` from the `class` (blueprint). In our example above, we could access the counter by doing `Cat.counter`. That means the `counter` `variable` doesn't need an actual cat to be changed or accessed!

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

There is a simple rule of thumb regarding static:

For Methods:
 - Does it make sense for this method to exist without an instance of the class?

For example, assume you're writing a `Car` class. You have the following method: `double convertToKph(double Mph)`. Would this make sense to be static? Yes! The method makes sense without having an instance of the car. You can always do `double kph = Car.convertToKph(1231)`.

For fields:
 - Try not to do this. There are very few instances this makes sense and you'll notice in the code when we get there. (If you can't wait, look up Singletons)

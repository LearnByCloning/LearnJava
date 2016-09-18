# Learn By Cloning
## Lesson: Object Oriented Programming
## Lab: 01

### Goal:
- Understand what a `class` is.
- Understand what an `object` is.
- Understand the relationship between a `class` and an `object`.
- Understand how the Object Oriented Programming (OOP) paradigm helps development.

### What you need to do:

This lesson will be a little different than our previous ones. We're going to hold your hand through it so you have a better understanding of OOP. However, we still expect you to research some of the keywords and topics you encounter in this lab.

Open `Example_01/Example.java`

Read the comments inside the code and run it. Try to understand whats happening.

As you can see, we're defining a `class` called `Cat`. This `Cat` blueprint (class) has three `fields` of data. These fields are:

1. id
2. age
3. weight

We're writing something called a `constructor` to build an actual Cat (`object`) out of data we provide to that constructor. Remember, it is important to realize that the three cats we make do not share their information between each other. 
In other words no cat knows about the existence of another cat.

Now let's look at the method we made inside that class, we called it `print`. This method prints the cat's information to `System.out`. 

Now let me ask you a question, what would happen if you tried to do `Cat.print()`. What will it print? (Try it, we will cover this in the next lab)

### Conclusion:
- You should know what a `class` is.
- You should know how to create an `object` out of the class.
- You should understand how `methods` inside classes work.
- You should understand how `data` is handled between multiple objects made from a class.
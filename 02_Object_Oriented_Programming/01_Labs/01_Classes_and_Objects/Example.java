public class Example {
    // Reminder: This is the method thats always called first when the program starts.
    // Before looking at this part of the code, go down to "public class Cat"
    public static void main(String[] args) {
        new Example();
    }

    public Example() {
        Cat cat1 = new Cat(1, 6, 2);
        Cat cat2 = new Cat(2, 4, 3);
        Cat cat3 = new Cat(3, 9, 1);

        // Lets put these cats into a cat array!
        Cat[] cats = {cat1, cat2, cat3};

        /*
         * You should be familiar with this type of a loop.
         * We're going to be looping over each cat inside the cats array.
         * We're going to run the code inside the for once for each cat!
         */
        for (Cat cat : cats) {
            cat.print();
        }
    }

    // The class "Cat" is our "Blueprint" to make cats (cat objects).
    // Yes you can have a Class inside a class!
    public class Cat {
        // Research what final does.
        private final int id;

        // Lets make two fields for our cat, age and weight.
        private int age;
        private int weight;

        /**
         * This is called a constructor.
         * Think of this as our interface between the blueprint cat and constructing something out of that blueprint.
         *
         * @param id
         * @param age
         * @param weight
         */
        public Cat(int id, int age, int weight) {
            this.age = age;
            this.weight = weight;
            this.id = id;
        }

        public void print() {
            // How does printf work?
            // What does printing \n do?
            System.out.printf("I'm cat: %d! I'm %d years old and I weigh %d kilogram%s.\n",
                    id,
                    age,
                    weight,
                    // What am I doing on this line? (Hint: Research "inline if")
                    (weight != 1) ? "s" : "");
        }
    }
}

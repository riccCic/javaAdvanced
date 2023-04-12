package javaOopAdvanced._8;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog1 = new Dog("Carlino", 20.00, 35.00);
        System.out.println(dog1);

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird bird1 = new Bird(200.00, 100.00, 35.00);
        Fish fish1 = new Fish("Pesce palla", 10.00, 4.00);
        System.out.println(bird1);
        System.out.println(fish1);
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog = new Dog("Pastore tedesco", 120.00, 50.00);
        Fish fish = new Fish("Squalo", 130.00, 200.00);
        Bird bird = new Bird(200.00, 30, 40);
//        dog.runSpeedMetersPerSecond();
//        fish.runSpeedMetersPerSecond();
//        bird.runSpeedMetersPerSecond();



        if (dog.runSpeedMetersPerSecond()>fish.runSpeedMetersPerSecond() && dog.runSpeedMetersPerSecond()> bird.runSpeedMetersPerSecond() ){
            System.out.println("Il cane è piu veloce");
        }else if (fish.runSpeedMetersPerSecond()>dog.runSpeedMetersPerSecond() && fish.runSpeedMetersPerSecond()> bird.runSpeedMetersPerSecond()){
            System.out.println("Il pesce è più veloce");
        }else{
            System.out.println("L'uccello è piu veloce");
        }
    }
}

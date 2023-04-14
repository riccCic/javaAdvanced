package javaOopAdvanced._10;

public class Exercise {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Persona persona= new Persona("Riccardo Ciciriello",25,"Piazza la bomba è scappa");
        System.out.println(persona);
        System.out.println(persona.toString());
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Persona persona1=new Persona("Mario Rossi",32,"via D.Alighieri");
        Persona persona2=new Persona("Mario Rossi",32,"via D.Alighieri");
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        //ho capito che l'hashCode serve ha visualizzapere, con un interio, se i campi della classe Persona sono uguali o no
        //ho lasciato uguali, ma ovviamente se dovessi, cambiare i campi, l'int cambierebbe
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}


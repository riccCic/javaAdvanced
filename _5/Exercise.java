package javaOopAdvanced._5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
       // exercise2();
       // exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            System.out.println("si è verificato un errore 'e', verificare");
        } catch (Exception ioException) {
            System.out.println("si è verificato un errore, controllare");
        }
    }


    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
                                 //ho commentato l' esercizio, perchè ovviamente da un errore
        String userInputFileName = "test-file.txt";

        try {
            Files.readString(Path.of(userInputFileName));
        } catch (FileNotFoundException fileNotFoundException) {
//          fileNotFoundException.printStackTrace();
//          System.err.print("creami il file");
            System.out.println("il file non esiste");
            throw new RuntimeException(fileNotFoundException);

        } catch (IOException e) {
            System.out.println("creare il file, perchè non esiste");
           // e.printStackTrace();
            System.exit(0);
            throw new RuntimeException("crei un file");
        }catch (RuntimeException runtimeException){
            System.out.println("ciao");
            throw new RuntimeException("crei un file");
        }
    }



        /**
         * 3:
         *
         * Write a try-catch block that attempts to parse a string as an integer.
         *
         * In the catch block, print a message that informs the user that the input was not a valid integer.
         *
         *
         */
        private static void exercise3 () {
            System.out.println("\nExercise 3: ");
            // Your code here
                                         //ho commentato l' esercizio, perchè ovviamente da un errore
            try {
                Integer.parseInt("house");
                System.out.println();
            } catch (NumberFormatException numberFormatException) {
                System.out.println("non è una stringa valida");
                throw new RuntimeException("C'è un errore, coreggere");
            }
        }



        /**
         * 4:
         *
         * Write a try block that around this print statement that attempts to divide 2 numbers
         *
         * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
         *
         * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
         *
         */
        private static void exercise4 () {
            System.out.println("\nExercise 4: ");
            // Your code here

            Double num1 = 10.0;
            String num2AsString = "0.0";
             try{
            System.out.println(num1 / Double.parseDouble(num2AsString));
            }catch (ExceptionInInitializerError e){
                 System.err.println("errore");
                 throw new StringIndexOutOfBoundsException();
             }

            //questo esecizio "non ha" bisogno di un catch, perchè l'operazione si può fare, è mi entra nel cry

        }
    }


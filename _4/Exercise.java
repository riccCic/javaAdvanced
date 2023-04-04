package javaOopAdvanced._4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
           // Files.createFile(MY_PATH);

            Files.writeString(MY_PATH,myString);
            System.out.println("ho creato un file");
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
           // Files.readString(MY_PATH);
            System.out.println(Files.readString(MY_PATH));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split


        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(MY_PATH)))) {
            int numLines = 0;
            while (reader.readLine() != null) {
                numLines++;
            }
            System.out.println("Number of lines in file: " + numLines);
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
String newString1 = " ciao a tutti sono riccardo";
        File File = new File("ffile.txt");

        try {
            Files.writeString(Path.of("ffile.txt"),newString1);
            List<String> lines = Files.readAllLines(Path.of("ffile.txt"));
            int wordCount = 0;
            for (String line : lines) {
                String[] words = line.split("\\s+"); // split line into words, visto da internet
                wordCount += words.length;
            }
            System.out.println("il file contiene " + wordCount + " parole.");

            Files.delete(Path.of("ffile.txt"));
            System.out.println("File è stato cancellato con successo");
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}



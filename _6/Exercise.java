package javaOopAdvanced._6;


import chack_point.Conto;

import java.util.ArrayList;
import java.util.List;

import static javaOopAdvanced._6.Season.getDateRange;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO;

        }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        System.out.println(getDateRange(Season.SUMMER));
        System.out.println(getDateRange(Season.SPRING));
        System.out.println(getDateRange(Season.FALL));
        System.out.println(getDateRange(Season.WINTER));


    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        System.out.println(Semaforo.successivo(Semaforo.VERDE));
        System.out.println(Semaforo.successivo(Semaforo.GIALLO));
        System.out.println(Semaforo.successivo(Semaforo.ROSSO));
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        System.out.println(Days.isWeekend(Days.MONDAY));
        System.out.println(Days.isWeekend(Days.TUESDAY));
        System.out.println(Days.isWeekend(Days.THURSDAY));
        System.out.println(Days.isWeekend(Days.WEDNESDAY));
        System.out.println(Days.isWeekend(Days.FRIDAY));
        System.out.println(Days.isWeekend(Days.SATURDAY));
        System.out.println(Days.isWeekend(Days.SUNDAY));
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        System.out.println(Operazioni.calcola(Operazioni.ADDIZIONA, num1, num2));
        System.out.println(Operazioni.calcola(Operazioni.SOTTRAI, num1, num2));
        System.out.println(Operazioni.calcola(Operazioni.DIVIDI, num1, num2));
        System.out.println(Operazioni.calcola(Operazioni.MOLTIPLICA, num1, num2));
    }

}



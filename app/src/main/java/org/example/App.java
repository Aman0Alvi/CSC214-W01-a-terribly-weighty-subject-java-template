package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weight Converter!");

        Scanner scanner = new Scanner(System.in);

        int ounces = 0;
        boolean validInput = false;

        while (!validInput) { // I hate Java so much already, this is to fix java.util.InputMismatchException probs b/c of an initial blank input
            System.out.print("Please enter the weight in ounces: ");
            try {
                ounces = scanner.nextInt();
                if (ounces < 0) {
                    System.out.println("Please enter a non-negative number.");
                } else {
                    validInput = true; 
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
        }

        System.out.println("You entered: " + ounces + " ounces");

        Converter converter = new Converter();

        String poundsAndOunces = converter.toPoundsAndOunces(ounces);
        String poundsAsDecimal = converter.toPounds(ounces);

        System.out.println("Converted weight:");
        System.out.println("- " + poundsAndOunces);
        System.out.println("- " + poundsAsDecimal);

        System.out.println("Thank you for using the Weight Converter. Goodbye!");

        scanner.close();
    }
}

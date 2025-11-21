package basics;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Choose operation (+ - * /): ");
        String operation = scanner.next();

        int result = 0;

        if (operation.equals("+")) {
            System.out.println("Result: " + (numberOne + numberTwo));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (numberOne - numberTwo));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (numberOne * numberTwo));
        } else if (operation.equals("/")) {
            if (numberTwo == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                System.out.println("Result: " + (numberOne / numberTwo));
            }
        } else {
            System.out.println("That's not an operation.");
        }
    }
}

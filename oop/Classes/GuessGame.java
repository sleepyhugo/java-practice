package oop.Classes;

import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(50) + 1;
        int counter = 0;

        System.out.println("I'm thinking of a number between 1 and 50...");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            counter++;

            if (guess < randomNumber) {
                System.out.println("Too Low!");
            } else if (guess > randomNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("You got it!");
                break;
            }
        }

        System.out.println("It took you " + counter + " tries!");
    }
}

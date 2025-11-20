package oop.Classes;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = chars.charAt(random.nextInt(chars.length()));
            password.append(randomChar);
        }

        System.out.println("Generated password: " + password);
    }
}

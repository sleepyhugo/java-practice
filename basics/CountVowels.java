package basics;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        word = word.toLowerCase();

        int count = 0;
        for(int i = word.length() - 1; i > -1; i--){
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                count += 1;
            }
        }
        System.out.println("Vowel count: " + count);
    }
}

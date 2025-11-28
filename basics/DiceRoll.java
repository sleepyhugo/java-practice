package basics;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args){
        Random random = new Random();

        int randomNumber = random.nextInt(6) + 1;

        System.out.println(randomNumber);
    }
}

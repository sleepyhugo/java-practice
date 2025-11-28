package basics;

public class LargestNumber {
    public static void main(String[] args){
        int[] numbers = {3, 9, 1, 14, 7};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number: " + max);
    }
}

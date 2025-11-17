package basics;

public class CountDivisibleByFive {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers between 1 and 100 that are divisible by 5.");
    }
}

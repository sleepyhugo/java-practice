package basics;

public class SumToFifty {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 50; i++) {
            num = num + i;
        }
        System.out.println("The total sum from 1 to 50 is: " + num);
    }
}

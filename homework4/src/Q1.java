import java.util.Scanner;

public class Q1 {
    private static long[] memo = new long[71];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println(feb(n));
        input.close();
    }

    public static long feb(long n) {
        // System.out.println(n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (memo[(int) n] == 0) {
                memo[(int) n] = feb(n - 1) + feb(n - 2);
            }
            return memo[(int) n];
        }
    }
}
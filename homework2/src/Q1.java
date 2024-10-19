import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        for (long i = 1; i <= n; i++) {
            if (n % i == 0)
                if (n != i)
                    System.out.print(i + " ");
                else
                    System.out.print(i + "\n");
        }
        input.close();
    }
}
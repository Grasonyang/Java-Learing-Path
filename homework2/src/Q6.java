import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(String.valueOf('*').repeat(n - i));
        }
        for (int i = 1; i < n; i++) {
            System.out.println(String.valueOf('*').repeat(i + 1));
        }
        input.close();
    }
}

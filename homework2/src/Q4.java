import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += (i * (3 * i) * (5 * i));
        }
        System.out.println(total);
        input.close();
    }
}

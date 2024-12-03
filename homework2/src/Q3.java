import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 63 == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int total = 0;
        for (int i = n; i <= m; i++) {
            total += i * i;
        }
        System.out.println(total);
        input.close();
    }
}

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int x = gcd(Math.max(n, m), Math.min(n, m));
        System.out.println(x);
        System.out.println(n * m / x);
        scanner.close();
    }

    public static int gcd(int n, int m) {
        int r = n % m;
        if (r == 0) {
            return m;
        } else {
            return gcd(m, r);
        }
    }
}

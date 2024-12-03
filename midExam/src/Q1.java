import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X <= 0 || Z <= 0 || Y <= 1) {
                break;
            }
            int total = 0;
            int point = 0;
            int remain = 0;
            total += Z / X;
            remain = Z % X;
            point += total;
            while (point >= Y) {
                int a = point / Y;
                total += a;
                point = point % Y + a;
            }
            System.out.println(total + " " + remain + " " + point);
        }
        sc.close();
    }
}
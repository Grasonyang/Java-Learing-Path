import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte n, m;
        long total = 0;
        n = input.nextByte();
        m = input.nextByte();
        for (byte i = n; i <= m; i++) {
            total += Math.pow(2, i);
        }
        System.out.println(total);
        input.close();
    }
}

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long arr[] = new long[n + 2];
        long total = 1;
        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * 2 + i;
            total += arr[i];
        }
        System.out.println(total);
        input.close();
    }
}

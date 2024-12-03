import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = input.nextInt();
            v[i] = input.nextInt();
        }
        int maxWeight = input.nextInt();
        int[] dp = new int[maxWeight + 1];
        for (int i = 0; i < n; i++) {
            for (int j = maxWeight; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        System.out.println(dp[maxWeight]);
        input.close();
    }
}

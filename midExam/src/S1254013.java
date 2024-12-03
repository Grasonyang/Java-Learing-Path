// Mike和他的朋友打算開2部車去度假，但因為大家準備的行李太多了，他們希望2部車所載運的行李可以平均分配，也就是2部車子的行李重量要一樣重。
// 請寫一程式來判斷是否可能達成這個目標。請注意，每件行李是不可以分開的。

// 輸入說明 ：
// 輸入資料中第一列為一整數n，代表接下來有n組測試資料。
// 每組測試資料一列。含有 k 個正整數 （ 1 <= k <= 30），分別代表這 k 個行李的重量。所有行李重量的總和不會超過 300。

// 輸出說明 ：
// 對每組測試資料輸出一列，如果這 k 個行李可以分成總重量相同的2堆，請輸出 1，否則輸出0。

// 範例輸入 ：
// 5
// 1 2 4 7 12
// 1 2 1 2 1
// 2 3 4 1 2 5 10 50 3 50
// 3 5 2 7 1 7 5 2 8 9 1 25 15 8 3 1 38 45 8 1
// 1 2 3 4 5 6 7 8 9 10 11 12 13 93

// 範例輸出 ：
// 1
// 0
// 1
// 1
// 0
import java.util.Scanner;

public class S1254013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] results = new int[n];
        scanner.nextLine();
        for (int i = 0; i < results.length; i++) {
            String line = scanner.nextLine();
            String[] ws = line.split(" "); // string numbers
            int[] w = new int[ws.length];
            int total = 0;
            for (int j = 0; j < ws.length; j++) {
                w[j] = Integer.parseInt(ws[j]);
                total += w[j];
            }
            if (total % 2 != 0) { // 判斷平均
                results[i] = 0;
                continue;
            }
            int target = total / 2;
            boolean[] dp = new boolean[target + 1];
            dp[0] = true;
            for (int j = 0; j < w.length; j++) {
                for (int k = target; k >= w[j]; k--) { // 01由後到錢
                    if (dp[k - w[j]]) {
                        dp[k] = true;
                    }
                }
            }
            results[i] = dp[target] ? 1 : 0;
        }
        for (int result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
}

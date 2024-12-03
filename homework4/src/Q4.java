import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            jobs[i] = new Job(a, b);
        }
        Arrays.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job a, Job b) {
                return Integer.compare(a.end, b.end);
            }
        });
        int count = 0;
        int lastEndTime = 0;

        for (Job job : jobs) {
            if (job.start >= lastEndTime) {
                count++;
                lastEndTime = job.end;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

class Job {
    int start, end;

    Job(int a, int b) {
        start = a;
        end = b;
    }
}

// 有n個工作可以執行，給定每個工作的開始時間與結束時間，時間從0開始，開始與結束時間都是整數，只有一台機器可以執行，每次只能執行一個工作，且工作開始做就需要做完，機器執行中不能跳到另一個工作，可以一結束就馬上接著執行另一個工作，機器更換工作很快，可以不考慮切換所需時間，請計算執行完後最多有幾個工作被完成？

// 輸入說明
// 每次輸入數字n，n表示需要執行的工作個數，輸入n小於100，之後有n行分別是每一行兩個整數s與e，s表示工作的開始時間與e表示工作的結束時間，且s永遠小於e。
// 輸出說明
// 輸出一個數字，表示結束時最多有幾個工作被完成。

// 輸入範例
// 5
// 1 10
// 2 4
// 3 6
// 2 5
// 4 9

// 輸出範例
// 2

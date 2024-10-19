import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> ans = new Vector<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            if (checkPADandPRI(m)) {
                ans.add(m);
            }
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.elementAt(i) + " ");
        }
        input.close();
    }

    public static boolean checkPADandPRI(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        String s = Integer.toString(n);
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str += " ";
        String ans = "";
        int continues = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                continues++;
            } else {
                if (continues >= 3) {
                    ans += continues + "" + str.charAt(i - 1);
                } else if (continues == 2) {
                    ans += str.charAt(i - 1);
                    ans += str.charAt(i - 1);
                } else {
                    ans += str.charAt(i - 1);
                }
                continues = 1;
            }
        }
        System.out.println(ans);
        input.close();
    }
}
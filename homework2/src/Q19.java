import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        String text = str.split(" ")[0];
        String letter = str.split(" ")[1];
        int a = text.indexOf(letter), b;
        while (a != -1) {
            b = text.indexOf(letter, a + 1);
            if (b != -1) {
                System.out.print((b - a) + " ");
                a = b;
            } else {
                break;
            }
        }
        input.close();
    }
}

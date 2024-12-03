import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int count2 = 0, count4 = 0, count6 = 0, count8 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '2':
                    count2++;
                    break;
                case '4':
                    count4++;
                    break;
                case '6':
                    count6++;
                    break;
                case '8':
                    count8++;
                    break;
            }
        }
        System.out.println("2 " + count2);
        System.out.println("4 " + count4);
        System.out.println("6 " + count6);
        System.out.println("8 " + count8);
        input.close();
    }
}

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println(format.format(length*width));
        scanner.close();
    }
}

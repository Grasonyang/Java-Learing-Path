import java.util.Scanner;
import java.text.DecimalFormat;

public class Q7 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        double tmp = scanner.nextDouble();   
        System.out.println(format.format((tmp-32)*5/9));
        scanner.close();
    }
}

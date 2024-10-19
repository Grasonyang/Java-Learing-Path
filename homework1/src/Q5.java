import java.util.Scanner;
import java.text.DecimalFormat;

public class Q5 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        double up = scanner.nextDouble();
        double down = scanner.nextDouble();
        double height = scanner.nextDouble();        
        System.out.println(format.format((up+down)*height/2));
        scanner.close();
    }
}

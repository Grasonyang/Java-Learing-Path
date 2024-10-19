import java.util.Scanner;
import java.text.DecimalFormat;

public class Q8 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        double radius = scanner.nextDouble();   
        System.out.println(format.format(radius));
        System.out.println(format.format(2*radius*Math.PI));
        System.out.println(format.format(radius*radius*Math.PI));
        scanner.close();
    }
}

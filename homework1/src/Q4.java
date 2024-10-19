import java.util.Scanner;
import java.text.DecimalFormat;

public class Q4 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Height = "+format.format(height));
        System.out.println("Width = "+format.format(width));
        System.out.println("Perimeter = "+format.format((height+width)*2));
        System.out.println("Area = "+format.format(height*width));
        scanner.close();
    }
}

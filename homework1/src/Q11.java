import java.util.Scanner;
import java.text.DecimalFormat;

public class Q11 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");
        Double x1=scanner.nextDouble();
        Double y1=scanner.nextDouble();
        Double x2=scanner.nextDouble();
        Double y2=scanner.nextDouble();
        System.out.println(format.format(Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2))));
        scanner.close();
    }
}

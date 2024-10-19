import java.util.Scanner;
import java.text.DecimalFormat;

public class Q10 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.0");
        Double min=scanner.nextDouble();
        Double sec=scanner.nextDouble();
        Double km=scanner.nextDouble();
        Double ss=min*60+sec;
        ss=ss/3600;
        km=km/1.6;
        System.out.println(format.format(km/ss));
        scanner.close();
    }
}

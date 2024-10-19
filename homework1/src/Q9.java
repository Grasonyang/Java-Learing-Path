import java.util.Scanner;
import java.text.DecimalFormat;

public class Q9 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.0");
        Double[] numbers = new Double[5];
        Double sum=0.0;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextDouble();
            sum+=numbers[i];
        }
        System.out.println(format.format((sum)));
        System.out.println(format.format((sum/numbers.length)));
        scanner.close();
    }
}

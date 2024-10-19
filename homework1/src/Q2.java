import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        String grade1=scanner.nextLine();
        String grade2=scanner.nextLine();
        String grade3=scanner.nextLine();
        System.out.println(name+" "+grade1+","+grade2+","+grade3);
        scanner.close();
    }
}

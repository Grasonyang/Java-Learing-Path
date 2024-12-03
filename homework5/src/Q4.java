import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入三個點座標: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);

        System.out.println("與原點距離: " + A.distance() + " " + +B.distance() + " " + +C.distance());
        System.out.println("任兩點距離: " + A.distance(B) + " " + B.distance(C) + " " + A.distance(C));

        double maxDistance = A.distance(B);
        char ans1 = 'A', ans2 = 'B';
        if (B.distance(C) > maxDistance) {
            maxDistance = B.distance(C);
            ans1 = 'B';
            ans2 = 'C';
        }
        if (A.distance(C) > maxDistance) {
            maxDistance = A.distance(C);
            ans1 = 'A';
            ans2 = 'C';
        }
        System.out.println("距離最遠的兩個點: " + ans1 + " " + ans2);
        scanner.close();
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
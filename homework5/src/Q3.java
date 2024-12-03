import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input like x=7, y=8, z=9, radius=10
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int z1 = input.nextInt();
        double r1 = input.nextDouble();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int z2 = input.nextInt();
        double r2 = input.nextDouble();

        CSphere a = new CSphere(x1, y1, z1, r1);
        CSphere b = new CSphere(x2, y2, z2, r2);
        a.print();
        b.print();
        System.out.println("2 求中心的距離" + a.distance(b));
        if (a.isIntersect(b)) {
            System.out.println("2 球體有碰觸");
        } else {
            System.out.println("2 球體沒有碰觸");
        }
        input.close();
    }
}

class CSphere {
    private int x; // 圓心的x 座標
    private int y; // 圓心的y 座標
    private int z; // 圓心的z 座標
    private double radius; // 圓球的半徑

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double getR() {
        return radius;
    }

    public CSphere(int a, int b, int c, double r) {
        x = a;
        y = b;
        z = c;
        radius = r;
    }

    public double distance(CSphere b) {
        int x2 = b.getX();
        int y2 = b.getY();
        int z2 = b.getZ();
        int t = (x2 - x) * (x2 - x) + (y2 - y) * (y2 - y) + (z2 - z) * (z2 - z);
        return Math.sqrt(t);
    }

    public boolean isIntersect(CSphere b) {
        double d = distance(b);
        double r1 = radius;
        double r2 = b.getR();
        return d <= r1 + r2;
    }

    public void print() {
        System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", radius=" + radius);
    }
}
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, r;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        r = input.nextInt();
        CSphare n = new CSphare();
        n.setLocation(x, y, z);
        n.setRadius(r);
        n.showCenter();
        System.out.println(n.surfaceArea());
        System.out.println(n.volume());

        input.close();
    }
}

class CSphare {
    private int x;
    private int y;
    private int z;
    private int redius;

    public void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setRadius(int r) {
        this.redius = r;
    }

    public double surfaceArea() {
        return 4 * Math.PI * redius * redius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * redius * redius * redius;
    }

    public void showCenter() {
        System.out.println("x=" + x + " y=" + y + " z=" + z);
    }

}
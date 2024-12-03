public class Q2 {
    public static void main(String[] args) {
        CShape shp[] = new CShape[6];
        shp[0] = new CCircle(2.0);
        shp[1] = new CCircle(3.0);
        shp[2] = new CSquare(4.0);
        shp[3] = new CSquare(5.0);
        shp[4] = new CTriangle(3.0, 3.0);
        shp[5] = new CTriangle(5.0, 4.0);
        System.out.printf("面積1 = %.2f\n", shp[0].area());
        System.out.printf("面積2 = %.2f\n", shp[1].area());
        System.out.printf("面積3 = %.2f\n", shp[2].area());
        System.out.printf("面積4 = %.2f\n", shp[3].area());
        System.out.printf("面積5 = %.2f\n", shp[4].area());
        System.out.printf("面積6 = %.2f\n", shp[5].area());
        System.out.printf("面積最大 =%.2f\n", shp[0].largest());
    }
}

class CShape {
    private static double largestarea = 0.0;

    public double area() {
        return 0.0;
    }

    public void update() {
        if (this.area() > largestarea) {
            largestarea = this.area();
        }
    }

    public double largest() {
        return largestarea;
    }
}

class CCircle extends CShape {
    private double r;

    CCircle(double r) {
        this.r = r;
        this.update();
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class CSquare extends CShape {
    private double r;

    CSquare(double r) {
        this.r = r;
        this.update();
    }

    public double area() {
        return this.r * this.r;
    }
}

class CTriangle extends CShape {
    public double area(double h, double w) {
        return w * h / 2;
    }
}

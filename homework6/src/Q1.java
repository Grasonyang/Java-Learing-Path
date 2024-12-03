public class Q1 {
    public static void main(String[] args) {
        CCircle cir1 = new CCircle(2.0);
        CCircle cir2 = new CCircle(3.0);
        CSquare squ1 = new CSquare(4.0);
        CSquare squ2 = new CSquare(5.0);
        CTriangle tri1 = new CTriangle(3.0, 3.0);
        CTriangle tri2 = new CTriangle(5.0, 4.0);
        System.out.printf("面積1 = %.2f\n", cir1.area());
        System.out.printf("面積2 = %.2f\n", cir2.area());
        System.out.printf("面積3 = %.2f\n", squ1.area());
        System.out.printf("面積4 = %.2f\n", squ2.area());
        System.out.printf("面積5 = %.2f\n", tri1.area());
        System.out.printf("面積6 = %.2f\n", tri2.area());
        System.out.printf("面積最大 =%.2f\n", cir1.largest());
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
    private double h, w;

    CTriangle(double h, double w) {
        this.h = h;
        this.w = w;
        this.update();
    }

    public double area() {
        return this.w * this.h / 2;
    }
}

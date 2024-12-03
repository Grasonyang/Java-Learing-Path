import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CTriangle triangle1 = new CTriangle();
        CTriangle triangle2 = new CTriangle(30, 10, "red");
        triangle1.show();
        triangle2.show();
        scanner.close();
    }
}

/**
 * The CTriangle class represents a triangle with a base, height, and color.
 * It provides methods to set these properties and display them.
 * 
 * This class includes:
 * 
 * (a) Methods setB(), setH(), and setColor() to set the base, height, and color
 * of the triangle.
 * 
 * (b) A no-argument constructor CTriangle() that initializes the base to 10,
 * height to 5, and color to "blue".
 * 
 * (c) A parameterized constructor CTriangle(int b, int h, String c) that
 * initializes the base, height, and color using the provided values.
 * 
 * (d) A show() method to print the base, height, and color of the triangle.
 * 
 * (e) In the main method, two CTriangle objects are created using the
 * no-argument and parameterized constructors, and their properties are printed.
 */
class CTriangle {
    private int base;
    private int height;
    private String color;

    public void setB(int b) {
        base = b;
    }

    public void setH(int h) {
        height = h;
    }

    public void setColor(String c) {
        color = c;
    }

    public CTriangle() {
        base = 10;
        height = 5;
        color = "blue";
    }

    public CTriangle(int b, int h, String c) {
        setB(b);
        setH(h);
        setColor(c);
    }

    public void show() {
        System.out.println("Color=" + color);
        System.out.print("Base=" + base + ", ");
        System.out.println("Height=" + height);

    }
}

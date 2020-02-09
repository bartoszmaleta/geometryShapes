package main.java.com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        super("Rectangle", "2a + 2b", "axb");
        checkIfArgsGreaterThanZero(a, b);
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        double area = a*b;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * a + 2 * b;
        return perimeter;
    }

    public String toString() {
        return "Rectangle, a = " + this.a + ", b = " + this.b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}

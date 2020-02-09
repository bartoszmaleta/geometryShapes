package main.java.com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        checkIfArgsGreaterThanZero(a, b);
        this.a = a;
        this.b = b;
        super.name = "Rectangle";
        
    }

}

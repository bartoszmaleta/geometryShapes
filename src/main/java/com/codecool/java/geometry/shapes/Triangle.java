// package com.codecool.java.geometry.shapes;
package main.java.com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    private float a, b, c;

    public Triangle(String name, String areaFormula, String perimeterFormula, float a, float b, float c) {
        super("Triangle", "sqrt(s(s-a)(s-b)(s-c))", "a + b + c");
        checkIfArgsGreaterThanZero(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double calculateArea(){
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }

    public double calculatePerimeter(){
        double perimiter = a + b + c;
        return perimiter;
    }

    public String toString(){
        return "Triangle, a = " + this.a + ",b = " + this.b + ",c = " + this.c;
    }

    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

    public float getC(){
        return this.c;
    }
}

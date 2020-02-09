// package com.codecool.java.geometry.containers;
package main.java.com.codecool.java.geometry.containers;

import java.util.List;
import java.util.ArrayList;
import java.util.Formatter;

import main.java.com.codecool.java.geometry.shapes.Shape;

public class ShapeList {

    private List<Shape> shapes;

    public ShapeList() {
        this.shapes = new ArrayList<Shape>();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }

    public String getShapesTable() {
        String tableInfo = "";
        int tableLen = 136;
        tableInfo += "\n";

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = this.getShapeAt(i);
            // Shape shape = this.getShape(i);

            String shapeName = shape.getName();
            String shapeParemetersInfo = shape.toString();
            double perimeter = shape.calculatePerimeter();
            double area = shape.calculateArea();
            String perimeterFormula = shape.getPerimeterFormula();
            String areaFormula = shape.getAreaFormula();

            for (int j = 0; j < tableInfo.length(); j++) {
                tableInfo += "-";
            }
            tableInfo += "\n";

            Formatter formatter = new Formatter();
            tableInfo += formatter.format("| %2d | %20s | %38s | %6.2f | %10s | %6.2f | %27s |\n", i, shapeName, shapeParemetersInfo, perimeter, perimeterFormula, area, areaFormula);
            // tableInfo += "\n";
        }

        for (int j = 0; j < tableLen; j++) {
            tableInfo += "-";
        }
        tableInfo += "\n";
        System.out.println(tableInfo);
        return tableInfo;
    }

    public Shape getLargestShapeByArea() {
        Shape largestAreaShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.calculateArea() > largestAreaShape.calculateArea()) {
                largestAreaShape = shape;
            }
        }
        return largestAreaShape;
    }

    public Shape getLargestShapeByPerimeter() {
        Shape largestPerimeterShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.calculatePerimeter() > largestPerimeterShape.calculatePerimeter()) {
                largestPerimeterShape = shape;
            }
        }
        return largestPerimeterShape;
    }

    public int shapesLen() {
        int lengthOfShapesList = shapes.size();
        return lengthOfShapesList;
    }


}

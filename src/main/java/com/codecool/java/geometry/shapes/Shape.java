
package main.java.com.codecool.java.geometry.shapes;

import main.java.com.codecool.java.NotYetImplementedException;
/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    private String name;
    private String areaFormula;
    private String perimeterFormula;

    public abstract String toString();
    /**
     * convert to String
     * @return shape description
     */
    
    /**
     * Calculates shape's area.
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    // public abstract String getAreaFormula();     does not have to be abstract
    
    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    // public abstract String getPerimeterFormula();        does not have to be abstract

    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) {
        for (float arg : args) {
            if (arg <= 0) {
                throw new IllegalArgumentException("All arguments must be greater than zero");
            }
        }
        // throw new NotYetImplementedException();
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAreaFormula(String areaFormula) {
        this.areaFormula = areaFormula;
    }

    public void setPerimeterFormula(String perimeterFormula) {
        this.perimeterFormula = perimeterFormula;
    }
}

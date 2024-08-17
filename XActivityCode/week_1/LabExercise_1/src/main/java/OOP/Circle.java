/**
 * Lab Exercise - Object and Classes
 * Create an Object and Classes for the different formula to solve:
 *

 * Key features:
 * 1. The Circle Formula:  Area of a Circle   A = π × r2.
 * 2. The Triangle Formula: Area of triangle = ½ × base × height
 * 3. The Temperature Formula:
 * 4. Fahrenheit to Celsius: C = (F-32) (5/9)
 * 5. Celsius to Fahrenheit: F = C(9/5) + 32

 * Make a class for each Formula
 * Create a choice of menu for the different formula operations
 *
 */

package OOP;

/**
 * Represents a circle with a given radius.
 */
public class Circle {
    private double radius;

    /**
     * Constructs a new Circle object with the given radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

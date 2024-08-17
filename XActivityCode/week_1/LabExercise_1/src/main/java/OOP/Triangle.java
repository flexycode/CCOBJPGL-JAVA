package OOP;

/**
 * Represents a triangle with a given base and height.
 */
public class Triangle {
    private double base;
    private double height;

    /**
     * Constructs a new Triangle object with the given base and height.
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     * @return the area of the triangle
     */
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
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

import java.util.Scanner;

/**
 * Provides a menu-driven interface for performing formula operations.
 */
public class FormulaSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formula Operations Menu:");
        System.out.println("1. Circle Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Circle Area: " + circle.calculateArea());
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Triangle Area: " + triangle.calculateArea());
                break;
            case 3:
                System.out.print("Enter the temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                TemperatureConverter temperature = new TemperatureConverter();
                System.out.println("Temperature in Celsius: " + temperature.fahrenheitToCelsius(fahrenheit));
                break;
            case 4:
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                temperature = new TemperatureConverter();
                System.out.println("Temperature in Fahrenheit: " + temperature.celsiusToFahrenheit(celsius));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
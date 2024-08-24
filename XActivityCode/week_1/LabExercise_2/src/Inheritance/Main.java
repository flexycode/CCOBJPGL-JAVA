/**
 * Machine Problem:
 * Create a java program that ask a user to enter his food menu using inheritance, inherit the attributes from the superclass only.
 * Represents a Menu Class.
 * Create super class that represent the Food Menu system.
 * Create a sub class for Appetizer, Soup, Dessert and MainCourse.
 * Import java.util.Scanner
 * I already did revise and refactor this to make look unique in terms of my own version of code structure
 */

package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Loop indefinitely until the user chooses to quit
        while (true) {
            // Prompt the user to enter a food type
            System.out.print("Enter a food type (Soup, Main Course, Dessert, Appetizer, or 'quit' to exit): ");
            String foodType = scanner.nextLine();

            // Check if the user wants to quit
            if (foodType.equalsIgnoreCase("quit")) {
                break;
            }

            // Declare a FoodMenu object to store the selected food type
            FoodMenu foodMenu;

            // Use a switch statement to determine which food type was selected
            switch (foodType) {
                case "Soup":
                    // Create a new Soup object
                    foodMenu = new Soup();
                    break;
                case "Main Course":
                    // Create a new MainCourse object
                    foodMenu = new MainCourse();
                    break;
                case "Dessert":
                    // Create a new Dessert object
                    foodMenu = new Dessert();
                    break;
                case "Appetizer":
                    // Create a new Appetizer object
                    foodMenu = new Appetizer();
                    break;
                default:
                    // If the user entered an invalid food type, print an error message and continue to the next iteration
                    System.out.println("Invalid food type. Please try again.");
                    continue;
            }

            // Prompt the user to enter menu items (separated by commas)
            System.out.print("Enter menu items (separated by commas): ");
            String menuItemsStr = scanner.nextLine();

            // Split the input string into an array of individual menu items
            String[] menuItemsArr = menuItemsStr.split(",");

            // Add each menu item to the selected food type
            for (String item : menuItemsArr) {
                foodMenu.addMenuItem(item.trim());
            }

            // Display the menu for the selected food type
            foodMenu.displayMenu();
        }
    }
}
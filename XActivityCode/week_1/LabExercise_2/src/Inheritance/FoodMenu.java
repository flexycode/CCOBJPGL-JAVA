/**
 * Machine Problem:
 * Create a java program that ask a user to enter his food menu using inheritance, inherit the attributes from the superclass only.
 * Represents a Menu Class.
 * Create super class that represent the Food Menu system.
 * Create a sub class for Appetizer, Soup, Dessert and MainCourse.
 */

package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    protected String name;
    protected List<String> menuItems;

    public FoodMenu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(String item) {
        menuItems.add(item);
    }

    public void displayMenu() {
        System.out.println(name + " =======");
        for (String item : menuItems) {
            System.out.println(item);
        }
        System.out.println();
    }
}
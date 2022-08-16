package grocery;

import util.Input;

import java.util.ArrayList;
import java.util.Collection;

public class GroceryListApplication {
    public static final int PRODUCE = 1;
    public static final int MEAT = 2;
    private static Input input = new Input();

    public static void main(String[] args) {
        if(!input.yesNo("Would you like to create a grocery list? (y/n) ")) {
            System.out.println("Bye");
            return;
        }

        ArrayList<GroceryItem> groceries = getGroceryListFromUser();

        printGroceryList(groceries);

        System.out.println("Done");
    }

    private static ArrayList<GroceryItem> getGroceryListFromUser() {
        ArrayList<GroceryItem> groceries = new ArrayList<>();

        while (true) {
            printGroceryCategories();

            int categoryNum = input.getInt(1, 2, "Enter the number of the category: ");

            System.out.println("Enter the name of the item: ");
            String itemName = input.getString();

            int itemQty = input.getInt(0, 10000, "Enter the quantity of the item: ");

            GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
            groceries.add(item);

            if(!input.yesNo("Would you like to add another grocery item? (y/n)")) {
                return groceries;
            }
        }
    }

    private static void printGroceryCategories() {
        System.out.println("Grocery Categories: ");
        System.out.println("1. Produce");
        System.out.println("2. Meat");
    }

    private static void printGroceryList(ArrayList<GroceryItem> groceries) {
        printGroceryListByCategory(PRODUCE, groceries);
        printGroceryListByCategory(MEAT, groceries);
    }

    private static void printGroceryListByCategory(int category, ArrayList<GroceryItem> groceries) {
        ArrayList<GroceryItem> categoryItems = new ArrayList<>();
        for (GroceryItem groceryItem : groceries) {
            if (groceryItem.getCategoryNum() == category) {
                categoryItems.add(groceryItem);
            }
        }
        Collection.sort(categoryItems);

        if(category == PRODUCE) {
            System.out.println("PRODUCE:");
        } else {
            System.out.println("MEAT:");
        }
        System.out.println(categoryItems);
    }
}
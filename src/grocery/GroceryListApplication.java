package grocery;

import util.Input;

import java.util.ArrayList;

public class GroceryListApplication {
    private static Input input = new Input();
    public static void main(String[] args) {
        if(input.yesNo("Would you like to create a grocery list? " +
                "(y/n)") == false) {
            System.out.println("Bye");
            return;
        }

        ArrayList<GroceryItem> groceries = getGroceryListFromUser();

        System.out.println(groceries);
        System.out.println("Done");

    }

    private static ArrayList<GroceryItem> getGroceryListFromUser() {
        ArrayList<GroceryItem> groceries = new ArrayList<>();
        while (true) {
            printGroceryCategories();

            int categoryNum = input.getInt(1, 2, "Enter the number of " +
                    "the category: ");

            System.out.println("Enter the name of the item: ");
            String itemName = input.getString();

            int itmQty = input.getInt(0, 10000, "Enter the number");

            GroceryItem item = new GroceryItem(itemName, categoryNum, itmQty);
            groceries.add(item);

            if(input.yesNo("Would you like to add another grocery item?" +
                    "(y/n)") == false) {
                return groceries;
            }
        }
    }

    private static void printGroceryCategories() {
        System.out.println("1. Produce");
        System.out.println("2. Meat");
    }
}

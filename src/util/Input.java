package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(String c) {
        String userInput = getString();

        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInt = getInt();

        if (userInt < min || userInt > max) {
            System.out.println("Int is not between " + min + " and " + max);
            userInt = getInt(min, max, prompt);
        }
        return userInt;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();

        if (userDouble < min || userDouble > max) {
            System.out.println("Double is not between " + min + " and " + max + ". Enter another double: ");
            userDouble = getDouble(min, max);
        }
            return userDouble;
    }

}

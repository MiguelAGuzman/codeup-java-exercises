package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();

        return userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt < min || userInt > max) {
            System.out.println("Int is not between " + min + " and " + max);
            userInt = getInt(min, max);
        }
            return userInt;

    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number(decimals ok) between " + min + " and " + max);
        double userDbl = getDouble();

        if (userDbl < min && userDbl > max) {
            System.out.println("Int is not between " + min + " and " + max);
            userDbl = getDouble(min, max);
        }
            return userDbl;


    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}

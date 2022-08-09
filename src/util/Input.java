package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter something ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String userInput = getString();

        return userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt >= min && userInt <= max) {
            System.out.println("You entered " + userInt);
            return userInt;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number(decimals ok) between " + min + " and " + max);
        double userDbl = scanner.nextDouble();

        if (userDbl >= min && userDbl <= max) {
            System.out.println("You entered " + userDbl);
            return userDbl;
        } else {
            return getDouble(min, max);
        }

    }

    public double getDouble() {
        System.out.println("Enter a number(decimals are ok): ");
        return scanner.nextInt();
    }

//    public static void main(String[] args) {
//        input input = new input();
//        System.out.println(input.getString());
//
//        System.out.println("Continue? (y/n) ");
//        System.out.println(input.yesNo());
//    }
}

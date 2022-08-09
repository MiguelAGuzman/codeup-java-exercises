package util;

import java.util.Scanner;

public class input {
    private final Scanner scanner = new Scanner(System.in);


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
        System.out.println("Enter integer between " + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt >= min && userInt <= max) {
            System.out.println("You entered " + userInt);
            return userInt;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("get integer");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter integer between " + min + " and " + max);
        Double userDbl = scanner.nextDouble();

        if (userDbl >= min && userDbl <= max) {
            System.out.println("You entered " + userDbl);
            return userDbl;
        } else {
            return getDouble(min, max);
        }

    }

    public double getDouble() {
        System.out.println("get double");
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

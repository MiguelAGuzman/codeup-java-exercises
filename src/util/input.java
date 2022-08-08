package util;

import java.util.Scanner;

public class input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter something ");
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return (input.trim().equals("y") ||
                input.trim().equals("yes") ||
                input.trim().equals("Y") ||
                input.trim().equals("Yes"));
    }

    public int getInt(int min, int max) {
        System.out.println("Enter integer between " + min + " and " + max);
        int userInt = scanner.nextInt();

        if (userInt >= min && userInt <= max) {
            System.out.println("You entered " + userInt);
            return userInt;
        } else {
            getInt(min, max);
        } return userInt;
    }

    public void getInt() {
        this.getInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter integer between " + min + " and " + max);
        int userDbl = scanner.nextInt();

        if (userDbl >= min && userDbl <= max) {
            System.out.println("You entered " + userDbl);
            return userDbl;
        } else {
            getDouble(min, max);
        }
        return userDbl;

    }

    public void getDouble() {
        this.getDouble();
    }

    public static void main(String[] args) {

    }
}

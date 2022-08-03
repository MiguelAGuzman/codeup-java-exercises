import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i += 1;
        }
        int a = 100;
        do {
            System.out.println("\n" + a);
            a -= 5;
        } while (a >= -10);

        long b = 2;
        do {
            System.out.println(b);
            b *= b;
        } while (b < 1000000);

        for (int c = 100; c >= -10; c -= 5) {
            System.out.println("\n" + c);
        }

        for (long d = 2; d < 1000000; d *= d) {
            System.out.println(d);
        }


        for (int e = 1; e <= 100; e += 1) {
            if (e % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (e % 3 == 0) {
                System.out.println("Fizz");
            } else if (e % 5 == 0) {
                System.out.println("Buzz");
            } else {
            System.out.println(e);
            }
        }

        System.out.print("Enter a number: ");
        String userN = scanner.next();
        System.out.println();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        int uN = Integer.parseInt(userN);

        for (int f = 1; f <= uN; f += 1) {
                System.out.format("%-6d |%-8d |%d",f , (f * f), (f * f * f));
            System.out.println();
        }


        for (int g = 0; g <= 100; g++) {
            System.out.print("Enter numerical grade: ");
            String userG = scanner.next();
            int uG = Integer.parseInt(userG);

            if (uG <= 100 && uG >= 88) {
                System.out.println("A");
            } else if (uG < 88 && uG >= 80) {
                System.out.println("B");
            } else if (uG < 80 && uG >= 67) {
                System.out.println("C");
            } else if (uG < 67 && uG >= 60) {
                System.out.println("D");
            } else if (uG < 60 && uG >= 0) {
                System.out.println("F");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.print("The value of pi is approximately: ");
        System.out.format("%.2fn", pi);

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        //entering anything other than an integer results in an error
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words: ");
        String firstW = scanner.next();
        String secondW = scanner.next();
        String thirdW = scanner.next();

        System.out.printf("You entered: --> \"" + "%s %s %s" + "\" <--", firstW, secondW, thirdW);
        //entering less than 3 words will not print anything out, entering
        //more than 3 results in only first 3 words appearing

        System.out.print("\nEnter a sentence: ");
        String sentence = scanner.next();
        String sentenceC = scanner.nextLine();

        System.out.printf("You entered: %s %s", sentence, sentenceC);

        System.out.print("\nEnter length and width of the room: ");
        String length = scanner.next();
        String width = scanner.nextLine();
        double l = Double.parseDouble(length);
        double w = Double.parseDouble(width);

        System.out.printf("\nYou entered: %s %s %n", l, w);
        System.out.println("The perimeter is: " + (l + l + w + w) +
                " and the area is: " + (l * w));
    }
}

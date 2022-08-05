import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100: ");

        int guesses = 0;
        boolean done = false;
        while(!done) {
            int playerGuess = scanner.nextInt();
            guesses++;

            if(number < playerGuess) {
                System.out.println("LOWER");
            } else if (number > playerGuess) {
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS! " + number + " is correct!");
                System.out.println("It took you " + guesses + " guesses.");
                done = true;
            }
        }
        scanner.close();

    }
}

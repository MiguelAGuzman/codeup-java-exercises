import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter two numbers to be added: ");
//        int firstA = scanner.nextInt();
//        int secondA = scanner.nextInt();
//        scanner.close();
//        sum(firstA, secondA);
//    }
//    public static void sum(int fA, int sA) {
//        int s = 0;
//        s = fA + sA;
//        System.out.println("The sum is: " + s);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter two numbers to be subtracted: ");
//        int firstS = scanner.nextInt();
//        int secondS = scanner.nextInt();
//        scanner.close();
//        difference(firstS, secondS);
//    }
//    public static void difference(int fS, int sS) {
//        int d = 0;
//        d = fS - sS;
//        System.out.println("The difference is: " + d);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter two numbers to be multiplied: ");
//        int firstM = scanner.nextInt();
//        int secondM = scanner.nextInt();
//        scanner.close();
//        product(firstM, secondM);
//    }
//    public static void product(int fM, int sM) {
//        int p = 0;
//        p = fM * sM;
//        System.out.println("The product is: " + p);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter two numbers to be divided: ");
//        int firstD = scanner.nextInt();
//        int secondD = scanner.nextInt();
//        scanner.close();
//        dividend(firstD, secondD);
//    }
//    public static void dividend(int fD, int sD) {
//        int d = 0;
//        d = fD / sD;
//        System.out.println("The dividend is: " + d);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        int firstMo = scanner.nextInt();
//        int secondMo = scanner.nextInt();
//        scanner.close();
//        modulus(firstMo, secondMo);
//    }
//    public static void modulus(int fMo, int sMo) {
//        int m = 0;
//        m = fMo % sMo;
//        System.out.println("The remainder is: " + m);
//    }

//    public static void main(String[] args) {
//        Scanner intScan = new Scanner(System.in);
//
//        System.out.println("Please enter a number between 1 and 10.");
//        getFactorial(getInteger(1, 10, intScan.nextInt()));
//    }
//
//    public static int getInteger(int min, int max, int input) {
//        if (input >= min && input <= max) {
//            return input;
//        } else {
//            Scanner intScan = new Scanner(System.in);
//            System.out.println("Please enter a number between 1 and 10.");
//            return getInteger(min, max, intScan.nextInt());
//        }
//    }
//
//    public static int getFactorial(int integer) {
//        int result = 1;
//        for (int f = 1; f <= integer; f++) {
//            System.out.println(result *= f);
//        }
//        return integer;
//    }

//        public static void main(String[] args) {
//        Scanner diceScan = new Scanner(System.in);
//
//        System.out.println("Choose number of sides on your dice.");
//        int sideNumber = diceScan.nextInt();
//
//        Random ranNum = new Random();
//
//        int total = 0;
//        int randomNumber = 0;
//
//        for (int i = 0; i < 2; i++) {
//                randomNumber = ranNum.nextInt(sideNumber) + 1;
//                total = total + randomNumber;
//                System.out.println("you rolled " + randomNumber);
//        }
//                System.out.println("Total: " + total);
//                diceScan.close();
//    }

        public static void main(String[] args) {
                String a;
                do {
                        Scanner diceScan = new Scanner(System.in);
                        Scanner roll = new Scanner(System.in);
                        Scanner cont = new Scanner(System.in);

                        System.out.println("Choose number of sides on your dice.");
                        int sideNumber = diceScan.nextInt();
                        System.out.println("Enter r to roll dice.");
                        String r = roll.next();

                        if (Objects.equals(r, "r")) {
                                int dice1 = (int) (Math.random() * sideNumber + 1);
                                int dice2 = (int) (Math.random() * sideNumber + 1);
                                int total = dice1 + dice2;

                                System.out.println("you rolled: " + dice1);
                                System.out.println("You rolled: " + dice2);
                                System.out.println("Total: " + total);
                        } else {
                                System.out.println("Not a valid response.");
                        }
                        System.out.println("Continue(y/n)");
                        a = cont.next();
                } while (Objects.equals(a, "y"));
        }

}


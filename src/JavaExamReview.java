public class JavaExamReview {
    public static int square(int input) {
        return input * input;
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }

    public static double sum(double input1, double input2) {
        return input1 + input2;
    }

    public static int average(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum = sum + i;
        }
        return sum / (int)input.length;
    }
}

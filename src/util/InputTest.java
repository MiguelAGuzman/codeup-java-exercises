package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getString());
        System.out.println(input.yesNo("(y/n)"));
        System.out.println(input.getInt(1, 20,"Enter Int"));
        System.out.println(input.getDouble(1, 20));
    }
}

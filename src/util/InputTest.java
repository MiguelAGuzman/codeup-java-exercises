package util;

public class InputTest {
    public static void main(String[] args) {
        Input userI = new Input();

        System.out.println(userI.getString());
        System.out.println(userI.yesNo());
        System.out.println(userI.getInt(1, 20));
        System.out.println(userI.getDouble(1, 20));
    }
}

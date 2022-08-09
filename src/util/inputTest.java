package util;

public class inputTest {
    public static void main(String[] args) {
        input userI = new input();

        System.out.println(userI.getString());
        System.out.println(userI.yesNo());
        System.out.println(userI.getInt(1, 20));
        System.out.println(userI.getDouble(1, 20));
    }
}

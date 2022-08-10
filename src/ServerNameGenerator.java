import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();
    //Create two arrays whose elements are strings: one with at
    // least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"crazy", "strict", "wicked", "industrious",
            "bent", "suspicious", "worthless", "barbarous", "busy",
            "adaptable"};
    public static String[] nouns = {"calculator", "chair", "gun", "bodega",
            "milkshake", "bus", "school", "ranch", "banjo", "bartender"};

    public static void main(String[] args) {
        String randomA = getRandomStringFromArray(adjectives);
        String randomN = getRandomStringFromArray(nouns);
        System.out.println("Server name: " + randomA + "-" + randomN);
    }

    //Create a method that will return a random element from an
    // array of strings.
    public static String getRandomStringFromArray(String[] strings){
        int rand = random.nextInt(strings.length);
        return strings[rand];
    }

}



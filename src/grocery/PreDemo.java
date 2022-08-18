package grocery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class PreDemo {
    public static void main(String[] args) throws IOException {
        // SHOW USE OF ABSOLUTE VS RELATIVE PATHS
        Path p1 = Paths.get(  "demo");
        Path p2 = Paths.get( "demo", "data.txt");
//        Path p1 = Paths.get( "/Users","markrobinson", "Desktop", "demo");
//        Path p2 = Paths.get( "/Users","markrobinson", "Desktop", "demo", "data.txt");
        System.out.println(Files.exists(p1));
        System.out.println(Files.exists(p2));

        try {
            Files.createDirectories(p1);
            Files.createFile(p2);
        } catch(IOException e) {
            System.out.println("dir and/or file already exists. skipping...");
        }

        List<String> fruits = Arrays.asList("banana", "apple");
        Files.write(p2, fruits);
        // , StandardOpenOption.APPEND

        List<String> fruits2 = Files.readAllLines(p2);
        System.out.println(fruits2);
    }
}
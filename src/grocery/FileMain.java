package grocery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileMain {
    public static void main(String[] args) throws IOException {

        // make a path object using absolute path for a demo folder
        Path demoFolder = Paths.get("/Users", "markrobinson", "Desktop", "code", "ideaProjects", "venus-java-exercises", "demo");

//        Path demoFolder = Paths.get("demo");

        System.out.println("Does this folder exist? " + Files.exists(demoFolder));

        Path demoFile = Paths.get("/Users", "markrobinson", "Desktop", "code", "ideaProjects", "venus-java-exercises", "demo", "test.txt");

        System.out.println("Does this file exist? " + Files.exists(demoFile));

        if(Files.exists(demoFolder)) {
            System.out.println("Hey the folder already exists!");
        } else {
            Files.createDirectories(demoFolder);
        }
        if(Files.exists(demoFile)) {
            System.out.println("Hey the file already exists!");
        } else {
            Files.createFile(demoFile);
        }

        // make some fruits and write them to a file
        List<String> fruits = Arrays.asList("banana", "plum", "orange", "pears");
        Files.write(demoFile, fruits);

        List<String> fruitDB = Files.readAllLines(demoFile);
        System.out.println(fruitDB);

        fruitDB.remove("banana");
        System.out.println(fruitDB);
        Files.write(demoFile, fruitDB);
    }
}

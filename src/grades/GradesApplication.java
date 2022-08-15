package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("bobgit", new Student("bob"));
        students.put("mikegit", new Student("mike"));
        students.put("markgit", new Student("mark"));
        students.put("johngit", new Student("john"));


    }
}

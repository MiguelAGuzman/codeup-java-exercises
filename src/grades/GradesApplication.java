package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student bob = new Student("bob");
        bob.addGrade(88);
        bob.addGrade(80);
        bob.addGrade(76);

        Student mike = new Student("mike");
        mike.addGrade(100);
        mike.addGrade(50);
        mike.addGrade(75);

        Student mark = new Student("mark");
        bob.addGrade(88);
        bob.addGrade(85);
        bob.addGrade(70);

        Student john = new Student("john");
        bob.addGrade(91);
        bob.addGrade(86);
        bob.addGrade(95);

        students.put("bobgit", bob);
        students.put("mikegit", mike);
        students.put("markgit", mark);
        students.put("johngit", john);

        for (String key: students.keySet()) {
            System.out.println(key);
        }
        System.out.println("Please select student for grades:");


    }
}

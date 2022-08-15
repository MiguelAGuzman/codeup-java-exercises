package grades;

import java.util.HashMap;
import java.util.Scanner;

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
        mark.addGrade(88);
        mark.addGrade(85);
        mark.addGrade(70);

        Student john = new Student("john");
        john.addGrade(91);
        john.addGrade(86);
        john.addGrade(95);

        students.put("bobgit", bob);
        students.put("mikegit", mike);
        students.put("markgit", mark);
        students.put("johngit", john);


        Scanner studentScan = new Scanner(System.in);
        Scanner contScan = new Scanner(System.in);

        String c;
        do {
            for (String key : students.keySet()) {
                System.out.println(key);
            }

            System.out.println("Please enter student's git username for " +
                    "grades or enter \"list\" to view grades for all students:");
            String studentGrades = studentScan.nextLine();
            switch (studentGrades) {
                case "bobgit" -> {
                    System.out.println(bob.getName());
                    System.out.println(bob);
                    System.out.println("Average: " + bob.getGradeAverage());
                }
                case "mikegit" -> {
                    System.out.println(mike.getName());
                    System.out.println(mike);
                    System.out.println("Average: " + mike.getGradeAverage());
                }
                case "markgit" -> {
                    System.out.println(mark.getName());
                    System.out.println(mark);
                    System.out.println("Average: " + mark.getGradeAverage());
                }
                case "johngit" -> {
                    System.out.println(john.getName());
                    System.out.println(john);
                    System.out.println("Average: " + john.getGradeAverage());
                }
                case "list" -> {
                    System.out.println(bob);
                    System.out.println(mike);
                    System.out.println(mark);
                    System.out.println(john);
                }
                default -> System.out.println("Sorry, no student with that github name?");
            }
            System.out.println("Continue(y/n)");
            c = contScan.nextLine();
        } while (c.equalsIgnoreCase("y"));

    }
}

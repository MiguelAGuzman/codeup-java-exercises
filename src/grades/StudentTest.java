package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student bob = new Student("Bob");

        bob.addGrade(80);
        bob.addGrade(90);

        System.out.println(bob.getName());
        System.out.println(bob.getGradeAverage());
    }
}

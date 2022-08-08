package shapes;

import java.util.Scanner;

public class circle {
    private Scanner scanner = new Scanner(System.in);

    private Double radius = scanner.nextDouble();

    public circle (double radius) {
        return ;
    }

    public double getArea() {
        return (Math.PI * (Math.pow(radius, 2)));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }
}

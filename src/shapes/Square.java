package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square perimeter is: ");
        return getLength() * 4;
    }

    @Override
    public double getArea() {
        System.out.println("Square area is: ");
        return Math.pow(this.getLength(), 2);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
}

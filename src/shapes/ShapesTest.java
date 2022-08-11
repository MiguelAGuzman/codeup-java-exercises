package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Quadrilateral box1 = new Rectangle(5, 4);
//        System.out.println("Perimeter is " + box1.getPerimeter() +
//                " and area is " + box1.getArea());
//
//        Quadrilateral box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

//        Measurable myShape = new Rectangle(5, 4);
//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}

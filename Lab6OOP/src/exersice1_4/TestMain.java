package exersice1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle(1);
        System.out.println(circle1);
        System.out.println("Area of circle: " + circle1.getArea());
        System.out.println("Perimeter of circle: " + circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(3.0, 4.0);
        System.out.println(rectangle1);
        System.out.println("Area of rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle1.getPerimeter());

        Square square1 = new Square(5.0);
        System.out.println(square1);
        System.out.println("Area of square: " + square1.getArea());
        System.out.println("Perimeter of square: " + square1.getPerimeter());
    }

}

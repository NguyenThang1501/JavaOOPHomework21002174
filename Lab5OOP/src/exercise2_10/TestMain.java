package exercise2_10;

public class TestMain {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(2, 7);
        MyPoint bottomRight = new MyPoint(5, 1);

        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle1);
        System.out.println("length is: " + rectangle1.getLength());
        System.out.println("width is: " + rectangle1.getWidth());
        System.out.println("Perimeter is: " + rectangle1.getPerimeter());
        System.out.println("Area is: " + rectangle1.getArea());
    }


}

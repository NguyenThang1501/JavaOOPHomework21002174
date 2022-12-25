package exercise2_8;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        System.out.println(point1);
        MyCircle circle1 = new MyCircle(point1, 5);
        System.out.println(circle1);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        MyPoint point2 = new MyPoint(5, 5);
        MyCircle circle2 = new MyCircle(point2, 2);
        System.out.println(circle1.distance(circle2));
    }

}

package exercise2_9;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2, 5);
        MyPoint point2 = new MyPoint(1, 4);
        MyPoint point3 = new MyPoint(3, 6);
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());

    }
}

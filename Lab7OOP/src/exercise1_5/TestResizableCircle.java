package exercise1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(2);
        System.out.println(resizableCircle);

        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        resizableCircle.resize(20);
        System.out.println(resizableCircle);
    }
}

package exercise1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 6, 1, 2);
        System.out.println(movablePoint);

        movablePoint.moveUp();
        System.out.println(movablePoint);

        movablePoint.moveDown();
        System.out.println(movablePoint);

        movablePoint.moveLeft();
        System.out.println(movablePoint);

        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}

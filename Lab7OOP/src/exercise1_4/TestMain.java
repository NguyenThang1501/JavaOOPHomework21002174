package exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(2, 3, 1, 1, 4);
        System.out.println(movableCircle);

        movableCircle.moveUp();
        System.out.println(movableCircle);

        movableCircle.moveDown();
        System.out.println(movableCircle);

        movableCircle.moveLeft();
        System.out.println(movableCircle);

        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}

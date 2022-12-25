package exericise1_8;

public class TestMain {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(2, 3, 6, 7, 1, 1);
        System.out.println(movableRectangle);

        movableRectangle.moveUp();
        System.out.println(movableRectangle);

        movableRectangle.moveDown();
        System.out.println(movableRectangle);

        movableRectangle.moveLeft();
        System.out.println(movableRectangle);

        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }

}

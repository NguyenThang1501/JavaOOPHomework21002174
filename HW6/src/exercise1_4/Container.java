package exercise1_4;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return Math.abs(this.x1 - this.x2);
    }

    public int getHeight() {
        return Math.abs(this.y1 - this.y2);
    }

    public boolean collides(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= this.x1) ||
                (ball.getX() - ball.getRadius() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }
}

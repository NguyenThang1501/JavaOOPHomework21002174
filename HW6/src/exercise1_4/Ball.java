package exercise1_4;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) ((float) speed * Math.cos(direction * Math.PI / 180));
        this.yDelta = (float) ((float) speed * Math.sin(direction * Math.PI / 180));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

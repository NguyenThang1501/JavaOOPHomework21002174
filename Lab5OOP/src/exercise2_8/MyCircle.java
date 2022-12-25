package exercise2_8;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center.setXY(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(MyPoint center) {
        this.center.setX(center.getX());
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(MyPoint center) {
        this.center.setY(center.getY());
    }

    public int[] getCenterXY() {
        int[] result = new int[2];
        result[0] = this.getCenterX();
        result[1] = this.getCenterY();
        return result;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center +
                ", radius=" + radius +
                ']';
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}

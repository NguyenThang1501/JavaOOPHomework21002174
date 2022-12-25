package exercise2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    public double getWidth() {
        return topLeft.getY() - bottomRight.getY();
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                ']';
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    public double getArea() {
        return (this.getLength() * this.getWidth());
    }

}

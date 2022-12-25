package exercise2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin.setX(begin.getX());
        this.begin.setY(begin.getY());
        this.end.setX(end.getX());
        this.end.setY(end.getY());
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(MyPoint begin) {
        this.begin.setX(begin.getX());
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(MyPoint begin) {
        this.begin.setY(begin.getY());
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(MyPoint end) {
        this.end.setX(end.getX());
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(MyPoint end) {
        this.end.setY(end.getY());
    }

    public int[] getBeginXY() {
        int[] result = new int[2];
        result[0] = this.begin.getX();
        result[1] = this.begin.getY();
        return result;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        int[] result = new int[2];
        result[0] = this.end.getX();
        result[1] = this.end.getY();
        return result;
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(begin.getX() - end.getX(), 2)
                + Math.pow(begin.getY() - end.getY(), 2));
    }

    public String toString() {
        return "MyLine[begin = (" + begin.getX() + "," + begin.getY()
                + "), end = (" + end.getX() + "," + end.getY() + ")]";
    }
}

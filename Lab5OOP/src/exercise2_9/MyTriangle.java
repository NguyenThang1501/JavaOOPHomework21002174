package exercise2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);

        v2.setX(x2);
        v2.setY(y2);

        v3.setX(x3);
        v3.setY(y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double dis1 = v1.distance(v2);
        double dis2 = v2.distance(v3);
        double dis3 = v3.distance(v1);

        if (dis1 == dis2 && dis2 == dis3) {
            return "Equilateral";
        }
        if (dis1 != dis2) {
            if (dis1 == dis3 || dis2 == dis3) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
        if (dis1 != dis3) {
            if (dis1 == dis2 || dis2 == dis3) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
        return "Isosceles";
    }
}

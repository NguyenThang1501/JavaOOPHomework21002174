package exercise2_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Volume is: " + cylinder1.getVolume());

        Circle base = new Circle(2.0);
        Cylinder cylinder2 = new Cylinder(base, 5);
        System.out.println(cylinder2);
        System.out.println("Volume is: " + cylinder2.getVolume());
    }

}

package exercise2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(1, 2, 4, 5);
        System.out.println("Begin Point is: " + lineSub1.getBegin());
        System.out.println("BeginX is: " + lineSub1.getBeginX());
        System.out.println("BeginY is: " + lineSub1.getBeginY());
        System.out.println("End Point is: " + lineSub1.getEnd());
        System.out.println("EndX is: " + lineSub1.getEndX());
        System.out.println("EndY is: " + lineSub1.getEndY());
        System.out.println("Length is: " + lineSub1.getLength());
        System.out.println("Gradient is: " + lineSub1.getGradient());
    }
}

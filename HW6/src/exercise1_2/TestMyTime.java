package exercise1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        System.out.println(myTime1);
        myTime1.setHour(25);

        MyTime myTime2 = new MyTime(23, 59, 59);
        System.out.println(myTime2);
        System.out.println(myTime2.nextSecond());
        System.out.println(myTime2.nextMinute());
        System.out.println(myTime2.nextHour());

        MyTime myTime3 = new MyTime(3, 15, 0);
        System.out.println(myTime3);
        System.out.println(myTime3.previousSecond());
        System.out.println(myTime3.previousMinute());
        System.out.println(myTime3.previousHour());

    }


}

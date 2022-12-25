import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(10));
        System.out.println(isDeficient(10));
        System.out.println(isDeficient(12));

        System.out.print("Enter the upper bound: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countPerfect = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.println();
        double percentPerfect = (double) countPerfect / n;
        System.out.println("[" + countPerfect + " perfect numbers found ("
                + Math.round(percentPerfect * 10000) / 100.00 + "%)]");

        int countNone = 0;
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int i = 1; i <= n; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                countNone++;
            }
        }
        System.out.println();
        double percentNone = (double) countNone / n;
        System.out.println("[" + countNone + " numbers found ("
                + Math.round(percentNone * 10000) / 100.00 + "%)]");
    }

    public static boolean isPerfect(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors < aPosInt) {
            return true;
        }
        return false;
    }


}

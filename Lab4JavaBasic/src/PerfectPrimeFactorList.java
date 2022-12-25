import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        System.out.print("Enter the upper bound: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countNums = 0;
        for (int i = 1; i <= n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                countNums++;
            }
        }
        System.out.println();
        double percent = (double) countNums / n;
        System.out.println("[" + countNums + " numbers found ("
                + Math.round(percent * 10000) / 100.00 + "%)]");

    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        if (product == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

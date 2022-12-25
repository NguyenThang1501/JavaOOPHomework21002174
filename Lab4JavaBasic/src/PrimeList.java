import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        System.out.print("Please enter the upper bound: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countPrime = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }

        double percentPrime = (double) countPrime / n;
        System.out.println("[" + countPrime + " primes found ("
                + Math.round(percentPrime * 10000) / 100.00 + "%)]");

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

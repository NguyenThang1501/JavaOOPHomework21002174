import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        sc.close();
        System.out.print("The magic sum is: " + sum);
    }
}

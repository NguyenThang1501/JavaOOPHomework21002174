import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size (a non-negative): ");
        int size = sc.nextInt();
        while (size < 0) {
            System.out.println("Enter the size (a non-negative): ");
            size = sc.nextInt();
        }
        sc.close();
        for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

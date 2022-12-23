import java.util.Scanner;
import java.lang.*;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size (a positive integer): ");
        int size = sc.nextInt();
        while (size < 1) {
            System.out.println("Enter the size (a positive integer): ");
            size = sc.nextInt();
        }
        sc.close();
        System.out.printf("%2s", "*");
        System.out.print(" |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 1; i <= size + 1; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= size; row++) {
            System.out.printf("%2d", row);
            System.out.print(" |");
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", col * row);
            }
            System.out.println();
        }
    }
}

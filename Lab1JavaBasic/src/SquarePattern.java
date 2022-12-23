import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        System.out.println("Enter the size (a non-negative integer): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while (size < 0) {
            System.out.println("Enter the size (a non-negative integer): ");
            size = sc.nextInt();
        }
        sc.close();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

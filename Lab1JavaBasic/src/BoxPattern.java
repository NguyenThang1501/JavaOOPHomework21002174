import java.util.Scanner;

public class BoxPattern {
    public static void BoxPatternA(int size) {
        System.out.println("BoxPatternA: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternB(int size) {
        System.out.println("BoxPatternB: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternC(int size) {
        System.out.println("BoxPatternC: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternD(int size) {
        System.out.println("BoxPatternD: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row + col == size + 1 || row == col) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size (a positive integer): ");
        int size = sc.nextInt();
        while (size < 1) {
            System.out.println("Enter the size (a positive integer): ");
            size = sc.nextInt();
        }
        BoxPatternA(size);
        BoxPatternB(size);
        BoxPatternC(size);
        BoxPatternD(size);
    }
}

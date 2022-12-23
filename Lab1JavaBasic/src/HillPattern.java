import java.util.Scanner;

public class HillPattern {
    public static void HillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col >= size - row + 1 && col <= size + row - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col >= size - row + 1 && col <= size + row - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int size) {
        HillPatternA(size);
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col > size - row + 1 && col < size + row - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col > size - row + 1 && col < size + row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        for (int row = size - 1; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col > size - row + 1 && col < size + row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
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
        System.out.println("HillPatternA: ");
        HillPatternA(size);
        System.out.println("HillPatternB: ");
        HillPatternB(size);
        System.out.println("HillPatternC: ");
        HillPatternC(size);
        System.out.println("HillPatternD: ");
        HillPatternD(size);
    }
}

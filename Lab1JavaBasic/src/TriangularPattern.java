import java.util.Scanner;

public class TriangularPattern {
    public static void TriangularPatterA(int size) {
        System.out.println("TriangularPatternA");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void TriangularPatterB(int size) {
        System.out.println("TriangularPatternB");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void TriangularPatterC(int size) {
        System.out.println("TriangularPatternC");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void TriangularPatterD(int size) {
        System.out.println("TriangularPatternD");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
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
        TriangularPatterA(size);
        TriangularPatterB(size);
        TriangularPatterC(size);
        TriangularPatterD(size);

    }
}

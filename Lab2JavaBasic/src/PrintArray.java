import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        System.out.print("Enter the number of items (a non-negative integer): ");
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];
        String[] strItems;
        System.out.print("Enter the value of all items (separated by space): ");
        Scanner scan = new Scanner(System.in);
        strItems = scan.nextLine().split(" ");
        scan.close();
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = Integer.parseInt(strItems[i]);
        }
        System.out.print("The values are: [");
        for (int i = 0; i < NUM_ITEMS - 1; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println(items[NUM_ITEMS - 1] + "]");
    }
}

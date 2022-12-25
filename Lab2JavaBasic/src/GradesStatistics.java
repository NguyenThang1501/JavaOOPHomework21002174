import java.util.Scanner;

public class GradesStatistics {
    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print("Enter the numbers of students: ");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];
        int sum = 0;
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            sum += grades[i];
        }
        sc.close();
        double average = (double) sum / numStudents;
        System.out.println("The average is: " + Math.round(average * 100) / 100.00);
        System.out.println("The minimum is " + minimum(grades));
        System.out.println("The maximum is: " + maximum(grades));
    }
}

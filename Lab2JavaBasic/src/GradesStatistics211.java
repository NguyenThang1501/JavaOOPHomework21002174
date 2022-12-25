import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics211 {
    public static int[] grades;

    public static void readGrades() {
        System.out.print("Enter the numbers of students: ");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void print(int[] array) {
        System.out.print("The grades are: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return (Math.round(average * 100) / 100.0);
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 1) {
            median = array[(array.length - 1) / 2];
        } else {
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2.00;
        }
        return Math.round(median * 100) / 100.00;
    }

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

    public static double stdDev(int[] array) {
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += Math.pow(array[i], 2) - Math.pow(average(array), 2);
        }
        double stdDev = Math.sqrt(1.0 / array.length * temp);
        return Math.round(stdDev * 100) / 100.00;
    }

    public static void main(String[] args) {
        readGrades();
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + minimum(grades));
        System.out.println("The maximum is " + maximum(grades));
        System.out.println("The standard deviation is " + stdDev(grades));
    }
}

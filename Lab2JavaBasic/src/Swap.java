public class Swap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp;
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {5, 4, 7, 2, 3, 9};
        int[] array2 = {7, 8, 6, 2, 1, 0};
        int[] array3 = {1, 2, 3};
        System.out.println(swap(array1, array2));
        inputArray(array1);
        inputArray(array2);
        System.out.println(swap(array1, array3));
    }
}

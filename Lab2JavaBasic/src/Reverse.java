public class Reverse {
    public static void reverse(int[] array) {
        int bIdx = array.length - 1;
        for (int fIdx = 0; fIdx < bIdx; fIdx++) {
            int temp;
            temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
            bIdx--;
        }
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5};
        reverse(array1);
        inputArray(array1);
        reverse(array2);
        inputArray(array2);
    }
}

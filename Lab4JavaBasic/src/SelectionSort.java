public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 8, 7, 6, 1, 10};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            int minIdx = i ;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }
}

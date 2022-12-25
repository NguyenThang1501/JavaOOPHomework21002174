public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 8, 4, 1, 6};
        System.out.println(linearSearch(array, 4));
        System.out.println(linearSearchIndex(array, 4));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}

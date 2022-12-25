public class Search {
    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {15, 3, 10, 9, -8, 5, 70};
        int key1 = 5;
        int key2 = 16;
        System.out.println(search(array, key1));
        System.out.println(search(array, key2));
    }
}

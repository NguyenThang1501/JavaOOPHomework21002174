public class Contains {
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 15, 30, 2, 6, 22};
        int key1 = 30;
        int key2 = 20;
        System.out.println(contains(array, key1));
        System.out.println(contains(array, key2));
    }

}

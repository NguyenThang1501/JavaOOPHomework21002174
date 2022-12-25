public class Equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 8, 7, 4};
        int[] array2 = {1, 3, 5, 10, 8, 9};
        int[] array3 = {1, 3, 5, 8, 7, 4};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(equals(array1, array2));
        System.out.println(equals(array1, array3));
        System.out.println(equals(array1, array4));
    }
}

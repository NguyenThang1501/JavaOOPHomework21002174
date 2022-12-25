public class CopyOf {
    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
    /*
    int[] newArray = array;
    Chi luu lai dia chi
     */

    public static int[] copyOf(int[] array, int newLength) {
        if (newLength >= array.length) {
            return copyOf(array);
        } else {
            int[] copyArray = new int[newLength];
            for (int i = 0; i < newLength; i++) {
                copyArray[i] = array[i];
            }
            return copyArray;
        }
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 9, 1, 4};
        int[] copyArray1 = copyOf(array);
        int[] copyArray2 = copyOf(array, 3);
        int[] copyArray3 = copyOf(array, 15);
        inputArray(copyArray1);
        inputArray(copyArray2);
        inputArray(copyArray3);
    }
}

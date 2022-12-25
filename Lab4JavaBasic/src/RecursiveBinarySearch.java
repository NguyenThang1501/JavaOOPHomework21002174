public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(array, 2, 0, 3));
        System.out.println(binarySearch(array, 2));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleInx = (fromIdx + toIdx) / 2;
            if (key == array[middleInx]) {
                return true;
            } else if (key < array[middleInx]) {
                toIdx = middleInx - 1;
            } else {
                fromIdx = middleInx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);

        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }
}

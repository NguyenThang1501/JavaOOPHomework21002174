public class ArrayToString {
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i]).append(", ");
        }
        result.append(array[array.length - 1]).append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 6, 2, 4, 9};
        System.out.println(arrayToString(array));
    }
}

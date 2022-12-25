public class Print {
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] IntArray = {1, 2, 8, 6, 4};
        double[] DoubleArray = {5.1, 3.7, 8.0};
        float[] FloatArray = {1234, 555, 98765};
        print(IntArray);
        System.out.println();
        print(DoubleArray);
        System.out.println();
        print(FloatArray);
    }
}

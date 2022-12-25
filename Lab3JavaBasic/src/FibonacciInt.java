public class FibonacciInt {
    public static void main(String[] args) {
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        int n = 4;
        while (Integer.MAX_VALUE - fibonacciN(n - 1) > fibonacciN(n - 2)) {
            System.out.println("F(" + (n - 1) + ") = " + fibonacciN(n));
            n++;
        }
        System.out.println("F("+(n-1)+") is out of the range of int");
    }

    public static int fibonacciN(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        return fibonacci[n - 1];
    }
}

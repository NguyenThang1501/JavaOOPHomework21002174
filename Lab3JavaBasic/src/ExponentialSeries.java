public class ExponentialSeries {
    public static void main(String[] args) {
        double x = 0.12;
        int numTerms = 4;
        System.out.println(specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        double temp = 1;
        double coefficient = 1;
        for (int i = 1; i < 2 * numTerms; i++) {
            temp = temp * x;
            if (i % 2 == 1) {
                sum += coefficient * temp / i;
                coefficient = coefficient * i / (i + 1);
            }
        }
        return sum;
    }
}

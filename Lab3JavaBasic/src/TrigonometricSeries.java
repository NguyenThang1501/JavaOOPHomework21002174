public class TrigonometricSeries {
    public static void main(String[] args) {
        double x = Math.PI / 6;
        int numTerms = 50;
        System.out.println("sinx= " + sin(x, numTerms));
        System.out.println("cosx= " + cos(x, numTerms));
    }

    public static double sin(double x, int numTerms) {
        double sinx = 0;
        double temp = 1;
        for (int i = 1; i < 2 * numTerms; i++) {
            temp = temp * x / i;
            if (i % 2 == 1) {
                sinx += temp;
                temp = temp * (-1);
            }
        }
        return sinx;
    }

    public static double cos(double x, int numTerms) {
        double cosx = 0;
        double temp = 1;
        for (int i = 1; i < 2 * numTerms; i++) {
            if (i % 2 == 1) {
                cosx += temp;
                temp = temp * -1;
            }
            temp = temp * x / i;
        }
        return cosx;
    }
}

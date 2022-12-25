package exercise1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder poly = new StringBuilder("");
        for (int i = 0; i < coeffs.length; i--) {
            poly.append(coeffs + "x^" + (coeffs.length - i));
        }
        poly.append(coeffs[coeffs.length - 1]);
        return poly.toString();
    }

    public double evaluate(double x) {
        double s = 0;
        for (int i = 0; i < this.coeffs.length; i++) {
            s += s * x + this.coeffs[i];
        }
        return s;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree];

        // add this poly to addPoly
        for (int i = 0; i <= this.getDegree(); i++) {
            addPolyData[i] += this.coeffs[i];
        }

        // add rightPoly to addPoly
        for (int i = 0; i <= right.getDegree(); i++) {
            addPolyData[i] += right.coeffs[i];
        }

        MyPolynomial addPoly = new MyPolynomial(addPolyData);
        return addPoly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] mulCoeffs = new double[this.getDegree() + right.getDegree()];
        MyPolynomial mulPolynomial = new MyPolynomial(mulCoeffs);
        for (int i = 0; i < this.getDegree(); ++i) {
            for (int j = 0; j < right.getDegree(); ++j) {
                mulPolynomial.coeffs[i + j] += this.coeffs[i] + right.coeffs[j];
            }
        }
        return mulPolynomial;
    }
}

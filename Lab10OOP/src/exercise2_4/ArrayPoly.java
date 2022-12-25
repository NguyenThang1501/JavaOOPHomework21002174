package exercise2_4;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] coefficients = derive();
        ArrayPoly derivativePoly = new ArrayPoly(coefficients);
        return (Poly) derivativePoly;
    }

    public double coefficient(int degree) {
        return coefficients[degree];
    }

    public double[] coefficients() {
        return this.coefficients;
    }
}

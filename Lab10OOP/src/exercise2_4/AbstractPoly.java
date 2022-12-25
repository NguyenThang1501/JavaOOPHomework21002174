package exercise2_4;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] tmp = new double[Math.max(1, degree())];
        for (int i = 1; i <= degree(); i++) {
            tmp[i - 1] = coefficient(i) * i;
        }
        return tmp;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof AbstractPoly abstractPoly)) {
            return false;
        }
        for (int i = 0; i < degree(); i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        sb.append(coefficient(degree())).append("x^").append(degree());
        return sb.toString();
    }
}

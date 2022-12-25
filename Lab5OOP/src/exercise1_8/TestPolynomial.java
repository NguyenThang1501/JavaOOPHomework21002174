package exercise1_8;

public class TestPolynomial {
    MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2,3.3);
    MyPolynomial polynomial2 = new MyPolynomial(1.1,2.2,3.3, 4.4,5.5);

    double[] coffers = {1.2,3.4,5.6,7.8};
    MyPolynomial polynomial3 = new MyPolynomial(coffers);
}

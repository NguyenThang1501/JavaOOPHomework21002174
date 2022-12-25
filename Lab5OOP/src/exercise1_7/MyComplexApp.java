package exercise1_7;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        System.out.println();
        complex1.setReal(real1);
        complex1.setImag(imag1);

        MyComplex complex2 = new MyComplex();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        System.out.println();
        complex2.setReal(real2);
        complex2.setImag(imag2);

        System.out.println("Number 1 is: " + complex1.toString());
        if (complex1.isReal()) {
            System.out.println(complex1.toString() + " is a pure real number");
        } else {
            System.out.println(complex1.toString() + " is NOT a pure real number");
        }
        if (complex1.isImaginary()) {
            System.out.println(complex1.toString() + " is a pure imaginary number");
        } else {
            System.out.println(complex1.toString() + " is NOT a pure imaginary number");
        }

        System.out.println("Number 2 is: " + complex2.toString());
        if (complex2.isReal()) {
            System.out.println(complex2.toString() + " is a pure real number");
        } else {
            System.out.println(complex2.toString() + " is NOT a pure real number");
        }
        if (complex1.isImaginary()) {
            System.out.println(complex2.toString() + " is a pure imaginary number");
        } else {
            System.out.println(complex2.toString() + " is NOT a pure imaginary number");
        }

        if (complex1.equals(complex2)) {
            System.out.println(complex1.toString() + " is equal " + complex2.toString());

        } else {
            System.out.println(complex1.toString() + " is NOT equal " + complex2.toString());
        }
        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + complex1.addInto(complex2).toString());
    }
}

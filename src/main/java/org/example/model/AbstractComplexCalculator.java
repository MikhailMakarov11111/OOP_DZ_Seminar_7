package org.example.model;

public abstract class AbstractComplexCalculator implements ComplexCalculator {
    @Override
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() - num2.getReal();
        double imaginary = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double real = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
        double imaginary = (num1.getReal() * num2.getImaginary()) + (num1.getImaginary() * num2.getReal());
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

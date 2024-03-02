package org.example.model;

public class OperationComplex extends AbstractComplexCalculator implements Calculator{
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException {
        return super.divide(num1, num2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        return super.multiply(num1, num2);
    }

    @Override
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        return super.sum(num1, num2);
    }
}

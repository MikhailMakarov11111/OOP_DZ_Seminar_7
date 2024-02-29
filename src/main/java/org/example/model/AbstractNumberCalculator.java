package org.example.model;

public abstract  class AbstractNumberCalculator implements NumberCalculator {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1/num2;
    }
}

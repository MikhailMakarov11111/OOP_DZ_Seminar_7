package org.example.model;

public final class OperationComplex implements Calculator {

    private ComplexNumber primaryArg;

    public OperationComplex(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculator sum(ComplexNumber arg) {
        primaryArg = new ComplexNumber(primaryArg.getReal() + arg.getReal(), primaryArg.getImaginary() + arg.getImaginary());
        return this;
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        double real = primaryArg.getReal() * arg.getReal() - primaryArg.getImaginary() * arg.getImaginary();
        double imaginary = primaryArg.getReal() * arg.getImaginary() + primaryArg.getImaginary() * arg.getReal();
        primaryArg = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public Calculator div(ComplexNumber arg) {
        double real = (primaryArg.getReal() * arg.getReal() + primaryArg.getImaginary() * arg.getImaginary()) / (Math.pow(arg.getReal(), 2) + Math.pow(arg.getImaginary(), 2));
        double imaginary = (primaryArg.getImaginary() * arg.getReal() - primaryArg.getReal() * arg.getImaginary()) / (Math.pow(arg.getReal(), 2) + Math.pow(arg.getImaginary(), 2));
        primaryArg = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return null;
    }
}

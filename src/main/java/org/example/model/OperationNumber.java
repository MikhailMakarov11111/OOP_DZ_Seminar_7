package org.example.model;

import java.util.List;

public class OperationNumber extends AbstractNumberCalculator implements Calculator {

    @Override
    public double divide(List<? extends Number> numbers) {
        return super.divide(numbers);
    }

    @Override
    public double multiply(List<? extends Number> numbers) {
        return super.multiply(numbers);
    }

    @Override
    public double sum(List<? extends Number> numbers) {
        return super.sum(numbers);
    }

    public OperationNumber(List<Double> numbers) {
        super(numbers);
    }

}

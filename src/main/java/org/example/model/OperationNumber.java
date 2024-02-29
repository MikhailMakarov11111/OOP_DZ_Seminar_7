package org.example.model;

import java.util.List;

public class OperationNumber extends AbstractNumberCalculator implements NumberCalculator{

    public OperationNumber(List<Double> numbers) {
        super(numbers);
    }

    @Override
    public double sum(List<? extends Number> numbers) {
        return 0;
    }

    @Override
    public double multiply(List<? extends Number> numbers) {
        return 0;
    }

    @Override
    public double divide(List<? extends Number> numbers) {
        return 0;
    }
}

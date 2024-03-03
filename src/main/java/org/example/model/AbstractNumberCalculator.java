package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractNumberCalculator implements SumNumberCalculator,
        MultiplyNumberCalculator, DivideNumberCalculator {
    private List<Double> numbers;


    @Override
    public double divide(List<? extends Number> numbers) {
        double quo = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() == 0.0) {
                throw new ArithmeticException("Деление на ноль запрещено!");
            }
            quo /= numbers.get(i).doubleValue();
        }
        return quo;
    }

    @Override
    public double multiply(List<? extends Number> numbers) {
        double com = 1;

        for (Number number : numbers) {
            com *= number.doubleValue();
        }
        return com;
    }

    @Override
    public double sum(List<? extends Number> numbers) {
        double s = 0;

        for (Number number : numbers) {
            s += number.doubleValue();
        }
        return s;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }

    public AbstractNumberCalculator(List<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "AbstractNumberCalculator{" +
                "numbers=" + numbers +
                '}';
    }

}

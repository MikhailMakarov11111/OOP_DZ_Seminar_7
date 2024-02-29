package org.example.model;

import java.util.List;

public abstract  class AbstractNumberCalculator {
private List<Double> numbers;

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

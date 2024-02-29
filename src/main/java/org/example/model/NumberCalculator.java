package org.example.model;

import java.util.List;

public interface NumberCalculator {
    double sum(List<? extends Number> numbers);
    double multiply(List<? extends Number> numbers);
    double divide(List<? extends Number> numbers);
}

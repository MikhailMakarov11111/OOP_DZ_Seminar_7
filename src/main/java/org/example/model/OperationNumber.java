package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public static List<Double> numbers(int size, Scanner scanner) {
        List<Double> list = new ArrayList<>();
        System.out.println("Введите " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextDouble());
        }
        return list;
    }

}

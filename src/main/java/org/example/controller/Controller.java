package org.example.controller;

import org.example.model.AbstractComplexCalculator;
import org.example.model.AbstractNumberCalculator;
import org.example.model.Calculator;
import org.example.model.OperationNumber;
import org.example.view.View;

import java.util.List;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static View view = new View();
    static  AbstractNumberCalculator abstractNumberCalculator;
    static AbstractComplexCalculator abstractComplexCalculator;

    public static void main(String[] args) {
        boolean res = true;
        while (res) {
            int welcom = view.choosingCalculator(scanner);
            switch (welcom){
                case 1:
                int operation = view.operationsCalculator(scanner);
                if (operation == 1) {
                    int size = view.inputSizeSum(scanner);
                    List<Double> list1 = OperationNumber.numbers(size, scanner);
                    Calculator calculator = new OperationNumbers(list1);

                }
            }
        }
    }
}

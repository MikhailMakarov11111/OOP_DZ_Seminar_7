package org.example.view;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;
import org.example.factory.ICalculableFactory;

import java.util.Scanner;

public class View {
   private ICalculableFactory calculableFactory;

    public View(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент (в формате a+bi): ");
            Calculator calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a+bi): ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a+bi): ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a+bi): ");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String input = in.nextLine();
        String[] parts = input.split("\\+");
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
        return new ComplexNumber(real, imaginary);
    }
}

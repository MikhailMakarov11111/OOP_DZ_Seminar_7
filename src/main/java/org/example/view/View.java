package org.example.view;

import java.util.Scanner;

public class View {
    public void choosingCalculator(Scanner scanner) {
        System.out.println("Добро пожаловать в Калькулятор, для того чтобы \n " +
                "продолжить выберите действие:\n" +
                "1. Операции с натуральными числами; \n" +
                "2. Операции с комплексными числами; \n" +
                "3. Закрыть приложение");
    }

    public void operationsCalculator(Scanner scanner) {
        System.out.println("Выберите операцию которую вы хотите осуществить: \n" +
                "1. Сложение; \n" +
                "2. Умножение; \n" +
                "3. Деление; \n" +
                "4. Закрыть приложение");
    }

}
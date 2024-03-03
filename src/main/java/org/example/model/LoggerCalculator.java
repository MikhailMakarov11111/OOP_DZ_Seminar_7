package org.example.model;

public class LoggerCalculator implements Calculator{
    private Calculator calculator;
    private LogMessages logMessages;

    public LoggerCalculator(Calculator calculator, LogMessages logMessages) {
        this.calculator = calculator;
        this.logMessages = logMessages;
    }

    @Override
    public Calculator sum(ComplexNumber arg) {
        logMessages.logMes("Выполнена операция суммы комплексного числа: " + arg.getReal()
                + " + " + arg.getImaginary() + "i");
        return calculator.sum(arg);
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        logMessages.logMes("Выполнена операция умножения комплексного числа: " + arg.getReal()
                + " + " + arg.getImaginary() + "i");
        return calculator.multi(arg);
    }

    @Override
    public Calculator div(ComplexNumber arg) {
        logMessages.logMes("Выполнена операция деления комплексного числа: " + arg.getReal()
                + " + " + arg.getImaginary() + "i");
        return calculator.div(arg);
    }

    @Override
    public ComplexNumber getResult() {
        logMessages.logMes("Результат вычесления: ");
        return calculator.getResult();
    }
}

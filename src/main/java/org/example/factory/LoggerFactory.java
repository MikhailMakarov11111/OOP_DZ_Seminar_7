package org.example.factory;

import org.example.model.*;

public class LoggerFactory implements ICalculableFactory{
    private LogMessages logMessages;

    public LoggerFactory(LogMessages logMessages) {
        this.logMessages = logMessages;
    }

    @Override
    public Calculator create(ComplexNumber primaryArg) {
        return new LoggerCalculator(new OperationComplex(primaryArg), logMessages);
    }
}

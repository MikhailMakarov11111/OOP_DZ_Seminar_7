package org.example.factory;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;
import org.example.model.OperationComplex;

public class CalculableFactory implements ICalculableFactory{

    @Override
    public Calculator create(ComplexNumber primaryArg) {
        return new OperationComplex(primaryArg);
    }
}

package org.example.factory;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;

public interface ICalculableFactory {
Calculator create(ComplexNumber primaryArg);
}

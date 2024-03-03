package org.example.model;

public interface Calculator {
    Calculator sum(ComplexNumber arg);
    Calculator multi(ComplexNumber arg);
    Calculator div(ComplexNumber arg);
    ComplexNumber getResult();
}

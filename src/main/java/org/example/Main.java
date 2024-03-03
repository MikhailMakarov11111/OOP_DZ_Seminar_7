package org.example;

import org.example.factory.ICalculableFactory;
import org.example.factory.LoggerFactory;
import org.example.model.ConsoleLoger;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactor = new LoggerFactory(new ConsoleLoger());
        View view = new View(calculableFactor);
        view.run();
    }
}
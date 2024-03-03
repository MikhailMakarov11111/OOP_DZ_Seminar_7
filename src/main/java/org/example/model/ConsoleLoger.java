package org.example.model;

public class ConsoleLoger implements LogMessages{
    @Override
    public void logMes(String message) {
        System.out.println(message);
    }
}

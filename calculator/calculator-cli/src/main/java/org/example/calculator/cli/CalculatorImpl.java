package org.example.calculator.cli;

import org.example.calculator.CalculatorAPI;

public class CalculatorImpl implements CalculatorAPI {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}

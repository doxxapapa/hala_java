package org.example.calculator.web.impl;

import org.example.calculator.CalculatorAPI;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements CalculatorAPI {


    private float leftOperand;
    private float rightOperand;

    public float getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(float leftOperand) {
        this.leftOperand = leftOperand;
    }

    public float getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(float rightOperand) {
        this.rightOperand = rightOperand;
    }

    @Override
    public Float add(float a, float b) {
        return a + b;
    }
    @Override
    public Float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public Float substract(float a, float b) {
        return a - b;
    }

    @Override
    public Float divide(float a, float b) {
        return a / b;
    }



}

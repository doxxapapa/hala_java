package org.example.calculator;

import org.example.calculator.cli.CalculatorImpl;

public class Cli {

    public static void main(String[] args) {
        CalculatorAPI calculator = new CalculatorImpl();

        switch (args[0]){
            case "+":
                System.out.println(calculator.add(Float.parseFloat(args[1]), Float.parseFloat(args[2])));
                break;
            case "*":
                System.out.println(calculator.multiply(Float.parseFloat(args[1]), Float.parseFloat(args[2])));
                break;
            case "/":
                System.out.println(calculator.substract(Float.parseFloat(args[1]), Float.parseFloat(args[2])));
                break;
            case "-":
                System.out.println(calculator.divide(Float.parseFloat(args[1]), Float.parseFloat(args[2])));
                break;

        }
    }
}

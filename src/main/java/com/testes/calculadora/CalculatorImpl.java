package com.testes.calculadora;

public class CalculatorImpl {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(3, 7);
        System.out.println(sum);

        int subtraction = calculator.subtract(5, 2);
        System.out.println(subtraction);

        double division = calculator.divide(5.0, 2.0);
        System.out.println(division);
    }
}

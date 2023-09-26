package com.testes.calculadora;


public class CalculadoraImpl {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma = calc.somar(3, 7);
        System.out.println(soma);


        int subtracao = calc.subtrair(5, 2);
        System.out.println(subtracao);

        double divisao = calc.dividir(5.0, 2.0);
        System.out.println(divisao);


    }
}
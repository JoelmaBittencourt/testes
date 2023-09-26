package com.testes.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {



    Calculadora calc = new Calculadora();

    @Test
    void deveCalculcularASoma() {
        Calculadora calc = new Calculadora();//extrair
        int soma = calc.somar(7, 5);

        Assertions.assertEquals(12, calc.somar(7, 5));
       // Assertions.assertEquals(12, soma);
    }

    @Test
    void deveCalcularSubtracao(){
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(2.5, calc.dividir(5.0,2.0));
    }

    @Test
    void deveCalcularDivisao(){
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(2, calc.subtrair(4,2));
    }

}

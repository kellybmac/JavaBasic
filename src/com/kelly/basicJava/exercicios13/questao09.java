package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 9. Faça um Programa que peça a temperatura em graus Farenheit,
// transforme e mostre a temperatura em graus Celsius.
// o C = (5 * (F-32) / 9).
public class questao09 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite a temperatura em garus Farenheit: ");
        double farenheit = key.nextDouble();
        double  celsius = (5 * (farenheit-32) / 9) ;
        System.out.println("O valor de "+farenheit+" °F é " +celsius+" °C.");
    }
}

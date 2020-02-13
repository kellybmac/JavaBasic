package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 10.Faça um Programa que peça a temperatura em graus Celsius,
// transforme e mostre em graus Farenheit.
public class questao10 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = key.nextDouble();
        double farenheit = ((celsius*9)/5)+32;
        System.out.println("O valor de "+celsius+" °C é " +farenheit+" °F.");
    }
}

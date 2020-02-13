package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 5. Faça um Programa que converta metros para centímetros
public class questao05 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = key.nextDouble();
        double cm = metros * 100;
        System.out.println("O valor de "+metros+" m em cm é " +cm+" cm.");
    }
}

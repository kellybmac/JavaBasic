package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class questao04 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite quatro notas bimestrais: ");
        double nota1 = key.nextDouble();
        double nota2 = key.nextDouble();
        double nota3 = key.nextDouble();
        double nota4 = key.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média é " + media);
    }
}

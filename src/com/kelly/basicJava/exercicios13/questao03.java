package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 3. Faça um Programa que peça dois números e imprima a soma.
public class questao03 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite dois número inteiros: ");
        int numero1 = key.nextInt();
        int numero2 = key.nextInt();
        System.out.println("A soma de "+ numero1 +" + "+ numero2 + " = " + (numero1+numero2));
    }
}

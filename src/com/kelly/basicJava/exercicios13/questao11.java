package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 11.Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre:
//  a. o produto do dobro do primeiro com metade do segundo .
//  b. a soma do triplo do primeiro com o terceiro.
//  c. o terceiro elevado ao cubo
public class questao11 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros e um real: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        double real = key.nextDouble();

        double a = ((num1 * 2) * (num2 / 2));
        double b = (num1*3) + real;
        double c = Math.pow(real,3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " +a);
        System.out.println("A conta é ("+num1+ " * 2) * ("+num2+" / 2)");
        System.out.println("A soma do triplo do primeiro com o terceiro: " +b);
        System.out.println("A conta é ("+num1+" * 3) + "+real);
        System.out.println("O terceiro elevado ao cubo: " +c);
        System.out.println("A conta é "+real+"³");
    }
}

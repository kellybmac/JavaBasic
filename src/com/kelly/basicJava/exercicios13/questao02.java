package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 2. Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número].
public class questao02 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = key.nextInt();
        System.out.println("O número informado foi " + numero);
    }
}

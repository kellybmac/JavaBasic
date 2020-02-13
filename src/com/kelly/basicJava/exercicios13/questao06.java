package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

//6. Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
public class questao06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo: ");
        double raio = key.nextDouble();
        double area = 3.14 * (raio * raio);
        System.out.println("Um círculo de raio "+raio+" tem a área de " +area);
    }
}

package com.kelly.basicJava.exercicios13;


import java.util.Scanner;

// 8. Faça um Programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês. Calcule e mostre o total do seu
// salário no referido mês.
public class questao08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite quanto ganha por hora e horas trabalhadas no mês: ");
        double custoHora = key.nextDouble();
        double horaMes = key.nextDouble();
        double salario = custoHora * horaMes;
        System.out.println("O seu salário este mês é de "+salario);
    }
}

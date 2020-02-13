package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

// 12.Tendo como dados de entrada a altura de uma pessoa, construa um
// algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
// (72.7*altura) - 58
public class questao12 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = key.nextDouble();
        double  peso = ((72.7 * altura) - 58);
        System.out.println("O peso ideal para uma pessoa de "+altura+"m é de" +peso+"kg.");
    }
}

package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

/*
14.Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */
public class questao14 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB e a velocidade do link em Mbps: ");
        double arquivo = key.nextDouble();
        double velocidadeLink = key.nextDouble();

        double tempoDownload = arquivo/velocidadeLink;
        System.out.println("O tempo de download do arquivo neste link é de " +tempoDownload);
    }
}

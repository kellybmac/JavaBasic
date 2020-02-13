package com.kelly.basicJava.exercicios13;

import java.util.Scanner;

/*
13.Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
    a. salário bruto.
    b. quanto pagou ao INSS.
    c. quanto pagou ao sindicato.
    d. o salário líquido.
    e. calcule os descontos e o salário líquido, conforme a tabela
    abaixo:
        + Salário Bruto : R$ - IR (11%) : R$ - INSS
        (8%) : R$ - Sindicato ( 5%) : R$ = Salário
        Liquido : R$
    Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

public class questao13 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Digite quanto ganha por hora e horas trabalhadas no mês: ");
        double custoHora = key.nextDouble();
        double horaMes = key.nextDouble();
        double salarioBruto = custoHora * horaMes;

        double IR = 0.11;
        double INSS = 0.08;
        double sindicato = 0.05;

        double custoIR = salarioBruto * IR;
        double custoINSS = salarioBruto * INSS;
        double custoSindicato = salarioBruto * sindicato;

        double descontos = custoIR + custoINSS + custoSindicato;

        double salarioLiq = salarioBruto - descontos;

        System.out.println("O seu salário bruto este mês é de "+salarioBruto);
        System.out.println("Pagou ao INSS 8% = "+custoINSS);
        System.out.println("Pagou ao sindicato 5% = "+custoSindicato);
        System.out.println("Pagou ao IR 11% = "+custoIR);
        System.out.println("O seu salário líquido este mês é de "+salarioLiq);
    }
}

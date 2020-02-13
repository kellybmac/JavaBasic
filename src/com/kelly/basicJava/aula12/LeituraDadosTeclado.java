package com.kelly.basicJava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");

        String nomeCompleto = scan.nextLine();// ler linha inteira

        System.out.println("Seu nome completo eh: " + nomeCompleto);

        // tipo especifico
        System.out.println("Digite seu primeiro nome, idade, altura, quantos filhos, tem pet?");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        byte qtdFilhos = scan.nextByte();
        boolean temPet = scan.nextBoolean();

        System.out.println("Seu nome primeiro nome eh: " + primeiroNome);
        System.out.println("Sua idade eh: " + idade);
        System.out.println("Sua altura eh: " + altura);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Tem pets? " + temPet);

        /*System.out.println("Digite double com , :");
        double d1 = scan.nextDouble();
        System.out.println("D1 = " + d1);*/

        // dá erro por nao aceitar . no terminal
        /*System.out.println("Digite double com . :");
        double d2 = scan.nextDouble();
        System.out.println("D2 = " + d2);
*/
    }
}

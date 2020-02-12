package com.kelly.basicJava.aula11;

public class inteirosChar {
    public static void main(String[] args) {

        // Char letras
        char numeroCharLetra1 = 'o';
        char numeroCharLetra2 = 'i';

        System.out.println("Char Letra 1 = " + numeroCharLetra1);
        System.out.println("Char Letra 2 = " + numeroCharLetra2);

        // Char soma os valores de o e i da tabela ascii 111+105
        System.out.println(numeroCharLetra1 + numeroCharLetra2);

        // Char inteiro
        char kelly = 64;
        char mac = 107;

        // Soma dos valores inteiros
        System.out.println(kelly + mac);

        // Char recebendo inteiro mas com "" imprime o da variavel referente a tabela ascii
        System.out.println("Char kelly = " + kelly);
        System.out.println("Char mac = " + mac);

        // Char vai imprimir valor ascii por conta do ""
        System.out.println("" + kelly + mac);
        System.out.println("Soma kelly+mac= " + kelly + mac);
    }
}

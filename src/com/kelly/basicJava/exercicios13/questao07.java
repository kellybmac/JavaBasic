package com.kelly.basicJava.exercicios13;


//7. Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
public class questao07 {
    public static void main(String[] args) {

        double lado = 5;
        double area = lado * lado;
        System.out.println("A área de um quadrado de lado "+lado+"m é " +area+"m².");
        System.out.println("O dobro da área é "+(area*2));
    }

}

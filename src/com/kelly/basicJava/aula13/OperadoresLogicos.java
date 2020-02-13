package com.kelly.basicJava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;
        boolean resultado1 = (valor1 ==1) && (valor2==2);

        System.out.println("Valor1 = " + valor1 +" \nValor2 = " + valor2);

        System.out.println("Valor1 é 1 AND valor2 é 2: " + resultado1);

        boolean resultado2 = (valor1 ==1) || (valor2==2);
        System.out.println("Valor1 OR valor2: " + resultado2);

        boolean resultado22 = (valor1 ==1) || (valor2!=2);
        System.out.println("Valor1 = 1 OR valor2 !=2 : " + resultado22);
        boolean resultado23 = (valor1 ==5) || (valor2==3);
        System.out.println("Valor1 = 5 OR valor2 =3 : " + resultado23);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso); // false

        System.out.println(verdadeiro || falso); // true

        System.out.println(verdadeiro ^ falso);  // true

        System.out.println(!verdadeiro && falso); // falso

        System.out.println(verdadeiro || !falso); // true

    }
}

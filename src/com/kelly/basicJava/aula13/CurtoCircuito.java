package com.kelly.basicJava.aula13;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;

        boolean resultado1 = verdadeiro & falso;
        boolean resultado2 = verdadeiro && falso;
        boolean resultado3 = verdadeiro | falso;
        boolean resultado4 = verdadeiro || falso;

        System.out.println("Verdadeiro &  falso: " + resultado1);
        System.out.println("Verdadeiro && falso: " + resultado2);
        System.out.println("Verdadeiro |  falso: " + resultado3);
        System.out.println("Verdadeiro || falso: " + resultado4);

        // falso antes

        boolean resultado11 = falso & verdadeiro;
        boolean resultado22 = falso && verdadeiro;
        boolean resultado33 = falso | verdadeiro;
        boolean resultado44 = falso || verdadeiro;

        System.out.println("falso &  verdadeiro: " + resultado11);
        System.out.println("falso && verdadeiro: " + resultado22);
        System.out.println("falso |  verdadeiro: " + resultado33);
        System.out.println("falso || verdadeiro: " + resultado44);

    }
}

package com.kelly.basicJava.aula11;

public class escapeChar {

    public static void main(String[] args) {

        // tabulação
        System.out.println("Dando\ttabulação");

        // backspace
        System.out.println("Dando\bbackspace");

        // nova linha
        System.out.println("Pulando \n linha");

        // retorno de carro
        System.out.println("Dando \r retorno");

        // avanco de pagina
        System.out.println("Avançando \f pagina");

        // ''
        System.out.println("\'Aspas simples\'");

        // " "
        System.out.println("\"Aspas duplas\"");

        // barra invertida /
        System.out.println("Barra \\ invertida");

        // constante octal
        // OctalEscape (octal value, Unicode \u0000 to \u00ff)
        // OctalEscape:
        // \ OctalDigit
        // \ OctalDigit OctalDigit
        // \ ZeroToThree OctalDigit OctalDigit
        // OctalDigit:
        //  (one of)
        //  0 1 2 3 4 5 6 7
        // ZeroToThree:
        //  (one of)
        //  0 1 2 3

        System.out.println("Resultado de \\0 em octa é: \'\0 \'" );
        System.out.println("Resultado de \\17 em octa é: \'\17 \'" );
        System.out.println("Resultado de \\032 em octa é: \'\032 \'");

        // constante hexa
        // UnicodeEscape:
        //    \ UnicodeMarker HexDigit HexDigit HexDigit HexDigit
        System.out.println("Resultado de u maiúsculo em unicode é: \'\u0055nicode\' ");

    }

}

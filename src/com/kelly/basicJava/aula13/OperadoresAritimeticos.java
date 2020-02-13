package com.kelly.basicJava.aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println("Soma de 1 + 2 = " + resultado);

        resultado = resultado - 1;
        System.out.println("Resultado - 1 = " + resultado);

        resultado = resultado * 2;
        System.out.println("Resultado * 2 = " + resultado);

        resultado = resultado / 2;
        System.out.println("Resultado / 2 = " + resultado);

        resultado = resultado +8 ;
        System.out.println("Resultado + 8 = " + resultado);

        resultado = resultado % 7;
        System.out.println("Resultado % 7 = " + resultado);


        String var1 =  "Esta é";
        String var2 = " uma String concatenada.";
        String var3 = var1+var2;

        System.out.println(var3);

        // 4
        resultado = resultado + 1;
        System.out.println("Resultado + 1 = " + resultado);

        // 5
        resultado +=  1;
        System.out.println("Resultado += 1 -> " + resultado);

        // 6
        resultado++;
        System.out.println("Resultado++ = " + resultado);


        // 6 e add +1 depois do print
        System.out.println("Resultado++ no print= " + resultado++);

        // 7 e add +1 antes do print = 8
        System.out.println("++Resultado no print = " + ++resultado);

        // decrementos

        resultado = resultado - 1;
        // 7
        System.out.println("Resultado - 1 = " + resultado);

        // 6
        resultado -=  1;
        System.out.println("Resultado -= 1 -> " + resultado);

        // 5
        resultado--;
        System.out.println("Resultado -- = " + resultado);


        // 5 e - 1 depois do print
        System.out.println("Resultado-- no print = " + resultado--);

        // 4 e -1 antes do print = 3
        System.out.println("--Resultado no print = " + --resultado);


    }
}

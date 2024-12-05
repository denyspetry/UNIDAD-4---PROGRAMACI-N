package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejercicio1(){

        imprimirMensaje();
        int numero = numeroUsuario();
        int resultado = calculoCubo(numero);
        System.out.println("El resultado es: " + resultado);
    }

    public static void imprimirMensaje(){

        System.out.println("INTRUDUCE UN NÚMERO Y TE DARÉ EL CUBO:");
    }

    public static int numeroUsuario(){

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        return numero;
    }

    public static int calculoCubo(int pepe){

        int cubo = pepe * pepe * pepe;
        return cubo;
    }
}

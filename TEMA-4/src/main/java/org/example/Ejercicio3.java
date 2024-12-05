package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejercicio3(){

        mostrarMensaje();
        int opcion = opcionElegida();
        String palabra = entradaUsuario();
        String resultado = eleccion(opcion,palabra);
        System.out.println(resultado);
    }

    public static void mostrarMensaje(){
        System.out.println("ELIGE LO QUE QUIERES HACER");
        System.out.println("     1. Pasar a Mayúsculas");
        System.out.println("     2. Contar Vocales");
    }

    public static int opcionElegida(){
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario = entrada.nextInt();
        return opcionUsuario;
    }

    public static String eleccion(int opcion, String palabra){
        String resultado = "";
        if (opcion == 1){
            resultado = pasarMayúsculas(palabra);
        } else if (opcion == 2) {
            resultado =Integer.toString(contarVocales(palabra));
        } else {
            System.out.println("La opción no es válida");
            System.exit(0);
        }
        return resultado;
    }

    public static String entradaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra = entrada.nextLine();
        return palabra;
    }

    public static String pasarMayúsculas(String palabra){
        String palabraMayus = palabra.toUpperCase();
        return palabraMayus;
    }

    public static int contarVocales(String palabra){
        int contadorvocales = 0;
        String palabravector[] = palabra.split("");

        for (int i = 0; i < palabravector.length; i++){
            if (palabravector[i].matches("[aeiou]")){
                contadorvocales++;
            }
        }

        return contadorvocales;
    }
}

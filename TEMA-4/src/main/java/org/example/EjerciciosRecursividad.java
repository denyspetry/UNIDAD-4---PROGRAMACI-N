package org.example;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosRecursividad {

    static Scanner entrada = new Scanner(System.in);
    static char palabra_vector[] = null;

    public static void main(String[] args) throws IOException, InterruptedException {
        mostrarMenu();
        elegirOpcion();
    }

    public static void mostrarMenu() {
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar");
        System.out.println("    1 - Dígitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del Revés");
        System.out.println("    4 - Binario");
        System.out.println("    5 - A binario");
        System.out.println("    6 - Orden alfabético");
        System.out.println("    7 - Mostrar suma");
    }

    public static int introduceNumero(){
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        return numero;
    }

    public static void limpiarPantalla() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void elegirOpcion() throws IOException, InterruptedException {

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                int numero = introduceNumero();
                System.out.println("El número tiene " + digitosE1(numero) + " dígitos.");
                menuFinal();
            case 2:
                System.out.print("Introduce la base: ");
                int base = entrada.nextInt();
                System.out.print("Introduce el exponente: ");
                int exponente = entrada.nextInt();
                System.out.println("Resultado: " + potenciaE2(base, exponente));
                menuFinal();
            case 3:
                numero = introduceNumero();
                System.out.print("Número al revés: ");
                del_revesE3(numero);
                menuFinal();
            case 4:
                numero = introduceNumero();
                if (binarioE4(numero)){
                    System.out.println("Es binario");
                }else{
                    System.out.println("No es binario");
                }
                menuFinal();
            case 5:
                numero = introduceNumero();
                System.out.println("En binario: " + conversionBinarioE5(numero));
                menuFinal();
            case 6:
                System.out.print("Introduce una palabra: ");
                String palabra = entrada.next();
                palabra_vector = palabra.toCharArray();
                if(ordenadaE6(0)){
                    System.out.println("La palabra " + palabra + " está ordenada");
                }else {
                    System.out.println("La palabra " + palabra + " no está ordenada");
                }
                menuFinal();
            case 7:
                numero = introduceNumero();
                System.out.println("La suma de 1 a " + numero + " es: " + sumaNaturalesE7(numero));
                menuFinal();
            default:
                System.out.println("La opción no es válida.");
        }
    }

    public static void menuFinal() throws IOException, InterruptedException {
        System.out.println("\nElige una opción:");
        System.out.println("    [M] - Volver al menú principal");
        System.out.println("    [X] - Salir");

        String opcion = entrada.next().toUpperCase();

        if (opcion.equals("M")) {
            mostrarMenu();
        } else if (opcion.equals("X")) {
            System.exit(0);
        } else {
            System.out.println("Opción no válida.");
        }

        limpiarPantalla();
    }

    public static int digitosE1(int numero){
        if(numero<10){
            return 1;
        }
        return 1 + digitosE1(numero/10);
    }

    public static int potenciaE2(int base, int exponente){
        if(exponente==0){
            return 1;
        }
        return base*potenciaE2(base,--exponente);
    }

    public static void del_revesE3(int numero){
        if(numero>= 0 && numero<10){
            System.out.print(numero);
        }else {
            System.out.print(numero % 10);
            del_revesE3(numero / 10);
        }
    }

    public static boolean binarioE4(int numero){
        if (numero > 9){
            if(numero % 10 == 0 || numero % 10 == 1){
                return binarioE4(numero/10);
            }else {
                return false;
            }
        }
        if (numero == 0 || numero == 1){
            return true;
        }else {
            return false;
        }
    }

    public static String conversionBinarioE5(int numero){
        if (numero == 0 || numero == 1){
            return Integer.toString(numero);
        }else {
            return conversionBinarioE5(numero/2) + numero%2;
        }
    }

    public static boolean ordenadaE6(int posicion){
        if (posicion < palabra_vector.length - 1) {
            if (palabra_vector[posicion] <= palabra_vector[posicion + 1]) {
                return ordenadaE6(posicion + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static int sumaNaturalesE7(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumaNaturalesE7(num - 1);
        }
    }
}

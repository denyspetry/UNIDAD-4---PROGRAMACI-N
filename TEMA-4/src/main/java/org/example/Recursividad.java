package org.example;

public class Recursividad {

    static int n;
    static char palabra_vector[] = null;

    public static void main (String[] args){
        /*
        String palabra = "abcdefg";
        palabra_vector = palabra.toCharArray();

        if(ordenadaE6(0)){
            System.out.println("La palabra " + palabra + " está ordenada");
        }else {
            System.out.println("La palabra " + palabra + " no está ordenada");
        }
        */
        /*
        int num = 10211;

        if (binarioE4(num)){
            System.out.println("Es binario");
        }else{
            System.out.println("No es binario");
        }
        */
         int num = 12;
         System.out.println(conversionBinarioE5(num));
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
}

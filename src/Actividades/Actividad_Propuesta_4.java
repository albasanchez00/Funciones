package Actividades;

/* Solicita al usuario una letra e indica si es vocal o no, mediante un booleano */

import java.util.Scanner;

public class Actividad_Propuesta_4 {
    // Modificar el main, para solo llamar una función que se denomine mostrarResultado().
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//      1.Salida porpuesta → Solo muestra true / false
//        System.out.println("¿La letra introducida es vocal?" + comprobarVocal(solicitarLetra()));
//      2.Salida porpuesta → Muestra mensaje validando las funciones
//        if(comprobarVocal(solicitarLetra())){
//            System.out.println("El letra es una vocal");
//        }else {
//            System.out.println("El letra no es una vocal");
//        }
//
//      3.Salida porpuesta → Llamar y recibir parámetos y guardarlos
//        Otro ejemplo de como llamar y recibir parámetros →
//        char miLetra=solicitarLetra();
//        boolean resultado=comprobarVocal(miLetra);
//        if (resultado){
//            System.out.println("El letra es una vocal");
//        }else{
//            System.out.println("El letra no es una vocal");
//        }

        mostrarResultado(solicitarLetra());
    }


    /**
     * Función que solicita una letra y lla devuelve a quien invoque la función.
     * @return
     */
    static char solicitarLetra(){
        char letra;
        System.out.print("Introduzca una letra → ");
        letra=new Scanner(System.in).next().charAt(0); //Acorta un String a la primera letra ingresada.
        // Ejemplo → Masestra... este escaner solo leerá la 'M'
        return letra;
    }


    /**
     * Función que recibe una letra e indica con un booleanon si es una vocal o no.
     * @param letra
     * @return
     */
    static boolean comprobarVocal(char letra){
        if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' ||
                letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
            return true;
        }else {
            return false;
        }

    }

    /**
     * Función que comprueba y devuelve el resultado de la comprobación, devolverá true / false
     * @param letra
     */
    static void mostrarResultado(char letra){
        boolean resultado=comprobarVocal(letra);
        System.out.println("¿Es vocal?\n"+resultado);
    }
}

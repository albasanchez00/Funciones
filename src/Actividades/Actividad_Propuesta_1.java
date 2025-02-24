package Actividades;
import javax.swing.*;
import java.util.Scanner;

/* Diseña una función que solicite un número y muestre las veces que se ha indicado, la palabra ECO
    * Ejemplo:
        - El usuario introduce el número 5 →
        - El programa muestra ECO tantas veces indique el usuario →
            ECO...
            ECO...
            ECO...
            ECO...
            ECO...
*  */

public class Actividad_Propuesta_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeticionT=JOptionPane.showInputDialog("Indica tu Repeticion: ");
        int repeticion = Integer.parseInt(repeticionT);
        mensajeEco(repeticion);
    }

    //Función ECO
    static void mensajeEco(int eco){
        for (int i=1; i<=eco; i++){
            JOptionPane.showMessageDialog(null,"ECO " +(i));
        }
    }
}

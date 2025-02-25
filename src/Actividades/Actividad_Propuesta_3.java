package Actividades;

/* Actividad. Realizar una función que calcule y muestre el área de un cilindro,
* Segun se especifique en un menu:
    * 1 para el area
    * 2 para el volumen

* Los datos que son necesario son el ratio de la base y la altura

* area=2*PI*radio*(altura+radio)

* volumen=PI*radio^2*altura
*/


import javax.swing.*;
import java.util.Scanner;

public class Actividad_Propuesta_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, volumen;
        String opcionT="";
        opcionT= JOptionPane.showInputDialog("""
                    Indique una opcion: \
      
                    [1]→ Área del cilindro\
                    
                    [2]→ Volumen del cilindro""");
        int opcion=Integer.parseInt(opcionT);

        System.out.println("Indique el radio →");
        double radio=sc.nextDouble();
        System.out.println("Indique la altura →");
        double altura=sc.nextDouble();

        switch (opcion) {
            case 1 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El area del cilindro es → " + area);
            }
            case 2 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen del cilindro es → " + volumen);
            }
                default-> System.out.println("ERROR en los datos introducidos");
        }
    }
}

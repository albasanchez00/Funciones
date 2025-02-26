package Actividades;

/* Actividades.
1. Implementa una funcion convertirMoneda(), que reciba una cantidad en dolares Canadienses o Americanos y la convierta a euros
2. Implementa una función convertirGradosCelsius() que reciba en ºF y los convierta a ºC
3. Implementa una función pasarMilimetros(), donde reciba el metro o centrimetro y lo pase a milimetros
4. Sabemos que las personas americanas se pesan en libras. Indica el peso en libras y pasalo a KG.
5. Indica el tiempo que falta para llegar a tu destino, teniendo en cuenta el tipo de vía transitada (autovía/carretraNacional) y los KM desde el origen hasta el destino.
6. Indica los segundos y conviertelos en días, horas, minutos y segundos
*/

import java.util.Scanner;

public class Actividad_Propuesta_7 {
    public static void main(String[] args) {
//        tipoMoneda(valorMoneda(convertirMoneda()));
    }

    static String tipoMoneda(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique el tipo de dolar (Americano o Canadiense) a convertir en euros (€)");
        String moneda=sc.nextLine();
        return moneda;
    }
    static double valorMoneda(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cantidad a convertir -> ");
        double valor=sc.nextDouble();
        return valor;
    }

    static String convertirMoneda(String moneda, double valor){
        Scanner sc=new Scanner(System.in);
        double dolarCanadiendse=0.65;
        double dolarAmericano=1.05;
        double euros=0;
        switch(moneda){
            case "Canadiense"->{
                if(valor<=0){
                    euros=valor*dolarCanadiendse;
                    System.out.println("El valor de "+moneda+" es: "+euros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "Americano"->{
                if(valor<=0){
                    euros=valor*1.05;
                    System.out.println("El valor de "+moneda+" es: "+euros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            default->{
                System.out.println("Indique el tipo de moneda correcto");
            }
        }
        return moneda;
    }
}

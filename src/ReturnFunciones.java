import java.util.Scanner;

/* La clausula return dentro de una función devuelve un valor que declarado en el prototipo de la función.
* Ejemplo:
* static Int pedirEdad(){
    boolean correcto=false;
    int edad;

    do{
        System.out.println("Indica la edad →");
        int edad= sc.nectInt();
        if(edad>=0 && edad<=120){
            correcto=true
        }
    } while(!correcto);
    return edad;
  }
*/

public class ReturnFunciones {
    public static void main(String[] args) {
        // mostrarEdad() → Necesita un valor int que deovolverá la función pedirEdad().
        mostrarEdad(pedirEdad());
    }

    static int pedirEdad(){
        boolean correcto=false;
        int edad;

        // Solicitamos la edad
        do{
            System.out.print("Ingresa tu edad → ");;
            edad=new Scanner(System.in).nextInt();
            if(edad>=0 && edad<=120){
                correcto=true;
            }
        } while(!correcto);
        return edad; //Enviámos la edad leída en un formato correcto.
    }

    static void mostrarEdad(int edad){
        System.out.println("Tienes "+edad+" años");
    }
}

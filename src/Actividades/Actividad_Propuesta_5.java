package Actividades;


/* Actividad. Mostrar los siguientes datos al uasuario
Al final mostrarlos de forma organizada en pantalla:
    1. Nombre
    2. Apellidos
    3. Telefono
    4. Dirección
    5. Email

* Luego lo mostraremos en pantalla en una sola línea, conectando los datos.
* Mediante los metodos → setter && getter -> POO
*/

import java.util.Scanner;

public class Actividad_Propuesta_5 {
    public static void main(String[] args) {
        mostrarDatos();
    }


    static void mostrarDatos(){
        String nombre=leerDato("nombre");
        String apellidos=leerDato("apellidos");
        String telefono=leerDato("telefono");
        String direccion=leerDato("direccion");
        String email=leerDato("email");
        System.out.println("Nombre: "+nombre+" | Apellido: "+apellidos+" | Telefono: "+telefono+" | Dirección: "+direccion+" | Email: "+email);
    }

    /**
     * Función genérica donde se le pasa el valor que quiere leer y devuelve lo qye el usuario a introducido.
     * @param dato
     * @return
     */
    static String leerDato(String dato){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+dato+" → ");
        return sc.nextLine();
    }






}

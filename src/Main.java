import javax.swing.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        saludo();

    }

    // Declaramos la función saludo() ↓
    static void saludo(){ //saludo es el identificador o nombre de la función
        JOptionPane.showMessageDialog(null,"Hola, ¿qué tal?");

    }

}
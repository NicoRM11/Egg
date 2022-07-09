/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class Ejercicioo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y 4 para saber el tipo de motor:");
        int tipoMotor = leer.nextInt();
        //desarrollo
        switch(tipoMotor){
            case 1:
        System.out.println("La bomba es una bomba de agua");
        break;
            case 2:
                 System.out.println("La bomba es una bomba de gasolina");
        break;
            case 3:
                 System.out.println("La bomba es una bomba de hormigón");
        break;
            case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
        break;
            default:
                 System.out.println("No existe un valor valido para el tipo de bomba");
        }
    }
    
}

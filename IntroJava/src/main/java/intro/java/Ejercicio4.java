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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion e importacion de Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados en centigrados: ");
        double C = leer.nextDouble();
        //operacion de pasaje a Farenheit
        double F;
        F = 32 + (9 * C / 5);
        System.out.println("La cantidad de grados Farenheit equivalente es: " + F);
                
        
    }
    
}

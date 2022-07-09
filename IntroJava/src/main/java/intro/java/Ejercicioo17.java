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
public class Ejercicioo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion,e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de '*'(asteriscos) que desea por lado:");
        int cantAsteriscos = leer.nextInt();
        //desarrollo
        //parte superior de asteriscos
        for(int i=0 ; i<cantAsteriscos ; i++){
            System.out.print('*');
        }
        System.out.println(" ");
        //parte del medio de cuadrado
        for(int i = 0 ; i < cantAsteriscos - 2; i++){
        System.out.print('*');
        for(int j = 0; j < cantAsteriscos - 2 ; j++){
        System.out.print(" ");
        }
         System.out.println('*');
        }
        
        //parte inferior de asteriscos
        for(int i=0 ; i < cantAsteriscos ; i++){
        System.out.print('*');}
    }
    
}

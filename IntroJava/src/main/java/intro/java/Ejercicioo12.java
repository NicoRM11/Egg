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
public class Ejercicioo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaracion, e importaciond de clase Scanner para leer por teclado
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una nota desde 1 al 10, incluidos:");
       int nota = leer.nextInt();
       //desarrollo
       while (nota < 1 || nota>10){
        System.out.println("Ingrese una nota valida, que este entre los valores 1 y 10:");
        nota = leer.nextInt();
       }
        System.out.println("La nota ingresada es:" + nota);
    }
    
   
}


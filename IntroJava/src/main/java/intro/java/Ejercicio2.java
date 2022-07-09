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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e invocacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        String nombre;
        //peticion a usuario que ingrese nombre por teclado
        System.out.println("Ingrese su nombre:");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
}

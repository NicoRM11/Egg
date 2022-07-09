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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //importacion de la clase scanner para que el programa pueda leer por teclado
        //declaracion de variables
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un primer numero:");
        int num1 = leer.nextInt();
        System.out.println("El numero 1 es:" + num1);
        System.out.println("Ingrese un segundo numero:");
        int num2 = leer.nextInt();
        System.out.println("El numero 2 es:" + num2);
        //operacion
        suma = num1 + num2;
        System.out.println("num1 + num2 =" + suma);
    }
    
}

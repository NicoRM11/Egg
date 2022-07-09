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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e importaciond de Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int doble;
        int triple;
        double raizCuadrada;
        //operaciones
        doble = num * 2;
        System.out.println("El doble de " + num + " es: " + doble);
        triple = num * 3;
        System.out.println("El triple de " + num + " es: " + triple);
        raizCuadrada = Math.sqrt(num);
        System.out.println("La raiz cuadrada de " + num + " es: " + raizCuadrada);
        
    }
    
}

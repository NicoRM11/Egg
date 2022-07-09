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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e importacion de Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int num2 = leer.nextInt();
        //desarrollo
        if (num1 > num2){
            System.out.println( num1 + " es mayor que" + num2);
        } else if (num1 == num2){
        System.out.println("Los numeros son iguales");}
        else { System.out.println( num2 + " es mayor que " + num1);}
        
    }
    
}

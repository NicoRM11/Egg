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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        //pasaje de frase a mayuscula
        String mayuscula = frase.toUpperCase();
        System.out.println("Su frase completa en mayusculas es: " + mayuscula);
        //pasaje de frase a minuscula
        String minuscula = frase.toLowerCase();
        System.out.println("Su frase completa en minuscula es: " + minuscula);
        
    }
    
}

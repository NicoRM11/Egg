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
public class Ejercicioo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra:");
        String frase = leer.nextLine();
        String primerLetra;
        //desarrollo
        primerLetra = frase.substring(0, 1);
        if (primerLetra.equals("A") || primerLetra.equals("a")){
        System.out.println("La primer letra de la frase es a o A");}
        else {
        System.out.println("La primer letra de la frase NO es a o A");}
        
    }
    
}

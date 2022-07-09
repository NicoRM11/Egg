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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion, e importacion de Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String frase = leer.nextLine();
        //desarrollo
        if ( frase.length() == 8){
            System.out.println("La frase o palabra contiene 8 caracteres");
        } else {
        System.out.println("La frase o palabra no contiene 8 caracteres");}
    }
    
    
}

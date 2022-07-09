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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaracion, e importacion de Scanner para leer por teclado
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su clave: ");
       String frase = leer.next();
       //desarrollo
       if (frase.equals("eureka")) {
       System.out.println("La clave es correcta");}
     else{
System.out.println("La clave es incorrecta");}
    }
}

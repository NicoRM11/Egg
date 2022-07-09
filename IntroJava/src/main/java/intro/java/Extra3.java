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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra, el sistema comprobara si es una vocal o no:");
        String letra = leer.next();
        //desarrollo
        switch (letra) {
            case "a":
                System.out.println("La letra ingresada es una vocal");
                break;
            case "e":
                System.out.println("La letra ingresada es una vocal");
                break;
            case "i":
                System.out.println("La letra ingresada en una vocal");
                break;
            case "o":
                System.out.println("La letra ingresada es una vocal");
                break;
            case "u":
                System.out.println("La letra ingresada es una vocal");
                break;
            default:
                System.out.println("La letra ingresada NO es una vocal");
        }
    }

}

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
public class Ejercicioo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int euro;
        String opcion;
        //desarrollo
        System.out.println("Ingrese la cantidad de euros que desea convertir:");
        euro = leer.nextInt();
        System.out.println("¿A que moneda desea convertir?");
        System.out.println("1 - Libra");
        System.out.println("2 - Dolar");
        System.out.println("3 - Yen");
        opcion = leer.next();
        conversion(euro,opcion);
        
    }

    public static void conversion(int euro, String opcion) {
        
        if (opcion.equals("1")) {
            //1 euro = 0.86  libras
            double libra;
            libra = euro * 0.86;
            System.out.println("La cantidad de libras es de: " + libra );
        } else if (opcion.equals("2")) {
            //1 euro = 1.28611 dolares
            double dolares = euro * 1.28611;
            System.out.println("La cantidad de dolares es de: " + dolares );
        } else if (opcion.equals("3")) {
            //1 euro = 129.852 yenes
            double yenes = euro * 129.852;
            System.out.println("La cantidad de yenes es de: " + yenes );

        }
       
    }
}

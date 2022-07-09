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
public class Ejercicioo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        String frase;
        String primerLetra;
        String ultimaLetra;
        int cont;
        int cont2;
        boolean menu = true;
        //desarrollo
        cont = 0;
        cont2 = 0;
        System.out.println("Bienvenido/a al sistema del dispositivo RS232:");
        System.out.println("Para marcar el final de los envios debe ingresar la frase: '&&&&&'");
        do {
            System.out.println("Ingrese cadena de caracteres:");
            frase = leer.nextLine();
            primerLetra = frase.substring(0, 1);
            ultimaLetra = frase.substring(frase.length() - 1, frase.length());
            if (frase.equals("&&&&&")) {
                break;
            } else if ((frase.length() <= 5) && (primerLetra.equals("x")) && (ultimaLetra.equals("o"))) {
                cont = cont + 1;
            } else {
                cont2 = cont2 + 1;
            }
        } while (menu == true);

        System.out.println("Cantidad de lecturas correctas: " + cont);
        System.out.println("Cantidad de lecturas incorrectas: " + cont2);
    }

}

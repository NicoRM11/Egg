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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su tiempo en minutos:");
        int minutos = leer.nextInt();
        double horas;
        double dias;
        //desarrollo
        horas = (minutos / 60);
        dias = (minutos / 1440);
        System.out.println("La cantidad de horas equivalentes a los minutos ingresados es de: " + horas);
        System.out.println("La cantidad de dias equivalentes a los minutos ingresados es de: " + dias);
    }
    
}

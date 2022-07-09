/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese un mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese un año:");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
       
        System.out.println("La fecha ingresada es:" + fecha);
        System.out.println("La fecha actual es:" + fechaActual);
        
                
    }
    
}

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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        String letraSocio;
        double costoTratamiento;
        double costoTratamientoDescuento;
        //desarrollo
        System.out.println("Ingrese letra de socio para tratamiento (A , B o C):");
        letraSocio = leer.next();
        System.out.println("Ingrese el costo de tratamiento:");
        costoTratamiento = leer.nextDouble();
        //switch para aplicar descuento en el costo
        switch (letraSocio) {
            case "A":
                costoTratamientoDescuento = (costoTratamiento * 0.50);
                System.out.println("El costo del tratamiento para los socios tipo A es de: " + costoTratamientoDescuento);
                break;
            case "B":
                costoTratamientoDescuento = (costoTratamiento * 0.65);
                System.out.println("El costo del tratamiento para los socios tipo B es de: " + costoTratamientoDescuento);
                break;
            case "C":
                System.out.println("El costo del tratamiento para los socios tipo C es de: " + costoTratamiento);
                break;
            default:
        }
    }

}

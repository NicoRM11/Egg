/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class Ejercicio02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //generar una excepcion y capturarla, excepcion de tipo array
        //vector de 5 posiciones
        int[] vector1 = new int[4];

        //bloque try para generar el error y que lo capture el catch
        System.out.println("Ingrese numeros en las 4 posiciones del vector:");
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Ingrese numero en la posicion " + i + " del vector:");

                vector1[i] = leer.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usted desea ingresar una posicion la cual no cubre el vector");
        }
    }

}

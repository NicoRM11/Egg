/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Nicolas Romano
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaracion de vectores
        double[] vector1 = new double[50];
        double[] vector1MenorAMayor = new double[50];
        double[] vector2 = new double[20];
        //relleno de vector 1 y muestra por pantalla
        for (int i = 0; i < 50; i++) {
            vector1[i] = Math.random() * 10;
        }
        String aux = "";
        for (double elemento : vector1) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        //ordenar de menor a mayor el vector 1
        Arrays.sort(vector1);
        //copiar los primeros 10 elementos del vector 1 hacia el vector 2
        for (int i = 0; i < 10; i++) {
            vector2[i] = vector1[i];
        }
        //relleno de ultimos 10 valores de vector 2, con el numero 0.5
        Arrays.fill(vector2, 10, 19, 0.5);
        //mustra por pantalla de vector 1 y vector 2
        aux = "";
        for (double elemento : vector1) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        aux = "";
        for (double elemento : vector2){
          aux = aux + " " + elemento;
        }    
        System.out.println(aux);
    }

}

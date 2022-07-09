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
public class Ejercicioo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here7
        //declaracion, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        int num;
        int cont = 0;
        boolean verificacion = true;
        String aux;
        //desarrollo
        //peticion a usuario que rellene matriz con valores numericos
        System.out.println("Bienvend@ al sistema para comprobar si una matriz es antisimétrica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para la posicion " + i + "," + j + " de la matriz:");
                num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
        //muestra de matriz
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        //pasar valores para hacer la matriz transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        //comparacion si es que la matriz es antisimetrica o no
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -(matrizT[i][j])) {
                    verificacion = true;
                } else {
                    verificacion = false;
                    break;
                }

            }
        }

        if (verificacion = true) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matris NO es antisimetrica");
        }
    }
}



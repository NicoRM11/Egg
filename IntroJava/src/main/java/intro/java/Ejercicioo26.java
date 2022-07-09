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
public class Ejercicioo26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracioN
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int primerNumeroMatrizP;
        int segundoNumeroMatrizP;
        int tercerNumeroMatrizP;
        int cuartoNumeroMatrizP;
        int quintoNumeroMatrizP;
        int sextoNumeroMatrizP;
        int septimoNumeroMatrizP;
        int octavoNumeroMatrizP;
        int novenoNumeroMatrizP;
        String aux;
        boolean verificacion= false;

        //desarrollo
        //relleno de matriz M con numeros aleatorios del 1 al 9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrizM[i][j] = (int) (Math.random() * 10);
            }

        }
        //relleno de matriz P con numeros aleatorios del 1 al 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int) (Math.random() * 10);
            }

        }
        //muestra por pantalla de matriz M
        System.out.println("La matriz M es:");
        for(int [] fila: matrizM){
            aux= "";
            for(int elemento: fila){
            aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        //muestra por pantalla de matiz P
        System.out.println("La matriz P es:");
         for(int [] fila: matrizP){
            aux= "";
            for(int elemento: fila){
            aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       
        //asignacion de numeros de matriz P a variables
        primerNumeroMatrizP = matrizP[0][0];
        segundoNumeroMatrizP = matrizP[0][1];
        tercerNumeroMatrizP = matrizP[0][2];
        cuartoNumeroMatrizP = matrizP[1][0];
        quintoNumeroMatrizP = matrizP[1][1];
        sextoNumeroMatrizP = matrizP[1][2];
        septimoNumeroMatrizP = matrizP[2][0];
        octavoNumeroMatrizP = matrizP[2][1];
        novenoNumeroMatrizP = matrizP[2][2];

        //(prueba) recorrido matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == primerNumeroMatrizP) {

                    if (matrizM[i][j + 1] == segundoNumeroMatrizP) {
                        if (matrizM[i][j + 2] == tercerNumeroMatrizP) {

                            if (matrizM[i + 1][j] == cuartoNumeroMatrizP) {
                                if (matrizM[i + 1][j + 1] == quintoNumeroMatrizP) {
                                    if (matrizM[i + 1][j + 2] == sextoNumeroMatrizP) {
                                        if (matrizM[i + 2][j] == septimoNumeroMatrizP) {
                                            if (matrizM[i + 2][j + 1] == octavoNumeroMatrizP) {
                                                if (matrizM[i + 2][j + 2] == novenoNumeroMatrizP) {
                                                    System.out.println("La submatriz P comienza en la posicion:" + i + "," + j + " de la matriz M");
                                                    verificacion = true;
                                                } else {
                                                    continue;
                                                }

                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }

                                    } else {
                                        continue;
                                    }

                                } else {
                                    continue;
                                }

                            } else {
                                continue;
                            }

                        } else {
                            continue;
                        }

                    } else {
                        continue;
                    }

                } else {
                    continue;
                }
            }
        }
      
        if(verificacion == true){
            System.out.println("La submatriz P se encuentra dentro de la matriz M");}
        else {System.out.println("La submatriz P no se encuentra dentro de la matriz M");}
        
    }

}

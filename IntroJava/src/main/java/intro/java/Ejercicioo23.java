/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

/**
 *
 * @author Nicolas Romano
 */
public class Ejercicioo23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int [4][4];
        //desarrollo
        //relleno de matriz de valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz [i][j] = (int) (Math.random() * 10);
            }
        }
        //muestra por pantalla de matriz
        String aux = "";
        System.out.println("La matriz A es:");
        for(int [] fila: matriz){
            aux= "";
            for(int elemento: fila){
            aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        
        //transpuesta de matriz
        for(int i = 0 ; i < 4 ; i++){
        for(int j = 0 ; j < 4 ; j++){
        matrizT[i][j] = matriz[j][i];       
        }
        }
        //muestra por pantalla de transpuesta de matriz
        System.out.println("La matriz transpuesta es:");
        for(int [] fila: matrizT){
            aux= "";
            for(int elemento: fila){
            aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }

    }

}

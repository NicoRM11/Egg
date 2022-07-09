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
public class Ejercicioo25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño deseado para la matriz NxN:");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int num;
        int suma1erFila;
        int sumaFilas;
        int sumaColumnas;
        int sumaDiagonalPrincipal;
        int sumaDiagonalInvertida;
        boolean verificacion = true;
        //desarrollo
        //ingreso de numeros por el usuario, los numeros deben estar entre el 1 y el 9
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un numero para la posicion " + i + "," + j + ":");
                num = leer.nextInt();
                while (num > 9 || num < 1) {
                    System.out.println("Ingrese un numero entre 1 y 9");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }

        }
        //comprobacion de matriz magica
        //comparar la suma de primer fila con todas las demas sumas de la matriz
        /*(idea) agregar un if con la condicion que el booleano verificacion sea verdadero
       y asi poder seguir haciendo la verificacion
         */
        suma1erFila = 0;
        //bucle para sumar la primer fila
        for (int i = 0; i < n; i++) {
            suma1erFila = suma1erFila + matriz[0][i];
        }
        //bucles para sumar todas las filas, y comparar con la suma de la primer fila
        for (int i = 0 ; i < n ; i++){
        sumaFilas = 0;
            for (int j = 0 ; j < n ; j++){
            sumaFilas = sumaFilas + matriz[i][j];
        }
            if(suma1erFila == sumaFilas){
            verificacion = true;} else{
            verificacion = false;
            break;}
        }
        
        //bucles para hacer suma de las columnas y comparar con la primer fila
        if(verificacion = true){
            for (int i = 0; i < n; i++) {
                sumaColumnas = 0;
                for (int j = 0; j < n ; j++) {
                    sumaColumnas = sumaColumnas + matriz[j][i];
                    
                }
                if(suma1erFila == sumaColumnas){
                verificacion = true;} else{
                verificacion = false;
                break;}
                
            }
        }
        if(verificacion=true){
         //comparacion de suma de primer Fila, con la suma de las diagonales
         sumaDiagonalPrincipal = 0;
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n ; j++) {
                    if( i == j ){
                    sumaDiagonalPrincipal = sumaDiagonalPrincipal + matriz[i][j];
                    }
                    
                }
                
            }
            
            if(suma1erFila == sumaDiagonalPrincipal){
            verificacion = true; }
            else{ verificacion = false;}
        }
        
        if(verificacion = true){
        //comparacion de suma de primer Fila, con la diagonal invertida
        sumaDiagonalInvertida = 0;
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n ; j++) {
                    if(i+j == n - 1){
                    sumaDiagonalInvertida = sumaDiagonalInvertida + matriz[i][j];
                }
                    
                }
                
            }
            if(suma1erFila == sumaDiagonalInvertida){
            verificacion = true;} else{
            verificacion = false;}
        }
       
     if(verificacion = true){
         System.out.println("La matriz es MAGICA");}   
     else {
         System.out.println("La matriz NO es MAGICA");}
    }

}

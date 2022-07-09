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
public class Ejercicioo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        int [] vector = new int[101];
        int numeroPorNumero = 0;
        //desarrollo
        //relleno de vector
        for(int i=0 ; i < vector.length ; i++){
        vector[i] = numeroPorNumero;
        numeroPorNumero = numeroPorNumero + 1;
        }
        //muestra de vector
        for ( int i = 0 ; i < vector.length ; i++){
        System.out.println("[" + vector[100-i] + "]");
        }
        
    }
    
}

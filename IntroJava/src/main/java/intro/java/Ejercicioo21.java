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
public class Ejercicioo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De que tamaño desea que sea el vector?:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int numBusqueda;
        //desarrollo
        //relleno de vector con numeros aleatorios
        //int numero = (int) (Math.random() * 10);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        //peticion a usuario de numero
        int cont = 0;
        System.out.println("¿Que numero desea buscar del vector, entre los valores 0 y 9?");
        numBusqueda = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numBusqueda) {
                System.out.println("El numero se encuentra en la posicion:" + i);
                cont = cont + 1;
            }
        }
        //ver si se encuentra repetido
        if (cont >= 2){
            System.out.println("El numero se encuentra repetido en el vector");}
    }

}

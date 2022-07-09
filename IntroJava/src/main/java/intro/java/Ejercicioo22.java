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
public class Ejercicioo22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De que tamaño desea que sea el vector?");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int num;
        int cont1cifra = 0;
        int cont2cifras = 0;
        int cont3cifras = 0;
        int cont4cifras = 0;
        int cont5cifras = 0;
        int cifras;
        //desarrollo
        //relleno de vector con numeros pedidos al usuario
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero del vector para la posicion:" + i);
            num = leer.nextInt();
            vector[i] = num;
        }
        //contabilizador de vector
        for (int i = 0; i < vector.length; i++) {
            cifras = 0;
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                cifras = cifras + 1;
            }
            if (cifras == 1){
            cont1cifra = cont1cifra + 1;}
            else if (cifras == 2){
            cont2cifras = cont2cifras + 1;}
            else if (cifras == 3){
            cont3cifras = cont3cifras + 1;}
            else if (cifras == 4){
            cont4cifras = cont4cifras + 1;}
            else if (cifras == 5){
            cont5cifras = cont5cifras + 1;}
            
        }
        //muestra por pantalla de resultados
        System.out.println("Cantidad de numeros de 1 digito: " + cont1cifra);
        System.out.println("Cantidad de numeros de 2 digitos: " + cont2cifras);
        System.out.println("Cantidad de numeros de 3 digitos: " + cont3cifras);
        System.out.println("Cantidad de numeros de 4 digitos: " + cont4cifras);
        System.out.println("Cantidad de numeros de 5 digitos: " + cont5cifras);

    }

}

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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        String aux;
        int num;
        int cont;
        int contPar;
        int contImpar;
        //desarrollo
        cont = 0;
        contPar = 0;
        contImpar = 0;
        System.out.println("Bienvenid@ al programa para lectura de numeros enteros, el programa se detendra cuando se ingrese un numero multiplo de 5");
        System.out.println("Ingrese un numero:");
        num = leer.nextInt();
        while (num % 5 != 0) {
            //verificacion para saber si el numero es par o impar
            cont = cont + 1;
            if (num % 2 == 0) {
                contPar = contPar + 1;
            } else {
                contImpar = contImpar + 1;
            }
            System.out.println("Ingrese otro numero entero:");
            num = leer.nextInt();
        }
        System.out.println("La cantidad de numeros leidos por el programa es de:" + cont);
        System.out.println("La cantidad de numeros PARES es de:" + contPar);
        System.out.println("La cantidad de numeros IMPARES es de:" + contImpar);
    }

}

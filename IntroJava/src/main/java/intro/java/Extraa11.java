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
public class Extraa11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int num;
        int cifras = 0;
        //desarrollo
        System.out.println("Ingrese un numero entero, y el programa corroborará la cantidad de digitos que posee");
        num = leer.nextInt();
         cifras= 0;    //esta variable es el contador de cifras
            while(num != 0){             //mientras al numero le queden cifras
                    num = num/10;         //le quitamos el último dígito
                   cifras = cifras + 1;          //sumamos 1 al contador de cifras
            }
            System.out.println("La cantidad de cifras que contiene el numero ingresado es de:" + cifras);
    }
    
}

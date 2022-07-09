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
public class Ejercicioo14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        int suma;
        int num;
        //desarrollo
        suma = 0;
        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            if (num==0){
               System.out.println("Se capturo el numero 0");
               break;
            } else if(num>0){
            suma = suma + num;
            }
        } while (num <= 19);
        
        System.out.println("La suma de los numeros ingresados es de:" + suma);
        
    }
    
}

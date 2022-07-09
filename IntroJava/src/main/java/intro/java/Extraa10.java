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
public class Extraa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int multiplicacion;
        int valorIngresado;
        //desarrollo
        num = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        multiplicacion = num * num2;
        //peticion a usuario que ingrese valor de multiplicacion
        System.out.println("El sistema ah realizado una multiplicacion entre valores aleatorios del 0 al 9");
        System.out.println("Ingrese el resultado correspondiente de dicha multiplicacion");
        valorIngresado = leer.nextInt();
        while (valorIngresado != multiplicacion) {            
            System.out.println("Ingrese el resultado correcto:");
            valorIngresado = leer.nextInt();
        }
        System.out.println("Has introducido el resultado correcto, " + multiplicacion );  
    }

}

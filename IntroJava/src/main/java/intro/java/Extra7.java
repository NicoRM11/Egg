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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea introducir");
        int n = leer.nextInt();
        int cont = 0;
        int i = 0;
        int num;
        int max = 0;
        int min = 0;
        int sumaProm = 0;
        int contProm = 0;
        int prom;
        //desarrollo
        //bucle while
        while(cont < n){
            System.out.println("Ingrese un valor para el numero " + (i+1));
            num = leer.nextInt();
            if(i==0){
            max = num;
            min = num;}
            if(num > max){
            max = num;}
            if(num < min){
            min = num;}
            i++;
            cont++;
            sumaProm = sumaProm + num;
            contProm = contProm + 1;
        }
        prom = (sumaProm/contProm);
        System.out.println("El promedio total de los numeros ingresados es de:" + prom);
        System.out.println("El maximo numero ingresado es:" + max);
        System.out.println("El minimo numero ingresado es:" + min);
    }
    
}

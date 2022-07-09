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
public class Ejercicioo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion, e importacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero:");
        int num2 = leer.nextInt();
        int opcion;
        int suma;
        int resta;
        double multiplicacion;
        double division;
        String confirmacion;
        //desarrollo
        do {
            System.out.println("MENU");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Seleccione una opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma de ambos numeros es de: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta de ambos numeros es de: " + resta);
                    break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion de ambos numeros es de: " + multiplicacion);
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println("La division de ambos numeros es de: " + division);
                    break;
                case 5:
                    System.out.println("Esta seguro/a que desea salir del programa?");
                    confirmacion = leer.next();
                    if (confirmacion.equals("si") || confirmacion.equals("Si")) {
                opcion = -10;
                     break;
            }
               
            }
        } while (opcion != -10);
        System.out.println("Gracias por utilizar el sistema , saludos!");
    }

}

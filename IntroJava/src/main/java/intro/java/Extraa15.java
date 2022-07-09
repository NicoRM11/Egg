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
public class Extraa15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        //desarrollo
        System.out.println("Ingrese un primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero:");
        num2 = leer.nextInt();
        System.out.println("MENU:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("Ingrese la operacion que desea realizar:");
        opcion = leer.nextInt();
        //funciones con distintas operaciones
        switch (opcion) {
            case 1:
                System.out.println("La suma de ambos numeros es de:" + suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta de ambos numeros es de:" + resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion de ambos numeros es de:" + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La division de ambos numeros es de:" + division(num1, num2));
                break;
            default:

        }

    }

    public static int suma(int num1, int num2) {
        int sumatoria;
        sumatoria = num1 + num2;
        return sumatoria;
    }

    public static int resta(int num1, int num2) {
        int restas;
        restas = num1 - num2;
        return restas;
    }

    public static double multiplicacion(int num1, int num2) {
        double multiplicacionn;
        multiplicacionn = num1 * num2;
        return multiplicacionn;
    }

    public static double division(int num1, int num2) {
        double divisionn;
        divisionn = num1 / num2;
        return divisionn;
    }

}

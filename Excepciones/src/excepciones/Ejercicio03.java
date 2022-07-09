/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //iniciacion
        try {
        System.out.println("Ingrese primer numero:");
        String numero1 = leer.next();
        System.out.println("Ingrese segundo numero:");
        String numero2 = leer.next();
        //conversion de string a integer
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        //realizacion de division
        double division = num1 / num2;
        System.out.println(division);
        } catch (InputMismatchException e) {
            System.out.println("El ingreso por teclado es incorrecto");
        } catch (NumberFormatException e){
            System.out.println("La cadena no puede convertirse en entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede efectuar la division por cero");
        }
        

    }
}

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
public class Ejercicioo18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion, e invocacion de clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int num;
        //desarrollo
        while (cont < 4) {
            System.out.println("Ingrese un numero que este comprendido entre 1 y 20:");
            num = leer.nextInt();
            if (num >= 1 && num <= 20) {
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {
                    System.out.print('*');
                }
                System.out.println(" ");

            }
            cont = cont + 1;
        }
    }

}

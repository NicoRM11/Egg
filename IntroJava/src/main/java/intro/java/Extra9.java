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
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int cont = 0;
        //desarrollo
        System.out.println("Ingrese un primer numero(dividendo) para la realizar la division:");
        num = leer.nextInt();
        System.out.println("Ingrese un segundo numero (divisor) para la realizar la division");
        num2 = leer.nextInt();
        do {
            num = num-num2;
            cont = cont + 1;
            
        } while (num > num2);
        System.out.println("El cociente de la division es:" + cont);
        System.out.println("El resto de la division es:" + num);
        
    }

}

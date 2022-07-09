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
public class Extraa13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //escalera de numeros
        //declaracion
        Scanner leer = new Scanner(System.in);
        int altura;
        //desarrollo
        System.out.println("Ingrese la altura de la escalera que desea");
        altura = leer.nextInt();
        String aux = "";
        //estructura de la escalera
        for (int i = 0; i < altura; i++) {
            
            aux = aux + "" + (i+1);
            System.out.println(aux);
            
        }
        
    }
    
}

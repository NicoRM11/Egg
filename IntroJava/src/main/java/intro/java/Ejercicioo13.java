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
public class Ejercicioo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //declaracion, e importacion de clase Scanner para leer por teclado
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese un valor limite positivo:");
      int valorLimite = leer.nextInt();
      int suma;
      int valor;
      //desarrollo
      suma = 0;
      do {
          System.out.println("Ingrese un valor para la suma");
          valor = leer.nextInt();
          suma = suma + valor;
      } while(suma < valorLimite);
      
     System.out.println(suma + " ah sobrepasado el valor limite de " + valorLimite);
    }
    
}

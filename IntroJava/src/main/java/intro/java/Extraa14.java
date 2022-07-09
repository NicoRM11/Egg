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
public class Extraa14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int familias;
        int hijos;
        int edad;
        int suma = 0;
        int cont = 0;
        double promedio;
        //desarrollo
        System.out.println("Ingrese la cantidad de familias que desee:");
        familias = leer.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i+1));
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1));
                edad = leer.nextInt();
                //sumatoria para la edad media de todos los hijos de todas las familias
                suma = suma + edad;
                cont = cont + 1;
            }
        }
        promedio = (suma/cont);
        System.out.println("La edad media de todos los hijos de todas las familias es de:" + promedio);
        
    }
    
}

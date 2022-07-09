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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas con las que desee ingresar sus alturas:");
        int n = leer.nextInt();
        int [] cantPersonas = new int [n];
        double altura;
        double sumaPromMenor = 0;
        double sumaPromTotal = 0;
        int cont = 0;
        int cont2 = 0;
        double promTotal;
        double promMenor;
        //desarrollo
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura para la persona n°" + (i+1));
            altura = leer.nextDouble();
            if(altura < 1.60){
            sumaPromMenor = sumaPromMenor + altura;
            cont = cont + 1;
            }
            sumaPromTotal = sumaPromTotal + altura;
            cont2 = cont2 + 1;
        }
        //operaciones de promedio de alturas, y muestra por pantalla
        promTotal = (sumaPromTotal / cont2);
        promMenor = (sumaPromMenor / cont);
        System.out.println("El promedio de las personas que miden menos que 1.60m es de: " + promMenor + "m");
        System.out.println("El promedio del total de personas es de: " + promTotal + "m");
    }
    
}

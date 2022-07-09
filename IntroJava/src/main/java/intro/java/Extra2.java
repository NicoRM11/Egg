/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

/**
 *
 * @author Nicolas Romano
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aux;
        //desarrollo
        System.out.println("A=" + a);
        System.out.println("B=" + b);
        System.out.println("C=" + c);
        System.out.println("D=" + d);
        //pasaje de valores entre variables
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        //muestra por pantalla
        System.out.println("C-->B = " + b);
        System.out.println("A-->C = " + c);
        System.out.println("D-->A = " + a);
        System.out.println("B-->D = " + d);
    }
    
}

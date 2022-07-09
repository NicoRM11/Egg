/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //creacion de lista para guardar numeros
        ArrayList<Numero> listaNumeros = new ArrayList();
        NumeroService ns = new NumeroService(); //creacion de objeto numero service, para guardar numeros
        boolean verificacion = true;
        while (verificacion == true) {
            System.out.println("Ingrese un valor numerico a agregar en la lista, con el valor -99 la misma se cierra:");
            Integer num = leer.nextInt();
            if (num == -99) {
                verificacion = false;
            } else {
                listaNumeros.add(ns.agregarNumero(num));
            }
        }

        //muestra por pantalla de numeros
        for (Numero aux : listaNumeros) {
            System.out.println(aux.toString());
        }

        //suma de numeros
        Numero cont = ns.agregarNumero(0);
        for (Numero aux : listaNumeros) {
            cont.setValor(aux.getValor() + cont.getValor());
        }
        System.out.println("---------------");
        System.out.println("La suma de los valores es de:");
        System.out.println(cont.getValor());

        //promedio
        System.out.println("---------------");
        System.out.println("El promedio aproximado de los valores es de:");
        System.out.println(cont.getValor() / listaNumeros.size());
        
    }

}

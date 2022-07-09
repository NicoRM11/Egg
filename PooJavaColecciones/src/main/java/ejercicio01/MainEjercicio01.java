/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<RazaPerro> lista = new ArrayList();//creo una lista para ir almacenando las razas de los perros
        ServicioRazaPerro rs = new ServicioRazaPerro();
        Scanner leer = new Scanner(System.in);
        String agregar;
        boolean verificar = true;
        while (verificar == true) {
            System.out.println("Ingrese un nuevo nombre de raza:");
            lista.add(rs.llamarRaza(leer.next()));
            System.out.println("Desea agregar otra raza:");
            agregar = leer.next();
            if (agregar.equals("si")) {
                verificar = true;
            } else {
                verificar = false;
            }
        }
        //mostrar lista con nombres de las razas
        System.out.println("La lista de las razas ingresadas es:");
        for (RazaPerro aux : lista) {
            System.out.println(aux);
        }
        
        
        

        System.out.println("*************"); //ejercicio 2
        Iterator<RazaPerro> it = lista.iterator();
        System.out.println("Ingrese una raza para buscar en la lista y removerla:");
        RazaPerro razaABuscar = rs.llamarRaza(leer.next());
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().equals(razaABuscar)) {
                it.remove();
                cont++;
            }

        }
        if (cont == 0) {
            System.out.println("La raza no se encuentra registrada en la lista:");
        }
        //se muestra por pantalla la lista ordenada
        for (RazaPerro aux : lista) {
            System.out.println(aux);
        }
    }

}

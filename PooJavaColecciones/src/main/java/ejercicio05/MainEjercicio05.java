/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //creacion de conjunto de paises
        HashSet<Pais> conjuntoPais = new HashSet();
        //creacion de objeto pais service para crear objeto pais
        PaisService ps = new PaisService();
        //bucle para agregar paises
        boolean verificacion = true;
        String agregar;
        do {
            conjuntoPais.add(ps.crearPais());
            System.out.println("Desea ingresar otro pais al conjunto?:");
            agregar = leer.next();
            if (agregar.equalsIgnoreCase("si")) {
                continue;
            } else {
                verificacion = false;
            }
        } while (verificacion == true);

        //lista de paises para pasarle el conjunto de paises por parametro
        ArrayList<Pais> listaPais = new ArrayList(conjuntoPais);

        //mostrar por pantalla las peliculas
        System.out.println("--------------------------");
        for (Pais aux : listaPais) {
            System.out.println(aux.toString());
        }

        //se muestra por pantalla el conjunto ordenado
        System.out.println("--------------------------");
        System.out.println("Paises ordenados alfabeticamente:");
        listaPais.sort(Comparadores.ordenarPais);
        for (Pais aux : listaPais) {
            System.out.println(aux);
        }

        //se elimina un pais pedido
        System.out.println("--------------------------");
        System.out.println("Ingrese un pais a eliminar:");
        String buscar = leer.next();
        for (int i = 0; i < listaPais.size(); i++) {
            Pais p = listaPais.get(i);
            if (p.getNombre().equals(buscar)) {
                listaPais.remove(p);
            }
        }

        //se muestra la lista final
        for (Pais aux : listaPais) {
            System.out.println(aux);
        }
    }
}

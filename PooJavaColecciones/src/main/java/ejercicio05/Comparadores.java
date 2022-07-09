/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Comparator;

/**
 *
 * @author Nicolas Romano
 */
public class Comparadores {
    //ordenar alfabeticamente el set de paises
    public static Comparator<Pais> ordenarPais = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
        return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}

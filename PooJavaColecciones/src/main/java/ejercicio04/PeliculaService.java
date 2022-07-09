/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula cargarPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula:");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula:");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula(en horas):");
        p1.setDuracion(leer.nextInt());

        return p1;

    }

}

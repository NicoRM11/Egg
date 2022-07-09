/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import ejercicio04.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PeliculaService ps = new PeliculaService(); //creacion de objeto en PeliculaService para cargar peliculas
        ArrayList<Pelicula> listaPeliculas = new ArrayList(); //creacion de lista de peliculas
        //bucle para cargar peliculas
        boolean verificacion = true;
        String agregar;
        do {
            Pelicula p1 = ps.cargarPelicula();
            listaPeliculas.add(p1); //agrega una pelicula a la lista
            System.out.println("Desea agregar otra pelicula a la lista?");
            agregar = leer.next();
            if (agregar.equalsIgnoreCase("si")) {
                verificacion = true;
            } else {
                verificacion = false;
            }
        } while (verificacion == true);

        //muestra de pantalla de todas las peliculas
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

        System.out.println("***************************");

        //muestra por pantalla de todas las peliculas que tengan duracion mayor a 1 hora
        System.out.println("Peliculas que tienen una duracion mayor a 1 hora:");
        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion() >= 1) {
                System.out.println(listaPelicula.toString());
            }
        }

        System.out.println("***************************");

        //metodo para ordenar peliculas de acuerdo a la duracion (de mayor a menor)
        System.out.println("Peliculas en orden de duracion(mayor a menor):");
        listaPeliculas.sort(Comparadores.compararDuracionMayorAMenor);
        for (Pelicula listaPelicula : listaPeliculas) { //se muestra por pantalla
            System.out.println(listaPelicula.toString());
        }

        System.out.println("***************************");

        //metodo para ordenar peliculas de menor a mayor de acuerdo a su duracion
        System.out.println("Peliculas en orden de duracion(menor a mayor):");
        listaPeliculas.sort(Comparadores.compararDuracionMenorAMayor);
        for (Pelicula listaPelicula : listaPeliculas) { //se muestra por pantalla
            System.out.println(listaPelicula.toString());
        }

        System.out.println("***************************");
        
        //metodo para ordenar las peliculas por titulo
        System.out.println("Peliculas en orden alfabético por titulo:");
        listaPeliculas.sort(Comparadores.ordenTitulo);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

        System.out.println("***************************");

        //metodo para ordenar peliculas por director
        System.out.println("Peliculas en orden alfabetico por director:");
        listaPeliculas.sort(Comparadores.ordenDirector);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

    }
}

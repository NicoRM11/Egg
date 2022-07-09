/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import java.util.UUID;
import libreria.entidades.Libro;
import libreria.persistencia.DAOLibro;

/**
 *
 * @author Nicolas Romano
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialServicio es = new EditorialServicio();
    AutorServicio as = new AutorServicio();
    DAOLibro dl = new DAOLibro();

    //metodo para crear libro
    public Libro crearLibro() {
        Libro l1 = new Libro();
        l1.setIsbn(UUID.randomUUID().toString());
        System.out.println("Ingrese titulo del libro:");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese año:");
        l1.setAnio(leer.nextInt());
        System.out.println("Ingrese cantidad de ejemplares");
        l1.setEjemplares(leer.nextInt());
        l1.setEjemplaresPrestados(0);
        l1.setEjemplaresRestantes(l1.getEjemplares());
        //metodo para crear autor, y setear en libro
        l1.setAutor(as.crearAutor());
        //metodo para crear editorial, y setear en libro
        l1.setEditorial(es.crearEditorial());
        l1.setAlta(true);
        dl.guardarLibro(l1);
        return l1;
    }

    //metodo para guardar libro en base de datos
    public void guardarLibro(Libro l1) {
        dl.guardarLibro(l1);
    }

    //metodo para editar libro en base de datos
    public void editarLibro(Libro l1) {
        boolean verificacion = true;
        do {
            System.out.println("Seleccione lo que quiera editar de libro:");
            System.out.println("1-Titulo");
            System.out.println("2-Año");
            System.out.println("3-Ejemplares");
            System.out.println("4-Ejemplares prestados");
            System.out.println("5-Ejemplares disponibles");
            System.out.println("6-Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nuevo titulo:");
                    l1.setTitulo(leer.next());
                    break;
                case 2:
                    System.out.println("Nuevo año:");
                    l1.setAnio(leer.nextInt());
                    break;
                case 3:
                    System.out.println("Ejemplares:");
                    l1.setEjemplares(leer.nextInt());
                    break;
                case 4:
                    System.out.println("Prestados:");
                    l1.setEjemplaresPrestados(leer.nextInt());
                    break;
                case 5:
                    System.out.println("Disponibles:");
                    l1.setEjemplaresRestantes(leer.nextInt());
                    break;
                case 6:
                    verificacion = false;
                    break;

            }
        } while (verificacion == true);
        dl.editarLibro(l1);

    }

    public void eliminarLibro(Libro l1) {
        dl.eliminarLibro(l1);
    }
}

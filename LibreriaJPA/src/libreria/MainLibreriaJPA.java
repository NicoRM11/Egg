/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;


/**
 *
 * @author Nicolas Romano
 */
public class MainLibreriaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner para leer por teclado
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroService ls = new LibroService();
        EditorialService es = new EditorialService();
        AutorService as = new AutorService();
       
        // menu para llamar a metodos de servicios
        System.out.println("Crear libro:");
        ls.crearLibro();
        boolean verificacion = true;
        do {
            System.out.println("-----------");
            System.out.println("MENU LIBRERIA");
            System.out.println("1- Buscar un autor por nombre");
            System.out.println("2- Buscar un libro por isbn");
            System.out.println("3- Buscar un libro por titulo");
            System.out.println("4- Buscar un libro por nombre de autor");
            System.out.println("5- Buscar un libro por nombre de editorial");
            System.out.println("6- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    as.buscarAutorPorNombre();
                    break;
                case 2:
                    ls.buscarLibroPorISBN();
                    break;
                case 3:
                    ls.buscarLibroPorTitulo();
                    break;
                case 4:
                    ls.buscarLibroNombreAutor();
                    break;
                case 5:
                    ls.buscarLibroNombreEditorial();
                    break;
                case 6:
                    verificacion = false;
                    break;
            }
        } while (verificacion == true);
        
        
    }
    
}

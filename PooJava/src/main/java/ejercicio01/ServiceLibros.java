/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class ServiceLibros {

    Scanner leer = new Scanner(System.in);

    public Libros pedidoDeLibro() {
        //instanciar un objeto de tipo libro, o crear un objeto de tipo libro
        Libros l1 = new Libros();
        System.out.println("Ingrese el titulo del libro:");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el numero de ISBN");
        l1.setIsbn(leer.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas");
        l1.setNumeroPaginas(leer.nextInt());
        return l1;
    }

    public void muestraDeLibros(Libros l1) {
        System.out.println("Libro:" + l1.getTitulo());
        System.out.println("Autor:" + l1.getAutor());
        System.out.println("ISBN:" + l1.getIsbn());
        System.out.println("Numero de paginas:" + l1.getNumeroPaginas());

    }
}

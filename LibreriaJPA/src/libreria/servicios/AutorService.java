/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import libreria.entidades.Autor;
import libreria.persistencia.DAOAutor;

/**
 *
 * @author Nicolas Romano
 */
public class AutorService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DAOAutor da = new DAOAutor();
    
    public Autor crearAutor() {
        Autor a1 = new Autor();
        a1.setId(UUID.randomUUID().toString());
        System.out.println("Ingrese nombre de autor");
        a1.setNombre(leer.next());
        a1.setAlta(true);
        da.guardarAutor(a1);
        return a1;
    }

    //metodo para editar autor
    public void editarAutor(Autor a1) {
        System.out.println("Seleccione nuevo nombre para autor:");
        a1.setNombre(leer.next());
        da.editarAutor(a1);
    }

    //metodo para eliminar autor
    public void eliminarAutor(Autor a1) {
        da.eliminarAutor(a1);
    }
    
    //metodo para buscar autor por nombre
    public void buscarAutorPorNombre(){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        List<Autor> autor = da.buscarAutorPorNombre(nombre);
        System.out.println(autor.toString());
    }
    
}

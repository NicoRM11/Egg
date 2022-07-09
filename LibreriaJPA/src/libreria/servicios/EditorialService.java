/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import java.util.UUID;
import libreria.entidades.Editorial;
import libreria.persistencia.DAOEditorial;

/**
 *
 * @author Nicolas Romano
 */
public class EditorialService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DAOEditorial de = new DAOEditorial();

    //metodo para crear editorial
    public Editorial crearEditorial() {
        Editorial e1 = new Editorial();
        e1.setId(UUID.randomUUID().toString());
        System.out.println("Ingrese nombre de editorial:");
        e1.setNombre(leer.next());
        e1.setAlta(true);
        de.guardarEditorial(e1);
        return e1;
    }

    //metodo para editar editorial en libreria
    public void editarEditorial(Editorial e1) {
        System.out.println("Ingrese nuevo nombre:");
        e1.setNombre(leer.next());
        de.editarEditorial(e1);
    }
    
    public void eliminarEditorial(Editorial e1) {
        de.eliminarEditorial(e1);
    }
}

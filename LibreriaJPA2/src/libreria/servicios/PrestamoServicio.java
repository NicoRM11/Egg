/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.DAOLibro;
import libreria.persistencia.DAOPrestamo;

/**
 *
 * @author Nicolas Romano
 */
public class PrestamoServicio {

    DAOPrestamo dp = new DAOPrestamo();
    DAOLibro dl = new DAOLibro();
    //metodo para generar un nuevo prestamo
    public Prestamo nuevoPrestamo(Cliente c1, Libro l1) {
        Prestamo p1 = new Prestamo();
        p1.setId(UUID.randomUUID().toString());
        p1.setFechaPrestamo(new Date());
        p1.setFechaDevolucion(null);
        p1.setLibro(l1);
        p1.setCliente(c1);

        l1.setEjemplaresRestantes(l1.getEjemplaresRestantes() - 1);
        l1.setEjemplaresPrestados(l1.getEjemplaresPrestados() + 1);
        dl.editarLibro(l1);
        dp.guardarPrestamo(p1);
        return p1;
    }

    public void devolucionLibro(Prestamo p1, Libro l1) {
        if (l1.getEjemplaresRestantes() == 0) {
            System.out.println("No se encuentran mas ejemplares del libro disponibles");
        } else {
            p1.setFechaDevolucion(new Date());
            dp.editarPrestamo(p1);
        }
    }
    
    public void busquedaPrestamosPorId(Cliente c1){
    String id = c1.getId();
    List<Prestamo> listaPrestamos = dp.busquedaPrestamos(id);
    }
    

}

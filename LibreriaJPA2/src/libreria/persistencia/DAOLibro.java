/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Libro;

/**
 *
 * @author Nicolas Romano
 */
public class DAOLibro extends DAO {
     public void guardarLibro(Libro l1) {
        conectar();
        em.getTransaction().begin();
        em.persist(l1);
        em.getTransaction().commit();
        desconectar();
    }

    public void editarLibro(Libro l1) {
        conectar();
        em.getTransaction().begin();
        em.merge(l1);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void eliminarLibro(Libro l1){
       conectar();
       em.getTransaction().begin();
       em.remove(l1);
       em.getTransaction().commit();
       desconectar();
    }
}

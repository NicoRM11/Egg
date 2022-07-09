/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author Nicolas Romano
 */
public class DAOEditorial extends DAO {
    //metodos para agregar, editar o eliminar editorial
    public void guardarEditorial(Editorial e1) {
        conectar();
        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        desconectar();
    }

    public void editarEditorial(Editorial e1) {
        conectar();
        em.getTransaction().begin();
        em.merge(e1);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void eliminarEditorial(Editorial e1){
       conectar();
       em.getTransaction().begin();
       em.remove(e1);
       em.getTransaction().commit();
       desconectar();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Autor;

/**
 *
 * @author Nicolas Romano
 */
public class DAOAutor extends DAO {

    //metodo para guardar autor en base de datos
    public void guardarAutor(Autor a1) {
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();
    }

    //metodo para editar en base de datos
    public void editarAutor(Autor a1) {
        em.getTransaction().begin();
        em.merge(a1);
        em.getTransaction().commit();
    }
    
    //metodo para eliminar de base de datos
    public void eliminarAutor(Autor a1){
       em.getTransaction().begin();
       em.remove(a1);
       em.getTransaction().commit();
    }

}

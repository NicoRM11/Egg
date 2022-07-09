/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Nicolas Romano
 */
public class DAOAutor extends DAO {

    //metodos para agregar, editar o eliminar autor
    public void guardarAutor(Autor a1) {
        conectar();
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();
        desconectar();
    }

    public void editarAutor(Autor a1) {
        conectar();
        em.getTransaction().begin();
        em.merge(a1);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void eliminarAutor(Autor a1){
       conectar();
       em.getTransaction().begin();
       em.remove(a1);
       em.getTransaction().commit();
       desconectar();
    }
    
    //metodo para buscar autor por nombre
    public List<Autor> buscarAutorPorNombre(String name){
    List <Autor> autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :name").setParameter("name", name).getResultList();
    return autor;
    }
    
    
    
    
}

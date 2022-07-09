/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Cliente;

/**
 *
 * @author Nicolas Romano
 */
public class DAOCliente extends DAO {
     public void guardarCliente(Cliente c1) {
        conectar();
        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();
        desconectar();
    }

    public void editarCliente(Cliente c1) {
        conectar();
        em.getTransaction().begin();
        em.merge(c1);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void eliminarCliente(Cliente c1){
       conectar();
       em.getTransaction().begin();
       em.remove(c1);
       em.getTransaction().commit();
       desconectar();
    }
}

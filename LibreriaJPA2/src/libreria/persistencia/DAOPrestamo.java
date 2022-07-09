/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author Nicolas Romano
 */
public class DAOPrestamo extends DAO {

    public void guardarPrestamo(Prestamo p1) {
        conectar();
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        desconectar();
    }

    public void editarPrestamo(Prestamo p1) {
        conectar();
        em.getTransaction().begin();
        em.merge(p1);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminarPrestamo(Prestamo p1) {
        conectar();
        em.getTransaction().begin();
        em.remove(p1);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Prestamo> busquedaPrestamos(String id) {
        conectar();
        List<Prestamo> listaPrestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.id = :id").setParameter("id", id).getResultList();
        desconectar();
        for (Prestamo aux : listaPrestamos) {
            System.out.println(aux.toString());
        }
        return listaPrestamos;
    }
}

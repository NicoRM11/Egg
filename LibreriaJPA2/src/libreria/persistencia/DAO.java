/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nicolas Romano
 */
public class DAO {

    //creacion de Entity Manager para editar tablas en base de datos, y realizar consultas
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaJPA2PU");
    EntityManager em = emf.createEntityManager();

    //metodo para conectar en base de datos
    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    //metodo para desconectar de base de datos
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }

    }

}

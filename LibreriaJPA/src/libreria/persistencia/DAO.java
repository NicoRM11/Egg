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

    //creacion de entity manager
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaJPAPU");
    protected EntityManager em = emf.createEntityManager();

    //creacion de metodos para conectar y desconectar de base de datos
    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }

    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
}

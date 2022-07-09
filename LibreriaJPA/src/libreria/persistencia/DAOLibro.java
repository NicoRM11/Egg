/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Nicolas Romano
 */
public class DAOLibro extends DAO{
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
    
    //metodo para buscar libro por ISBN
    public Libro buscarLibroPorISBN(String isbn){
    conectar();
    Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
    desconectar();
    return libro;
    }
    
    //metodo para buscar libro por titulo
    public Libro buscarLibroPorTitulo(String titulo){
    Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
    return libro;
    }
    
    //metodo para buscar libro por nombre de autor
    public List<Libro> buscarLibroNombreAutor(String nombre){
    conectar();
        List<Libro> listaLibros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre").setParameter("nombre", nombre).getResultList();
    desconectar();
        return listaLibros;
    }
    
    //metodo para buscar libro por nombre de editorial
    public List<Libro> buscarLibroNombreEditorial(String nombre){
    List<Libro> listaLibros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombre").setParameter("nombre", nombre).getResultList();
    return listaLibros;
    }
    
    
}

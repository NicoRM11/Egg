/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

/**
 *
 * @author Nicolas Romano
 */
public class Cancion {
    //atributos
    private String autor;
    private String titulo;
    //constructores
    public Cancion() {
    }
    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }
    //getters y setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
     
}

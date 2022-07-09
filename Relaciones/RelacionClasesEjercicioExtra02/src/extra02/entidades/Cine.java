/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.entidades;

/**
 *
 * @author Nicolas Romano
 */
public class Cine {
    //atributos
    private Pelicula pelicula;
    private String [][] asientosSala = new String[8][6];
    private Espectador [][] sala = new Espectador[8][6];
    private Integer precioEntrada;
    
    //constructor

    public Cine() {
    }
    
    //get y set

    public String[][] getAsientosSala() {
        return asientosSala;
    }

    public void setAsientosSala(String[][] asientosSala) {
        this.asientosSala = asientosSala;
    }
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    
    
}

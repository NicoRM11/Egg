/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03.entidades;

/**
 *
 * @author Nicolas Romano
 */
public class Hotel5Estrellas extends Hotel {
    //atributos
    private String gimnasio;
    private String nombreRestaurante;
    private Integer capacidadRestaurante;
    private Integer cantidadSalones;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;
    //constructores

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadSalones, Integer cantidadSuites, Integer cantidadLimosinas) {
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }
    
    //get y set

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Integer getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(Integer cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }
    
}

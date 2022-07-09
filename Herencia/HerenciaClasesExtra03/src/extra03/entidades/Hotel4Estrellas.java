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
public class Hotel4Estrellas extends Hotel {
    //atributos
    private String gimansio;
    private String nombreRestaurante;
    private Integer capacidadRestaurante;
    //constructores

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimansio, String nombreRestaurante, Integer capacidadRestaurante, String nombre, String direccion, String localidad, String gerenteEncargado, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Integer precioHabitaciones) {
        super(nombre, direccion, localidad, gerenteEncargado, cantHabitaciones, numCamas, cantPisos, precioHabitaciones);
        this.gimansio = gimansio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    //get y set

    public String getGimansio() {
        return gimansio;
    }

    public void setGimansio(String gimansio) {
        this.gimansio = gimansio;
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
    
    
    
}

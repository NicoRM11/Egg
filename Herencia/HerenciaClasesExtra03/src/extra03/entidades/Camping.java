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
public class Camping extends ExtraHotelero {
    //atributos
    private Integer capMaximaCarpas;
    private Integer cantBañoDisponibles;
    private boolean poseeRestaurante;
    //constructores

    public Camping() {
    }

    public Camping(Integer capMaximaCarpas, Integer cantBañoDisponibles, boolean poseeRestaurante, String nombre, String direccion, String localidad, String gerenteEncargado, boolean privado, Integer metrosCuadrados) {
        super(nombre, direccion, localidad, gerenteEncargado, privado, metrosCuadrados);
        this.capMaximaCarpas = capMaximaCarpas;
        this.cantBañoDisponibles = cantBañoDisponibles;
        this.poseeRestaurante = poseeRestaurante;
    }
    
    //get y set

    public Integer getCapMaximaCarpas() {
        return capMaximaCarpas;
    }

    public void setCapMaximaCarpas(Integer capMaximaCarpas) {
        this.capMaximaCarpas = capMaximaCarpas;
    }

    public Integer getCantBañoDisponibles() {
        return cantBañoDisponibles;
    }

    public void setCantBañoDisponibles(Integer cantBañoDisponibles) {
        this.cantBañoDisponibles = cantBañoDisponibles;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }
    
    
}

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
public class ExtraHotelero {
    //atributos
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerenteEncargado;
    protected boolean privado;
    protected Integer metrosCuadrados;
    //constructores

    public ExtraHotelero() {
    }

    public ExtraHotelero(String nombre, String direccion, String localidad, String gerenteEncargado, boolean privado, Integer metrosCuadrados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
}

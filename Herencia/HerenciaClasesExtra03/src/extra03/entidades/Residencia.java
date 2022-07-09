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
public class Residencia extends ExtraHotelero {
    //aributos
    private Integer cantHabitaciones;
    private boolean dtoGremios;
    private boolean poseeCampoDeportivo;
    //constructores

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, boolean dtoGremios, boolean poseeCampoDeportivo, String nombre, String direccion, String localidad, String gerenteEncargado, boolean privado, Integer metrosCuadrados) {
        super(nombre, direccion, localidad, gerenteEncargado, privado, metrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.dtoGremios = dtoGremios;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }
    
    //get y set

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDtoGremios() {
        return dtoGremios;
    }

    public void setDtoGremios(boolean dtoGremios) {
        this.dtoGremios = dtoGremios;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }
    
    
    
}

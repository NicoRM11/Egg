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
public final class Polideportivo extends Edificio {
    //atributos
    private String nombre;
    private String tipoDeInstalacion;
    //constructores

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    
}

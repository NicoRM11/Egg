/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.entidades;

/**
 *
 * @author Nicolas Romano
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Integer documento;
    private Integer edad;
    private Perro perroDePersona;

    //construtor
    public Persona() {
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getPerroDePersona() {
        return perroDePersona;
    }

    public void setPerroDePersona(Perro perroDePersona) {
        this.perroDePersona = perroDePersona;
    }

    //metodo to String para mostrar por pantalla
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", perroDePersona=" + perroDePersona + '}';
    }

}

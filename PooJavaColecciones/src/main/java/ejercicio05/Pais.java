/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author Nicolas Romano
 */
public class Pais {
    //atributos
    private String nombre;
    //constructor

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodo to String

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }
    
    
}

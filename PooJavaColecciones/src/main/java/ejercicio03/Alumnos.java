/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Romano
 */
public class Alumnos {
    //atributos
    private String nombre;
    private ArrayList <Integer> notas = new ArrayList();
    //constructores

    public Alumnos() {
    }

    public Alumnos(String nombre) {
        this.nombre = nombre;
    }
    
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    
    
    
    
}

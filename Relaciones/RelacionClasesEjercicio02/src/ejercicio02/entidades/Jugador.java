/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.entidades;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Romano
 */
public class Jugador {
    //atributos
    private String nombre = "Jugador";
    private ArrayList<Integer> id = new ArrayList();
    private boolean mojado = false;
    //constructor

    public Jugador() {
    }
    //get y set

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getId() {
        return id;
    }

    public void setId(ArrayList<Integer> id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", mojado=" + mojado + '}';
    }
    
    
   
    
        
}

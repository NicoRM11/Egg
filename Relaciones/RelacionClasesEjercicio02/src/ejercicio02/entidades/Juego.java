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
public class Juego {
    //atributos
    private ArrayList <Integer> jugadores = new ArrayList();
    private RevolverDeAgua revolver = new RevolverDeAgua();
    //constructor

    public Juego() {
    }
    //get y set

    public ArrayList<Integer> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Integer> jugadores) {
        this.jugadores = jugadores;
    }

   

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    
    
}

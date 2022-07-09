/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author Nicolas Romano
 */
public class Cadena {
    //atributos
    private String frase;
    private int longitudFrase;
    //constructor vacio

    public Cadena() {
    }
    //setters y getters

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }
    
}

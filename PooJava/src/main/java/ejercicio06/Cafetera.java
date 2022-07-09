/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author Nicolas Romano
 */
public class Cafetera {
    //atributos
    private int capMaxima;
    private int capActual;
    //constructores

    public Cafetera() {
    }

    public Cafetera(int capMaxima, int capActual) {
        this.capMaxima = capMaxima;
        this.capActual = capActual;
    }
    
    //getters and setters

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }
    
    
}

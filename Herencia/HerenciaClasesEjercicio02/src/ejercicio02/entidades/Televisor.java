/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.entidades;

/**
 *
 * @author Nicolas Romano
 */
public final class Televisor extends Electrodomestico {
    //atributos
    private double resolucion;
    private boolean sintonizadorTDT;
    //constructores

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

   
    
    
}

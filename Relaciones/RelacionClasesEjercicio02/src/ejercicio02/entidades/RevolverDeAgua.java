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
public class RevolverDeAgua {

    //atributos
    private Integer posActual;
    private Integer posAgua;
    //constructor

    public RevolverDeAgua() {
    }
    //get y set

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }
    
 

    //metodo to String
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

}

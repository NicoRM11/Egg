/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author Nicolas Romano
 */
public class RazaPerro {

    //atributos
    private String raza;
    
    //constructores

    public RazaPerro() {
    }
    //get y set

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //metodo para mostrar por pantalla, to String
    @Override
    public String toString() {
        return "Raza:" + raza ;
    }

}

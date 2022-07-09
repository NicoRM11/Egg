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
public final class Lavadora extends Electrodomestico {
    //atributos
    private Integer carga;
    //constructores

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

   
    
    //get y set

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

   
    

   
    
}

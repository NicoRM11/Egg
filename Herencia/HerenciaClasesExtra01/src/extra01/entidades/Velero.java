/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01.entidades;

/**
 *
 * @author Nicolas Romano
 */
public final class Velero extends Barco {
    //atributos
    private Integer numeroMastiles;
    //constructores

    public Velero() {
    }
    

    public Velero(Integer numeroMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    //getter y setter

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    
}

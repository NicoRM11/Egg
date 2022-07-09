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
public final class BarcoAMotor extends Barco {
    //atributos
    private Integer potenciaCV;
    //constructores

    public BarcoAMotor() {
    }
    

    public BarcoAMotor(Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    
    //get y set

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
}

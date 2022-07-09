/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.entidades;

/**
 *
 * @author Nicolas Romano
 */
public final class EdificioDeOficinas extends Edificio  {
    private Integer numOficinas;
    private Integer cantPersonasPorOficina;
    private Integer numPisos;
    //constructores

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasPorOficina, Integer numPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }
    
    //get y set

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(Integer cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }
    
}

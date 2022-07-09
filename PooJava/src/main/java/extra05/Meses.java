/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra05;

/**
 *
 * @author Nicolas Romano
 */
public class Meses {
    //atributos
    private String [] meses = new String[12];
    private String mesSecreto;
    //constructor

    public Meses() {
    }
    //get y set

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}

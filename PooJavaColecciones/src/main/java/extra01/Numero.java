/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

/**
 *
 * @author Nicolas Romano
 */
public class Numero {
    //atributos
    private Integer valor;
    //constructor

    public Numero() {
    }

    public Numero(Integer valor) {
        this.valor = valor;
    }
    
    
    //get y set

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    //metodo to String

    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
}

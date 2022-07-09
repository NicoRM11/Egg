/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.entidades;

import ejercicio04.interfaces.CalculosFormas;

/**
 *
 * @author Nicolas Romano
 */
public class Rectangulo implements CalculosFormas {

    //atributos
    private Integer base;
    private Integer altura;
    //constructores

    public Rectangulo() {
    }
    
    
    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }
    //getters

    public Integer getBase() {
        return base;
    }

    public Integer getAltura() {
        return altura;
    }

    //metodo para calcular el area
    @Override
    public void calculoArea() {
        Rectangulo r1 = new Rectangulo(20, 20);
        Integer area = r1.getBase() + r1.getAltura();
        System.out.println("La altura del rectangulo es de:" + area);
    }

    @Override
    public void calculoPerimetro() {
        Rectangulo r1 = new Rectangulo(20, 20);
        Integer perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("La altura del rectangulo es de:" + perimetro);
    }

}

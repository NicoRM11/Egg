/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.entidades;

import ejercicio04.interfaces.CalculosFormas;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class Circulo implements CalculosFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //atributos
    private Integer radio;
    private Integer perimetro;
    //constructores

    public Circulo() {
    }
    
    public Circulo(Integer radio, Integer perimetro) {
        this.radio = radio;
        this.perimetro = perimetro;
    }

    //getter
    public Integer getRadio() {
        return radio;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    //metodo para calcular el area
    @Override
    public void calculoArea() {
        Circulo c1 = new Circulo(3, 6);
        Double area = PI * Math.pow(c1.getRadio(), 2);
        System.out.println("El area del circulo es de:" + area);
    }

    @Override
    public void calculoPerimetro() {
        Circulo c1 = new Circulo(3, 3);
        Double perimetro = PI * c1.getPerimetro();
        System.out.println("El perimetro del circulo es de:" + perimetro);
    }

}

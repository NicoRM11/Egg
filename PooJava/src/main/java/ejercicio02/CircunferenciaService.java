/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class CircunferenciaService {
    
    Scanner leer = new Scanner(System.in);
    
    //metodo para crear una circunferencia, con peticion del radio y guarde en el atributo del objeto
    public Circunferencia peticionRadio(){
        System.out.println("Ingrese el radio para la circunferencia:");
        return new Circunferencia(leer.nextDouble());
    }
    

    //metodo para calcular el area
    public double area(Circunferencia c1) {
        return ((3.14) * (c1.getRadio() * c1.getRadio()));
    }

    //metodo para calcular el perimetro
    public double perimetro(Circunferencia c1) {
        double perimetro = 2 * 3.14 * c1.getRadio();
        return perimetro;
    }
    

}

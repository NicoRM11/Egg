/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class RectanguloService {

    //importacion de clase Scanner para leer por teclado
    Scanner leer = new Scanner(System.in);

    //metodo para la peticion a usuario de altura y base
    public Rectangulo peticionAlturaYbase() {
        int altura;
        int base;
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        System.out.println("Ingrese la base del rectangulo:");
        base = leer.nextInt();
        return new Rectangulo(altura, base);
    }

    //metodo para calcular la superficie del rectangulo
    public int superficie(Rectangulo r1) {
        return r1.getAltura() * r1.getBase();
    }

    //metodo para calcular el perimetro del rectangulolo
    public int perimetro(Rectangulo r1) {
        return ((r1.getAltura() + r1.getBase()) * 2);
    }

}

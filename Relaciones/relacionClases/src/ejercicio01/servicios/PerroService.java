/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.servicios;

import ejercicio01.entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PerroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro p1 = new Perro();
        System.out.println("Ingrese el nombre del perro");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro:");
        p1.setRaza(leer.next());
        System.out.println("Ingrese la edad:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su tamaño:");
        p1.setTamaño(leer.next());
        return p1;
    }

}

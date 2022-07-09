/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.servicios;

import ejercicio01.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        p1.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona:");
        p1.setDocumento(leer.nextInt());
        return p1;
    }
}

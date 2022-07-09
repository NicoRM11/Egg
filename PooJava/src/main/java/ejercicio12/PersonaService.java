/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    //metodo para crear persona
    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Nombre de la persona:");
        p1.setNombre(leer.nextLine());
        System.out.println("Dia de nacimiento:");
        int diaNacimiento = leer.nextInt();
        System.out.println("Mes de nacimiento:");
        int mesNacimiento = leer.nextInt();
        System.out.println("Año de nacimiento:");
        int anioNacimiento = leer.nextInt();
        Date fechaNacimiento = new Date(anioNacimiento, mesNacimiento, diaNacimiento);
        p1.setFechaNacimiento(fechaNacimiento);
        return p1;

    }

    public void calcularEdad(Persona p1) {
        Date fechaActual = new Date();
        int edadEnAnios = fechaActual.getYear() - p1.getFechaNacimiento().getYear();;
        System.out.println("La edad en años de la persona es: " + edadEnAnios);
    }

    public void menorQue(Persona p1) {
        boolean menor = false;
        Date fecha = new Date();
        System.out.println("Ingrese la edad de otra persona:");
        int edad = leer.nextInt();
        if ((fecha.getYear() - p1.getFechaNacimiento().getYear()) > edad) {
            menor = true;
        } else {
            menor = false;
        }
        System.out.println("La edad es menor? : " + menor);
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.getNombre());
        System.out.println(p1.getFechaNacimiento());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    //metodo para crear persona
    public Persona crearPersona(){
      Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso de la persona:");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura de la persona:");
        p1.setAltura(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona:");
        String sexo = leer.next();
        p1.setSexo(sexo);
    return p1;
    }
    
    public int calcularMC(Persona p1){
    double formulaPeso;
    int cont = 0;
    formulaPeso = p1.getPeso() / (p1.getAltura() * p1.getAltura());
    //verificacion si persona esta por debajo de su peso, en peso ideal, o sobrepeso
    if(formulaPeso < 20){
    cont = -1;
    } else if(formulaPeso == 20){
    cont = 0;
    } else if(formulaPeso > 20){
    cont = 1;}
    return cont;
    }
    
    public boolean mayorDeEdad(Persona p1){
     boolean mayorDeEdad = false;
        if(p1.getEdad() > 18){
     mayorDeEdad = true;
     }
    return mayorDeEdad;
    }
}

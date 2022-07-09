/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import ejercicio01.entidades.Perro;
import ejercicio01.entidades.Persona;
import ejercicio01.servicios.PerroService;
import ejercicio01.servicios.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // TODO code application logic here
        PersonaService ps = new PersonaService();
        PerroService pse = new PerroService();

        //realizo ArrayList, una lista para guardar personas y otra lista para guardar perros
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerros = new ArrayList();

        //creacion de 2 personas y las agrego a la lista
        for (int i = 0; i < 2; i++) {
            Persona p1 = ps.crearPersona();
            listaPersonas.add(p1);
            System.out.println("-------------------");
        }

        //creacion de 2 perros y los agrego a la lista
        for (int i = 0; i < 2; i++) {
            Perro pe1 = pse.crearPerro();
            listaPerros.add(pe1);
            System.out.println("-------------------");
        }

        //asignacion de perros a personas
        int i = 1;
        for (Persona aux : listaPersonas) {
            System.out.println("Para la persona " + i + " desea asignarle el perro 1 o 2:");
            int asignacion = leer.nextInt();
            i++;
            if (asignacion == 1) {
                aux.setPerroDePersona(listaPerros.get(0));
            } else if (asignacion == 2) {
                aux.setPerroDePersona(listaPerros.get(1));
            }
        }

        //mostrar info de personas con sus respectivos perros por pantalla
        System.out.println("-------------------");
        for (Persona aux : listaPersonas) {
            System.out.println(aux.toString());
        }

    }

}

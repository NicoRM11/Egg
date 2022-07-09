/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //creacion de Alumno Servicio para llamar a los metodos/funciones
        AlumnosServicio as = new AlumnosServicio();
        //Lista para ir agregando a los alumnos
        ArrayList<Alumnos> alumnos = new ArrayList();
        //bucle para la creacion de alumnos
        boolean verificacion = true;
        String verificacionTextual;
        
        while (verificacion == true) {
            Alumnos a1 = as.crearAlumno();
            alumnos.add(a1);
            System.out.println("Desea agregar otro/a alumno/a a la lista:");
            verificacionTextual = leer.next();
            if (verificacionTextual.equalsIgnoreCase("Si")) {
                continue;
            } else {
                verificacion = false;
            }
        }
        
        for (Alumnos nombreAlumno : alumnos) {
            System.out.println(nombreAlumno.toString());
        }
        
        
        System.out.println("Ingrese un alumno:");
        String alumnoBusqueda = leer.next();
        for (Alumnos nombreAlumno : alumnos) {
            if(nombreAlumno.getNombre().equalsIgnoreCase(alumnoBusqueda)){
                System.out.println("El promedio final del alumno/a es de:");
                System.out.println(as.notaFinal(nombreAlumno));
            }
        }

    }

}

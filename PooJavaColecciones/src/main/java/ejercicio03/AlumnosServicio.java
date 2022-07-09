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
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in);

    public Alumnos crearAlumno() {

        Alumnos a1 = new Alumnos();
        int cont = 0;
        int i = 0;
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese el nombre de alumno/a:");
        String nombre = leer.next();
        a1.setNombre(nombre);
        while (cont < 3) {
            System.out.println("Ingrese la nota n°" + (i + 1) + ":");
            notas.add(leer.nextInt());
            cont++;
            i++;
        }
        a1.setNotas(notas);
        return a1;

    }

    public float notaFinal(Alumnos a) {
        float sumatoria = 0;
        for (Integer nota : a.getNotas()) {
            sumatoria += nota;
        }
        return sumatoria / a.getNotas().size();

    }
    
}

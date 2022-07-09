/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pais crearPais() {
        Pais p1 = new Pais();
        System.out.println("Ingrese el nombre del pais para agregar a la coleccion:");
        p1.setNombre(leer.next());
        return p1;
    }
    
    
    
}

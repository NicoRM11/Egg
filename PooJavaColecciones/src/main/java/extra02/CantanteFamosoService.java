/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class CantanteFamosoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CantanteFamoso agregarCantante() {
        CantanteFamoso c1 = new CantanteFamoso();
        System.out.println("Ingrese nombre de cantante:");
        c1.setNombre(leer.next());
        System.out.println("Ingrese su disco mas vendido:");
        c1.setDiscoConMasVentas(leer.next());
        return c1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Comparator;

/**
 *
 * @author Nicolas Romano
 */
public class ServicioRazaPerro {

    public RazaPerro llamarRaza(String nombreRaza) {
        RazaPerro r1 = new RazaPerro();
        r1.setRaza(nombreRaza);
        return r1;
    }
}


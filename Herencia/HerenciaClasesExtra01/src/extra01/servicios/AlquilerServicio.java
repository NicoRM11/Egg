/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01.servicios;

import extra01.entidades.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void alquilerBarco() {
        Alquiler a1 = new Alquiler();
        BarcoServicio bs = new BarcoServicio();
        System.out.println("Ingrese su nombre:");
        a1.setNombreCliente(leer.next());
        System.out.println("Ingrese su DNI:");
        a1.setDniCliente(leer.nextInt());
        a1.setFechaAlquiler(LocalDate.now());
        System.out.println("Ingrese el día de devolucion del barco:");
        Integer dia = leer.nextInt();
        System.out.println("Ingrese el mes de devolucion del barco:");
        Integer mes = leer.nextInt();
        a1.setFechaDevolucion(LocalDate.of(2022, mes, dia));
        //metodo para alquilar tipo de barco
        bs.eleccionBarco(a1);
    }
}

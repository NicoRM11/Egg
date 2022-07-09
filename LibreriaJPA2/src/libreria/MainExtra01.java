/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.ClienteServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroServicio l1 = new LibroServicio();
        ClienteServicio c1 = new ClienteServicio();
        PrestamoServicio p1 = new PrestamoServicio();
        //creacion de libro
        Libro libro = l1.crearLibro();
        //creacion de cliente
        System.out.println("---------------");
        System.out.println("Cliente Nuevo:");
        Cliente cliente = c1.creacionCliente();
        //realizar prestamo
        Prestamo prestamo = p1.nuevoPrestamo(cliente, libro);
        System.out.println("Se ah efectuado un prestamo");
        //devolucion
        System.out.println("Desea realizar la devolucion?");
        System.out.println("1 - Si");
        System.out.println("2 - No");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            p1.devolucionLibro(prestamo, libro);
        }
        //mostrar prestamos
        p1.busquedaPrestamosPorId(cliente);
    }

}

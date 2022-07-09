/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import java.util.UUID;
import libreria.entidades.Cliente;
import libreria.persistencia.DAOCliente;

/**
 *
 * @author Nicolas Romano
 */
public class ClienteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DAOCliente cd = new DAOCliente();
    //metodo para generar nuevo cliente
    public Cliente creacionCliente() {
        Cliente c1 = new Cliente();
        c1.setId(UUID.randomUUID().toString());
        System.out.println("Ingrese DNI:");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese nombre:");
        c1.setNombre(leer.next());
        System.out.println("Ingrese apellido:");
        c1.setApellido(leer.next());
        System.out.println("Ingrese telefono:");
        c1.setTelefono(leer.next());
        cd.guardarCliente(c1);
        return c1;
    }
    
    
}

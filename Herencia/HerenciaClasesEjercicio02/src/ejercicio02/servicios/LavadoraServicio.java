/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.Electrodomestico;
import ejercicio02.entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class LavadoraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ElectrodomesticoServicio es = new ElectrodomesticoServicio();

    //metodo para crear lavadora
    public Lavadora crearLavadora() {
        System.out.println("LAVADORA:");
        Electrodomestico aux = es.crearElectrodomestico();
        Lavadora l1 = new Lavadora();
        l1.setColor(aux.getColor());
        l1.setConsumoEnergetico(aux.getConsumoEnergetico());
        l1.setPeso(aux.getPeso());
        l1.setPrecio(aux.getPrecio());
        System.out.println("Ingresar la carga:");
        l1.setCarga(leer.nextInt());

        return l1;
    }

    //metodo para calcular el precio final
    public void precioFinalLavadora(Lavadora l1) {
        if (l1.getCarga() > 30) {
            l1.setPrecio(l1.getPrecio() + 500);
        }
        
        System.out.println("El precio final de la lavadora es de: " + l1.getPrecio().toString());   
        System.out.println("----------------");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.Electrodomestico;
import ejercicio02.entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class TelevisorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ElectrodomesticoServicio es = new ElectrodomesticoServicio();

    //metodo para crear televisor
    public Televisor crearTelevisor() {
        System.out.println("TELEVISOR:");
        Electrodomestico aux = es.crearElectrodomestico();
        Televisor t1 = new Televisor();
        String tdt;
        t1.setColor(aux.getColor());
        t1.setConsumoEnergetico(aux.getConsumoEnergetico());
        t1.setPeso(aux.getPeso());
        t1.setPrecio(aux.getPrecio());
        System.out.println("Ingresar la resolucion (en pulgadas):");
        t1.setResolucion(leer.nextInt());
        System.out.println("Posee sintonizador TDT? (Si/No):");
        tdt = leer.next();
        if (tdt.equalsIgnoreCase("Si")) {
            t1.setSintonizadorTDT(true);
        } else {
            t1.setSintonizadorTDT(false);
        }
        return t1;
    }

    //metodo para el precio final de televisor
    public void precioFinalTelevisor(Televisor t1) {
        //aumento de precio si su resolucion es mayor a 40 pulgadas
        if (t1.getResolucion() > 40) {
            t1.setPrecio((t1.getPrecio() + (int)(t1.getPrecio() * 0.30)));
        }
        //aumento de precio si posee sintonizador TDT
        if(t1.isSintonizadorTDT() == true){
          t1.setPrecio(t1.getPrecio() + 500);
        }
        
        System.out.println("El precio final del televisor es de: " + t1.getPrecio().toString());
        System.out.println("----------------");
        
        
        
    }
    
       
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import ejercicio02.entidades.Lavadora;
import ejercicio02.entidades.Televisor;
import ejercicio02.servicios.LavadoraServicio;
import ejercicio02.servicios.TelevisorServicio;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelevisorServicio ts = new TelevisorServicio();
        LavadoraServicio ls = new LavadoraServicio();
        ArrayList<Televisor> listaTelevisores = new ArrayList();
        ArrayList<Lavadora> listaLavadora = new ArrayList();
        //creacion de 2 televisores y 2 lavadoras, y agregarlos en sus propias listas de electrodomesticos
        for (int i = 0; i < 2; i++) {
            Televisor t1 = ts.crearTelevisor();
            listaTelevisores.add(t1);
        }
        
        for (int i = 0; i < 2; i++) {
            Lavadora l1 = ls.crearLavadora();
            listaLavadora.add(l1);
        }
        
        //creacion de variables para saber el precio final de todos los TV, todas las lavadoras, y el TOTAL
        Integer precioTotalTV = 0;
        Integer precioTotalLavadora = 0;
        Integer precioTOTAL;
        
        //recorro listas para calcular el precio
        for (Televisor aux : listaTelevisores) {
            ts.precioFinalTelevisor(aux);
            precioTotalTV = precioTotalTV + aux.getPrecio();
        }
        
        for (Lavadora aux : listaLavadora) {
            ls.precioFinalLavadora(aux);
            precioTotalLavadora = precioTotalLavadora + aux.getPrecio();
        }
        
        precioTOTAL = precioTotalTV + precioTotalLavadora;
        
        //muestra por pantalla
        System.out.println("El precio total de los televisores es de: " + precioTotalTV);
        System.out.println("El precio total de las lavadoras es de: " + precioTotalLavadora);
        System.out.println("El precio TOTAL es de: " + precioTOTAL);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.Juego;
import ejercicio02.entidades.Jugador;
import ejercicio02.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class JuegoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void ronda(){
    JugadorServicio js = new JugadorServicio();
    RevolverServicio rs = new RevolverServicio();
    RevolverDeAgua r1 = rs.llenarRevolver();
    Jugador j1 = new Jugador();
    js.crearJugadores(j1);
        for (int i = 0; i < 20; i++) {
            System.out.println("Disparo para el jugador numero:" + j1.getId().get(i).toString() );            
            if(js.disparo(r1) == true){
                System.out.println("JUGADOR MOJADO");
                System.out.println("El jugador n°" + j1.getId().get(i).toString() + " ah sido mojado");
                break;
            } else{
                System.out.println("JUGADOR NO MOJADO");
                System.out.println("-----------------");
                System.out.println("SIGUIENTE JUGADOR:");
            }
        }
        System.out.println("FIN DEL JUEGO");
    
    
    }
    
}

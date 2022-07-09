/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.Jugador;
import ejercicio02.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class JugadorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador crearJugadores(Jugador j1){
        System.out.println("Ingrese cantidad de jugadores:");
        Integer cantidad = leer.nextInt();
        ArrayList<Integer> cantidadJugadores = new ArrayList();
        for (int i = 0; i < cantidad; i++) { //relleno de lista con jugadores
            cantidadJugadores.add(i);
        }
       j1.setId(cantidadJugadores);
        return j1;
    }
    
    public boolean disparo(RevolverDeAgua r1){
        RevolverServicio rs = new RevolverServicio();
        boolean jugadorDisparo;
        if(rs.mojar(r1) == true){
        jugadorDisparo = true;
        } else{
        jugadorDisparo = false;
        rs.siguienteChorro(r1);
        }
        return jugadorDisparo;
        
        }
        
        
    }


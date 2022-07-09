/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03.servicios;

import ejercicio03.entidades.Baraja;
import ejercicio03.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class BarajaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodo para crear baraja completa
    public Baraja crearBaraja() {
        Baraja b1 = new Baraja();
        ArrayList<Carta> listaCartas = new ArrayList();
        String palo = "Oro";
        for (int i = 1; i < 13; i++) { //cartas del 1 al 9 de Oro
            Carta c1 = new Carta();
            if (i == 8 || i == 9) {
                continue;
            }
            c1.setNumero(i);
            c1.setPalo(palo);
            listaCartas.add(c1);
        }

        palo = "Basto";

        for (int i = 1; i < 13; i++) { //cartas del 1 al 9 de Basto
            Carta c2 = new Carta();
            if (i == 8 || i == 9) {
                continue;
            }
            c2.setNumero(i);
            c2.setPalo(palo);
            listaCartas.add(c2);

        }
        palo = "Espada";
        for (int i = 1; i < 13; i++) { //cartas del 1 al 9 de Espada
            Carta c3 = new Carta();
            if (i == 8 || i == 9) {
                continue;
            }
            c3.setNumero(i);
            c3.setPalo(palo);
            listaCartas.add(c3);
        }
        palo = "Copa";
        for (int i = 1; i < 13; i++) { //cartas del 1 al 9 de Copa
            Carta c4 = new Carta();
            if (i == 8 || i == 9) {
                continue;
            }
            c4.setNumero(i);
            c4.setPalo(palo);
            listaCartas.add(c4);
        }

        b1.setBaraja(listaCartas);
        ArrayList <Carta> listaCartaMonton = new ArrayList();
        b1.setCartasMonton(listaCartaMonton);

      
        return b1;
    }

    //metodo barajar
    public void barajar(Baraja b1) {
        Collections.shuffle(b1.getBaraja());
        System.out.println("Se ah barajado!!!!");
    }

    //metodo siguiente carta
    public void sigCarta(Baraja b1) {
        Carta c1;
        if (b1.getBaraja().isEmpty()) {
            System.out.println("No hay mas cartas por mostrar");
        } else {
            c1 = b1.getBaraja().get(0);
            b1.getBaraja().remove(c1);
            b1.getCartasMonton().add(c1);
            b1.setCartasMonton(b1.getCartasMonton());
        }
        b1.setBaraja(b1.getBaraja());

    }

    public void cartasDisponibles(Baraja b1) {
        System.out.println("Las cantidad de cartas disponibles en la baraja es de:" + b1.getBaraja().size());
    }

    //metodo para dar cartas, de acuerdo a la cantidad pedida por el usuario
    public void darCartas(Baraja b1) {
        System.out.println("Indique la cantidad de cartas que desee:");
        Integer cantidad = leer.nextInt();
        if (b1.getBaraja().size() > cantidad) {
            for (int i = 0; i < cantidad; i++) {
                Carta c1 = b1.getBaraja().get(i);
                b1.getBaraja().remove(c1);
                b1.getCartasMonton().add(c1);
                b1.setBaraja(b1.getBaraja());
                b1.setCartasMonton(b1.getCartasMonton());
            }
        } else {
            System.out.println("La cantidad de cartas pedidas es mayor que a las disponibles en la baraja");
        }
    }

    public void cartasMonton(Baraja b1) {
        if (b1.getCartasMonton().isEmpty()) {
            System.out.println("No se ah sacado ninguna carta");
        } else {
            System.out.println("Las cartas que componen el monton de cartas son:");
            for (Carta aux : b1.getCartasMonton()) {
                System.out.println(aux.toString());
            }

        }
    }

    public void mostrarBaraja(Baraja b1) {
        for (Carta aux : b1.getBaraja()) {
            System.out.println(aux.toString());
        }

    }
}

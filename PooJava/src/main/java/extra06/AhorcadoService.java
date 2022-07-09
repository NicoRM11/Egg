/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra06;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        String palabra;
        int longitudPalabra;
        System.out.println("Ingrese la palabra a adivinar:");
        palabra = leer.next();
        longitudPalabra = palabra.length();
        String[] vectorRelleno = new String[palabra.length()];
        a1.setPalabra(longitudPalabra);
        //ingresar palabra en el vector, letra por letra
        String letraxletra;
        for (int i = 0; i < palabra.length(); i++) {
            letraxletra = palabra.substring(i, i + 1);
            vectorRelleno[i] = letraxletra;
        }
        a1.setPalabraABuscar(vectorRelleno);
        System.out.println("Cantidad de jugadas maximas que puede realizar el jugador:");
        a1.setCantidadJugadasMaximas(leer.nextInt());
        a1.setCantidadLetrasEncontradas(0);
        return a1;
    }

    public void longitud(Ahorcado a1) {

        System.out.println("Longitud de la palabra:" + a1.getPalabra());

    }

    public void buscar(Ahorcado a1, int oportunidades, String[] palabraEncontrada) {
        System.out.println("Ingrese la letra a buscar:");
        String letra = leer.next();
        String[] vectorRelleno = a1.getPalabraABuscar();
        String letraxletra;
        int cont = 0;
        for (int i = 0; i < a1.getPalabra(); i++) {
            letraxletra = vectorRelleno[i];
            if (letraxletra.equals(letra)) {
                palabraEncontrada[i] = letraxletra;
                cont++;
            }

        }

        if (cont != 0) {
            System.out.println("La letra se encuentra");

        } else {
            System.out.println("La letra no se encuentra");
        }

        //metodo de cantidad de letras encontradas y no encontradas
        int letrasEncontradas = 0;
        int letrasFaltantes = a1.getPalabra();
        if (cont != 0) {
            letrasEncontradas++;
            letrasFaltantes--;

        } else {
            oportunidades--;
        }
        System.out.println("Numero de letras(encontradas,faltantes): " + "(" + letrasEncontradas + "," + letrasFaltantes + ")");
        System.out.println("Oportunidades restantes:" + oportunidades);

    }

}

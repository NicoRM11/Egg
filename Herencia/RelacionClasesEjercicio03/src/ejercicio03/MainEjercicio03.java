/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import ejercicio03.entidades.Baraja;
import ejercicio03.servicios.BarajaServicio;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenid@ a baraja española virtual:");
        BarajaServicio bs = new BarajaServicio();
        Baraja b1 = bs.crearBaraja();
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("-------------------");
            System.out.println("Seleccione una opcion del menú:");
            System.out.println("1- Barajar");
            System.out.println("2- Sacar la siguiente carta");
            System.out.println("3- Cartas disponibles");
            System.out.println("4- Dar cartas");
            System.out.println("5- Mostrar monton de cartas");
            System.out.println("6- Mostrar baraja");
            System.out.println("7- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                     bs.barajar(b1);
                    break;
                case 2:
                     bs.sigCarta(b1);
                    break;
                case 3:
                     bs.cartasDisponibles(b1);
                    break;
                case 4:
                    bs.darCartas(b1);
                    break;
                case 5:
                    bs.cartasMonton(b1);
                    break;
                case 6:
                    bs.mostrarBaraja(b1);
                    break;
                case 7:
                      System.out.println("Gracias por utilizar el sistema!!!!");
                    break;
            }
        }

    }

}

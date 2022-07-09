/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra06;

import java.util.Arrays;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        int oportunidades = a1.getCantidadJugadasMaximas();
        String[] palabraEncontrada = new String[a1.getPalabra()];
        while (oportunidades != 0) {
            as.longitud(a1);
            as.buscar(a1, oportunidades, palabraEncontrada);
            if (Arrays.equals(a1.getPalabraABuscar(), palabraEncontrada)) {
                System.out.println("USTED AH ENCONTRADO LA PALABRA");
                System.out.println("La palabra es:" + Arrays.toString(palabraEncontrada));
                break;
            } else {
                System.out.println("No se ah encontrado la palabra");
                System.out.println("---------------------------");
                System.out.println(" ");
            }
        }
        if (oportunidades == 0) {
            System.out.println("Se han agotado sus oportunidades");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class PuntosService {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos p1 = new Puntos();
        System.out.println("Ingrese el numero para la coordenada x1:");
        p1.setX1(leer.nextInt());
        System.out.println("Ingrese el numero para la coordenada y1:");
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese el numero para la coordenada x2:");
        p1.setX2(leer.nextInt());
        System.out.println("Ingrese el numero para la coordenada y2:");
        p1.setY2(leer.nextInt());
        return p1;
    }

    public void distanciaPuntos(Puntos p1) {
        int distanciaEnX = p1.getX2() - p1.getX1();
        int distanciaEnY = p1.getY2() - p1.getY1();
        double distancia = Math.sqrt((Math.pow(distanciaEnX, 2)) + Math.pow(distanciaEnY, 2));
        System.out.println("La distancia entre ambos puntos es de:" + distancia);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.servicios;

import extra02.entidades.EdificioDeOficinas;
import extra02.entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class EdificioDeOficinasServicio extends EdificioServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //metodo para crear edificio de oficinas
    public EdificioDeOficinas crearEdificioDeOficinas() {
        EdificioDeOficinas e1 = new EdificioDeOficinas();
        System.out.println("--------------------------");
        System.out.println("EDIFICIO DE OFICINAS:");
        System.out.println("Ingrese numero de oficinas por piso:");
        e1.setNumOficinas(leer.nextInt());
        System.out.println("Ingrese cantidad de personas por oficina:");
        e1.setCantPersonasPorOficina(leer.nextInt());
        System.out.println("Ingrese numero de pisos del edificio:");
        e1.setNumPisos(leer.nextInt());
        System.out.println("Ingrese su ancho:");
        e1.setAncho(leer.nextInt());
        System.out.println("Ingrese su largo:");
        e1.setLargo(leer.nextInt());
        System.out.println("Ingrese su alto:");
        e1.setAlto(leer.nextInt());

        return e1;
    }

    //metodo para mostrar por pantalla cuanta cantidad de personas entran en edificio, y cuantas por piso
    public void cantPersonas(EdificioDeOficinas e1) {
        System.out.println("Cantidad de personas que entran por piso:" + (e1.getCantPersonasPorOficina() * e1.getNumOficinas()));
        System.out.println("Cantidad de personas en total en edificio:" + (e1.getCantPersonasPorOficina() * e1.getNumOficinas() * e1.getNumPisos()));

    }

    //metodo para calcular superficie y volumen
    @Override
    public void calcularSuperficieEdificio(EdificioDeOficinas e1) {
        Integer superficie;
        System.out.println("---");
        superficie = (e1.getAncho() * e1.getLargo()) * e1.getNumPisos();
        System.out.println("La superficie del edificio de oficinas es de:" + superficie + " m^2");
    }

    @Override
    public void calcularVolumenEdificio(EdificioDeOficinas e1) {
        Integer volumen;
        volumen = (e1.getAlto() * e1.getAncho() * e1.getLargo()) * e1.getNumPisos();
        System.out.println("El volumen del edificio de oficinas es de:" + volumen + " m^3");
    }

    //metodos abstractos pero no usables-------------------------
    @Override
    public void calcularSuperficiePoli(Polideportivo p1) {
    }

    @Override
    public void calcularVolumenPoli(Polideportivo e1) {
    }
}

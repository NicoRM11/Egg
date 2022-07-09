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
public class PolideportivoServicio extends EdificioServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodo para crear Polideportivo
    public Polideportivo crearPolideportivo() {
        Polideportivo p1 = new Polideportivo();
        System.out.println("--------------------------");
        System.out.println("POLIDEPORTIVO:");
        System.out.println("Ingrese nombre de polideportivo:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese tipo de instalacion(techado o abierto):");
        p1.setTipoDeInstalacion(leer.next());
        System.out.println("Ingrese su ancho:");
        p1.setAncho(leer.nextInt());
        System.out.println("Ingrese su largo:");
        p1.setLargo(leer.nextInt());
        System.out.println("Ingrese su alto:");
        p1.setAlto(leer.nextInt());
        return p1;
    }

    //metodos heredados de clase padre "EdificioServicio"
    @Override
    public void calcularSuperficiePoli(Polideportivo p1) {
        Integer superficie;
        superficie = p1.getAncho() * p1.getLargo();
        System.out.println("La superficie del polideportivo es de:" + superficie + " m^2");
    }

    @Override
    public void calcularVolumenPoli(Polideportivo p1) {
        Integer volumen;
        volumen = p1.getAlto() * p1.getAncho() * p1.getLargo();
        System.out.println("El volumen del polideportivo es de:" + volumen + " m^3");
        System.out.println("El polideportivo es:" + p1.getTipoDeInstalacion());
    }

    //metodos heredados pero no usables-------------------------------
    @Override
    public void calcularVolumenEdificio(EdificioDeOficinas e1) {
    }

    @Override
    public void calcularSuperficieEdificio(EdificioDeOficinas e1) {
    }

}

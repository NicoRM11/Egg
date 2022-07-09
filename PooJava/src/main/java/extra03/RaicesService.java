/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class RaicesService {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaiz() {
        Raices r1 = new Raices();
        System.out.println("Ingrese un valor para a:");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese un valor para b:");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese un valor para c:");
        r1.setC(leer.nextInt());

        return r1;
    }

    public void getDiscriminante(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        System.out.println("El valor del discriminante es de:" + discriminante);
    }

    public boolean tieneRaices(Raices r1) {
        boolean tieneRaices = false;
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        if (discriminante >= 0) {
            tieneRaices = true;
        } else {
            tieneRaices = false;
        }
        System.out.println("La ecuacion tiene raices? : " + tieneRaices);
        return tieneRaices;
    }

    public boolean tieneRaiz(Raices r1) {
        boolean tieneRaiz = false;
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        if (discriminante == 0) {
            tieneRaiz = true;
        } else {
            tieneRaiz = false;
        }
        System.out.println("La ecuacion tiene raiz? : " + tieneRaiz);
        return tieneRaiz;
    }

    public void obtenerRaices(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        double discriminanteNegativo = -1 * discriminante;
        if (discriminante >= 0) {
            System.out.println("Raiz 1:" + discriminante);
            System.out.println("Raiz 2:" + discriminanteNegativo);
        } else {
            System.out.println("No se pueden obtener las raices, debido a que el discriminante es menor que 0");
        }

    }

    public void obtenerRaiz(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        if (discriminante == 0) {
            System.out.println("Raiz 1:" + discriminante);
        } else {
            System.out.println("No tiene raiz, debido a que no es 0 el discriminante");
        }
    }

    public void calcular(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        double discriminanteNegativo = -1 * discriminante;
        double formula2doGrado;
        double formula2doGradoNegativa;
        if (discriminante >= 0) {
            formula2doGrado = ((-1) * r1.getB()) + Math.sqrt(discriminante);
            formula2doGradoNegativa = ((-1) * r1.getB()) - Math.sqrt(discriminante);
            System.out.println("Solucion 1:" + formula2doGrado);
            System.out.println("Solucion 2:" + formula2doGradoNegativa);
        } else if (discriminante == 0) {
            formula2doGrado = ((-1) * r1.getB()) + Math.sqrt(discriminante);
            System.out.println("Unica solucion:" + formula2doGrado);
        } else {
            System.out.println("No tiene solucion.");
        }
    }

}

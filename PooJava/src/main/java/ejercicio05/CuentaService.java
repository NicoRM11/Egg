/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class CuentaService {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el numero de DNI del titular:");
        String dni = leer.next();
        System.out.println("Ingrese el numero de cuenta:");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese el saldo correspondiente:");
        int saldo = leer.nextInt();
        return new Cuenta(numCuenta, dni, saldo);
    }

    public double ingresarDinero(Cuenta c1) {
        System.out.println("Ingrese el dinero a depositar");
        double dineroIngreso = leer.nextDouble();
        return dineroIngreso + c1.getSaldoActual();
    }

    public double retirarDinero(Cuenta c1) {
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double dineroRetiro = leer.nextDouble();
        if (dineroRetiro > c1.getSaldoActual()) {

            return c1.getSaldoActual() - c1.getSaldoActual();
        }
        return c1.getSaldoActual() - dineroRetiro;
    }

    public double extraccionRapida(Cuenta c1) {
        System.out.println("Ingrese la cantidad de dinero a retirar de forma rapida:");
        double dineroRetiroRapido = leer.nextDouble();

        while (dineroRetiroRapido > c1.getSaldoActual() * 0.20) {
            System.out.println("La cantidad de dinero no debe superar el 20% del total del saldo:");
            dineroRetiroRapido = leer.nextDouble();

        }
        return c1.getSaldoActual() - dineroRetiroRapido;

    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("El saldo de la cuenta es de:" + c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println("Los datos de la cuenta son:");
        System.out.println("DNI:" + c1.getDni());
        System.out.println("El numero de cuenta es:" + c1.getNumeroCuenta());
    }
}

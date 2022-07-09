/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author Nicolas Romano
 */
public class Cuenta {

    //atributos
    private int numeroCuenta;
    private String dni;
    private int saldoActual;

    //constructores
    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, String dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

}

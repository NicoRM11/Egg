/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01.entidades;

import java.time.LocalDate;


/**
 *
 * @author Nicolas Romano
 */
public class Alquiler {
    //atributos
    private String nombreCliente;
    private Integer dniCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Barco ocupacionAmarre;
    //constructor

    public Alquiler() {
    }
    
    //get y set

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getOcupacionAmarre() {
        return ocupacionAmarre;
    }

    public void setOcupacionAmarre(Barco ocupacionAmarre) {
        this.ocupacionAmarre = ocupacionAmarre;
    }
    
    
}

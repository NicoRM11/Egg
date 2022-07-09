/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class ElectrodomesticoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodo para crear electrodomestico
    public Electrodomestico crearElectrodomestico() {
        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        Electrodomestico e1 = new Electrodomestico();
        System.out.println("----------------");
        System.out.println("Ingrese el color de su electrodomestico:");
        e1.setColor(leer.next());
        System.out.println("Ingrese su consumo energetico (letras A hasta F):");
        e1.setConsumoEnergetico(leer.next());
        System.out.println("Ingrese el peso:");
        e1.setPeso(leer.nextInt());
        e1.setPrecio(1000);
        //llamado de metodos para comprobar  el color y el consumo energetico 
        es.comprobarConsumoEnergetico(e1.getConsumoEnergetico(), e1);
        es.comprobarColor(e1.getColor(), e1);
        es.precioFinal(e1);
        return e1;
    }

    //metodo de comprobar el consumo energetico
    public void comprobarConsumoEnergetico(String letra, Electrodomestico e1) {
        if (letra.equalsIgnoreCase("a")) {
            e1.setConsumoEnergetico(letra);
        } else if (letra.equalsIgnoreCase("b")) {
            e1.setConsumoEnergetico(letra);
        } else if (letra.equalsIgnoreCase("c")) {
            e1.setConsumoEnergetico(letra);
        } else if (letra.equalsIgnoreCase("d")) {
            e1.setConsumoEnergetico(letra);
        } else if (letra.equalsIgnoreCase("e")) {
            e1.setConsumoEnergetico(letra);
        } else {
            e1.setConsumoEnergetico("F");
        }
        
    }

    //metodo de comprobar color
    public void comprobarColor(String color, Electrodomestico e1) {
        if(color.equalsIgnoreCase("negro")){
         e1.setColor(color);
        } else if(color.equalsIgnoreCase("rojo")){
         e1.setColor(color);
        } else if(color.equalsIgnoreCase("azul")){
         e1.setColor(color);
        } else if(color.equalsIgnoreCase("gris")){
         e1.setColor(color);
        } else {
         e1.setColor("Blanco");
        }
        
    }

    //metodo precio final
    public void precioFinal(Electrodomestico e1) {
        //segun consumo energetico
        switch (e1.getConsumoEnergetico().toUpperCase()) {
            case "A":
                e1.setPrecio(e1.getPrecio() + 1000);
                break;
            case "B":
                e1.setPrecio(e1.getPrecio() + 800);
                break;
            case "C":
                e1.setPrecio(e1.getPrecio() + 600);
                break;
            case "D":
                e1.setPrecio(e1.getPrecio() + 500);
                break;
            case "E":
                e1.setPrecio(e1.getPrecio() + 300);
                break;
            case "F":
                e1.setPrecio(e1.getPrecio() + 100);
                break;
            
        }
        //segun peso
        if (e1.getPeso() >= 1 && e1.getPeso() <= 19) {
            e1.setPrecio(e1.getPrecio() + 100);
        } else if (e1.getPeso() >= 20 && e1.getPeso() <= 49) {
            e1.setPrecio(e1.getPrecio() + 500);
        } else if (e1.getPeso() >= 50 && e1.getPeso() <= 79) {
            e1.setPrecio(e1.getPrecio() + 800);
            
        } else if (e1.getPeso() >= 80) {
            e1.setPrecio(e1.getPrecio() + 1000);
            
        }
    }
    
}

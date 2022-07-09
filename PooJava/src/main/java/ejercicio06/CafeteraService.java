/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class CafeteraService {

    Scanner leer = new Scanner(System.in);
//metodo para llenar cafetera

    public Cafetera llenarCafetera() {
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la cantidad con la que desea llenar la cafetera:");
        c1.setCapMaxima(leer.nextInt());
        c1.setCapActual(c1.getCapMaxima());
        return c1;
    }

//metodo para servir taza
    public void servirTaza(Cafetera c1) {
        System.out.println("Ingrese el tamaño de la taza:");
        int tamanioTaza = leer.nextInt();
        if(tamanioTaza > c1.getCapMaxima()){
            int diferencia = tamanioTaza - c1.getCapMaxima();
            System.out.println("La taza no se ah llenado, han sobrado: " + diferencia + " ml");
        }else{
            System.out.println("La taza se ah llenado con la cantidad ingresada");
            c1.setCapActual(c1.getCapActual() - tamanioTaza);
            System.out.println("Ah sobrado " + c1.getCapActual() + " ml de cafe");

        }
    }
    
//metodo para vaciar cafetera
    public void vaciarCafetera(Cafetera c1){
        c1.setCapActual(0);
        System.out.println("La cafetera se ah vaciado");
    
    }
//metodo para agregar cafe
    public int agregarCafe(Cafetera c1){
        System.out.println("Ingrese la cantidad de cafe en la cafetera:");
        int agregarCafe = leer.nextInt();
        c1.setCapActual(agregarCafe);
        return c1.getCapActual();
    
    }    

  
}

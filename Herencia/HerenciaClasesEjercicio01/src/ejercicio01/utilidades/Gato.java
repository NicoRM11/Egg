/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.utilidades;

/**
 *
 * @author Nicolas Romano
 */
public final class Gato extends Animal {
    //constructor

    public Gato(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato se alimenta de galletas");
    }
    
    
}

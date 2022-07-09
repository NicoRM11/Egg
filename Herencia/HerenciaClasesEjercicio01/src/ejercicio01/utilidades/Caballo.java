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
public final class Caballo extends Animal {
    //constructor
    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta de pasto");
    }
    
}

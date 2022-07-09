/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import ejercicio01.utilidades.Animal;
import ejercicio01.utilidades.Caballo;
import ejercicio01.utilidades.Gato;
import ejercicio01.utilidades.Perro;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creacion de objeto perro
        Animal perro = new Perro("Stich" , "Carnivoro" , 15 , "Doberman");
        perro.alimentarse();
        //creacion de otro objeto tipo perro
        Perro perro1 = new Perro("Teddy" , "Croquetas" , 10 , "Chihuahua");
        perro1.alimentarse();
        //creacion de gato
        Animal gato = new Gato("Pelusa" , "Galletas" , 15 , "Siames");
        gato.alimentarse();
        //creacion de caballo
        Animal caballo = new Caballo("Spirit" , "Pasto" , 8 , "POLACO");
        caballo.alimentarse();
    }
    
}

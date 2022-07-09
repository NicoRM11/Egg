/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloService rs = new RectanguloService();
        Rectangulo r1 = rs.peticionAlturaYbase();
        System.out.println("La superficie del rectangulo es de:" + rs.superficie(r1));
        System.out.println("El perimetro del rectangulo es de:" + rs.perimetro(r1));
        //hacer rectangulo de asteriscos
        System.out.println("El rectangulo de asteriscos es:");
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }

}

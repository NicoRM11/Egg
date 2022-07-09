/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

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
        ServiceLibros ls = new ServiceLibros();
        Libros l1 = ls.pedidoDeLibro();
        ls.muestraDeLibros(l1);
    }
    
}

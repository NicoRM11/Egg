/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematicaService ms = new MatematicaService();
        Matematica m1 = ms.obtenerNum();
        System.out.println("El mayor valor de ambos es: " + ms.devolverMayor(m1));
        System.out.println("La potencia del mayor valor elevador al menor es de: " + ms.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor valor es de: " + ms.calcularRaiz(m1));
    }
    
}

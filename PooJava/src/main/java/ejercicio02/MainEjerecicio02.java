/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjerecicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.peticionRadio();
        System.out.println("El area de la circunferencia es:" + cs.area(c1));
        System.out.println("El perimetro de la circunferencia es:" + cs.perimetro(c1));
    }
    
}

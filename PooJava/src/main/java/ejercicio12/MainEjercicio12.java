/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PersonaService ps = new PersonaService();
       Persona p1 = ps.crearPersona();
       ps.mostrarPersona(p1);
       ps.calcularEdad(p1);
       ps.menorQue(p1);
    }
    
}

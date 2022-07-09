/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.crearCuenta();
        
        System.out.println(cs.ingresarDinero(c1));
        System.out.println(cs.retirarDinero(c1));
        System.out.println(cs.extraccionRapida(c1));
        
        cs.consultarDatos(c1);
        cs.consultarSaldo(c1);
    }
    
}

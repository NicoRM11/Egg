/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.servicios;

import ejercicio02.entidades.RevolverDeAgua;

/**
 *
 * @author Nicolas Romano
 */
public class RevolverServicio {
    public RevolverDeAgua llenarRevolver(){
    RevolverDeAgua r1 = new RevolverDeAgua();
    r1.setPosAgua((int) (Math.random() * 10));
    int i = 0;    
    r1.setPosActual(i);
    return r1;
    }
    
    public boolean mojar(RevolverDeAgua r1){
        boolean mojar = false;
        if(r1.getPosActual().equals(r1.getPosAgua())){
            mojar = true;
        }
    return mojar;
    }
    
    public void siguienteChorro(RevolverDeAgua r1){
        r1.setPosActual(r1.getPosActual()+1);
    }
    
}

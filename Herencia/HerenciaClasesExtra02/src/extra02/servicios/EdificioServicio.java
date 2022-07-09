/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.servicios;

import extra02.entidades.EdificioDeOficinas;
import extra02.entidades.Polideportivo;

/**
 *
 * @author Nicolas Romano
 */
public abstract class EdificioServicio {

    //metodos abstractos
    public abstract void calcularSuperficiePoli(Polideportivo p1);

    public abstract void calcularVolumenPoli(Polideportivo e1);

    public abstract void calcularSuperficieEdificio(EdificioDeOficinas e1);

    public abstract void calcularVolumenEdificio(EdificioDeOficinas e1);

}

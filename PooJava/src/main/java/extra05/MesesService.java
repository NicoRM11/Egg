/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra05;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MesesService {
    
    Scanner leer = new Scanner(System.in);
    public Meses rellenoMes(){
    Meses m1 = new Meses();
    String [] meses = new String[12];
    meses[0] = "enero";
    meses[1] = "febrero";
    meses[2] = "marzo";
    meses[3] = "abril";
    meses[4] = "mayo";
    meses[5] = "junio";
    meses[6] = "julio";
    meses[7] = "agosto";
    meses[8] = "septiembre";
    meses[9] = "octubre";
    meses[10] = "noviembre";
    meses[11] = "diciembre";
    m1.setMeses(meses);
    return m1;
    }
    
    //peticion de mes secreto y verificar si es correcto o no
    public void mesSecreto(Meses m1){
        m1.setMesSecreto("marzo");
        System.out.println("Ingrese un mes, en minuscula:");
        String mesAdivina = leer.next();
        while(!mesAdivina.equals(m1.getMesSecreto())){
            System.out.println("Mes incorrecto, ingrese un mes nuevamente, en minuscula:");
            mesAdivina = leer.next();
        }
        System.out.println("MES CORRECTO!!!!!");
        
    }
}

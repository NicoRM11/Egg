/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creacion de lista de cantantes
        ArrayList <CantanteFamoso> listaCantante = new ArrayList();
        //creacion de objeto service para agregar a la lista
        CantanteFamosoService cs = new CantanteFamosoService();
        //bucle para agregar 5 cantantes famosos con sus discos mas vendidos
        int cont = 0;
        while (cont < 5) {            
            listaCantante.add(cs.agregarCantante());
            cont++;
        }
        
        //muestra de cantantes con sus respectivos discos mas vendido
        for (CantanteFamoso aux : listaCantante) {
            System.out.println(aux.toString());
        }
        
   
    }
    
}

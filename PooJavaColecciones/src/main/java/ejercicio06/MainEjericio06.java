/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjericio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //realizar menu para aplicacion de tienda de ropa
        HashMap<String, Integer> listaTienda = new HashMap();
        boolean verificacion = true;
        do {
            System.out.println("MENÚ:");
            System.out.println("a- Agregar un producto");
            System.out.println("b- Modificar precio de un producto");
            System.out.println("c- Eliminar producto");
            System.out.println("d- Mostrar productos con su precio");
            System.out.println("e- Salir");
            String seleccion = leer.next();
            switch (seleccion.toLowerCase()) {
                case "a":
                    System.out.println("Ingrese el nombre del elemento:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el precio del elemento:");
                    Integer precio = leer.nextInt();
                    listaTienda.put(nombre, precio);
                    break;
                case "b":
                    System.out.println("Ingrese el nombre de producto:");
                    String modificar = leer.next();
                    for (String aux : listaTienda.keySet()) {
                        if (aux.equalsIgnoreCase(modificar)) {
                            System.out.println("Ingrese el nuevo precio:");
                            listaTienda.replace(aux, leer.nextInt());
                        }
                    }
                    break;
                case "c":
                    System.out.println("Ingrese el nombre del producto a eliminar:");
                    String eliminar = leer.next();
                    listaTienda.remove(eliminar);
                    break;
                case "d":
                    for (Map.Entry<String, Integer> entry : listaTienda.entrySet()) {
                      System.out.println("producto=" + entry.getKey() + 
                      ", precio=" + entry.getValue()); 
                    }
                     break;
                case "e":
                    verificacion = false;
                    break;
            }

        } while (verificacion == true);

    }

}

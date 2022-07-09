/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Nicolas Romano
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

        //MENU DE TIENDA
        try {
            System.out.println("Bienvenid@ a pichi's:");
        boolean verificacion = true;
        do {
            System.out.println("-------MENU-------");
            System.out.println("Indique con numero la opcion que desee:");
            System.out.println("1-Listar productos de la tienda por nombre");
            System.out.println("2-Listar productos por nombre y precio");
            System.out.println("3-Listar los productos en los cuales su precio esta entre 120 y 202");
            System.out.println("4-Listar todos los portatiles que se encuentran en la tienda:");
            System.out.println("5-Nombre y precio de producto mas barato");
            System.out.println("OPCIONES DE CAMBIOS EN TIENDA:");
            System.out.println("6-Ingresar producto");
            System.out.println("7-Ingresar fabricante");
            System.out.println("8-Eliminar producto en base a su nombre");
            System.out.println("9-Modificar un producto en base a su codigo(se debe saber el codigo)");
            System.out.println("10-Salir");
            int opcion = leer.nextInt();

            //switch
            switch (opcion) {
                case 1:
                    ps.listarProducto();
                    break;
                case 2:
                    ps.listarProductoConPrecio();
                    break;
                case 3:
                    ps.precioEntreValores();
                    break;
                case 4:
                    ps.busquedaPortatiles();
                    break;
                case 5:
                    ps.productoMasBarato();
                    break;
                case 6:
                    Producto p1 = ps.crearProducto();
                    ps.guardarProducto(p1);
                    break;
                case 7:
                    Fabricante fabricante = fs.crearFabricante();
                    fs.guardarFabricante(fabricante);
                    fs.listaFabricantes();
                    break;
                case 8:
                    ps.eliminarProductoPorNombre();
                    break;
                case 9:
                    ps.modificarProductoPorId();
                    break;
                case 10:
                    verificacion = false;
                    break;

            }
        } while (verificacion == true);
        } catch (Exception e) {
            throw e;
        }
        
        
    }

}

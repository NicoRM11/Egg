/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Nicolas Romano
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoDAO dao = new ProductoDAO();

    public Producto crearProducto() {
        Producto producto = new Producto();
        System.out.println("Ingrese codigo del producto");
        producto.setCodigo(leer.nextInt());
        System.out.println("Ingrese nombre del producto:");
        producto.setNombre(leer.next());
        System.out.println("Ingrese precio del producto:");
        producto.setPrecio(leer.nextInt());
        System.out.println("Ingrese codigo de fabricante:");
        producto.setCodigoFabricante(leer.nextInt());
        return producto;
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<String> listarProducto() throws Exception {

        try {
            Collection<String> productoPorNombre = dao.listarProductos();
            for (String aux : productoPorNombre) {
                System.out.println(aux.toString());
            }
            return productoPorNombre;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> listarProductoConPrecio() throws Exception {

        try {
            ArrayList<Producto> listaProductoConPrecio = dao.listarProductosConPrecios();
            for (Producto aux : listaProductoConPrecio) {
                System.out.println(" " + aux.getNombre() + ", precio $" + aux.getPrecio());
            }
            return listaProductoConPrecio;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> precioEntreValores() throws Exception {

        try {
            ArrayList<Producto> listaProductoEntreValores = dao.precioEntreValores();
            for (Producto aux : listaProductoEntreValores) {
                System.out.println(aux.toString());
            }
            return listaProductoEntreValores;
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<Producto> busquedaPortatiles() throws Exception {
        try {
            ArrayList<Producto> listaBusquedaPortatiles = dao.busquedaPortatiles();
            for (Producto aux : listaBusquedaPortatiles) {
                System.out.println(aux.getNombre());
            }

            return listaBusquedaPortatiles;
        } catch (Exception e) {
            throw e;
        }

    }

    public Producto productoMasBarato() throws Exception {
        try {
            Producto producto = dao.productoMasBarato();
            System.out.println(producto.getNombre() + ",  $" + producto.getPrecio());
            return producto;
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProductoPorNombre() throws Exception {
        try {
            System.out.println("Ingrese nombre de producto a eliminar:");
            String producto = leer.next();
            dao.eliminarProductoPorNombre(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProductoPorId() throws Exception {
        try {
            System.out.println("Ingrese codigo de producto a modificar:");
            Producto producto = dao.buscarProductoPorId(leer.nextInt());
            System.out.println("Ingrese nombre nuevo:");
            producto.setNombre(leer.next());
            System.out.println("Ingrese precio nuevo:");
            producto.setPrecio(leer.nextInt());
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }

    }
}

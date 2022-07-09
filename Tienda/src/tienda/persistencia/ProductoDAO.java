/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;

/**
 *
 * @author Nicolas Romano
 */
public final class ProductoDAO extends DAO {

    private final FabricanteService fs = new FabricanteService();

    //metodo para listar el nombre de todos los productos de la tabla producto
    public Collection<String> listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<String> listaProductoPorNombre = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                String nombre = producto.getNombre();
                listaProductoPorNombre.add(nombre);
            }
            desconectarBase();
            return listaProductoPorNombre;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }

    }

    //metodo para listar productos por nombre y sus precios
    public ArrayList<Producto> listarProductosConPrecios() throws Exception {
        try {
            String sql = "SELECT nombre , precio FROM producto";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<Producto> listaProductoConPrecio = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getInt(2));
                listaProductoConPrecio.add(producto);
            }

            desconectarBase();
            return listaProductoConPrecio;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }

    }

    //metodo para listar los productos en los que su precio esta entre 120 y 202
    public ArrayList<Producto> precioEntreValores() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<Producto> listaProductoEntreValores = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                int idFabricante = resultado.getInt(4);
                Fabricante fabricante = fs.buscarFabricantePorId(idFabricante);
                producto.setCodigoFabricante(fabricante.getCodigo());
                listaProductoEntreValores.add(producto);
            }
            desconectarBase();
            return listaProductoEntreValores;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }

    }

    //metodo para buscar y listar todos los portatiles de la tabla producto
    public ArrayList<Producto> busquedaPortatiles() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%portátil%' ";
            consultarBase(sql);
            Producto producto = null;
            ArrayList<Producto> listaBusquedaPortatiles = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                listaBusquedaPortatiles.add(producto);
            }
            desconectarBase();
            return listaBusquedaPortatiles;

        } catch (Exception e) {
            throw e;
        }

    }

    //metodo para listar el nombre y el precio del producto mas barato
    public Producto productoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre , precio FROM producto ORDER BY precio asc LIMIT 1";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getInt(2));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            throw e;
        }

    }
    
    //metodo para listar prouctos con todos sus datos
    public Producto buscarProductoPorId(Integer id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = '" + id + "'";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                int idFabricante = resultado.getInt(4);
                Fabricante fabricante = fs.buscarFabricantePorId(idFabricante);
                producto.setCodigoFabricante(fabricante.getCodigo());
                String nombre = producto.getNombre();
            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }

    }
    
    //metodo para guardar producto
    public void guardarProducto(Producto producto) throws Exception{
      try { 
          if (producto == null) {
              throw new Exception("Debe indicar un producto");
          }
            String sql = "INSERT INTO producto(codigo,nombre,precio,codigo_fabricante)" + 
                    " VALUES ('" + producto.getCodigo() + 
                    "','" + producto.getNombre() +
                    "','" + producto.getPrecio() +
                    "','" + producto.getCodigoFabricante() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //metodo para eliminar producto
    public void eliminarProductoPorNombre(String producto) throws Exception{
        try {
            String sql = "DELETE FROM producto WHERE nombre = '" + producto + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    //metodo para modificar producto
    public void modificarProducto(Producto producto) throws Exception{
        try {
            String sql = "UPDATE Producto SET " + 
                    "nombre = '" + producto.getNombre() +
                    "' , precio = '" + producto.getPrecio() +
                    "'  WHERE codigo = " + producto.getCodigo() ;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
}

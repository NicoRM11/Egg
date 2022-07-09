/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author Nicolas Romano
 */
public final class FabricanteDAO extends DAO {

    //metodo para buscar fabricante por id  
    public Fabricante buscarFabricantePorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM Fabricante "
                    + " WHERE codigo = '" + id + "'";

            consultarBase(sql);

            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //metodo para guardar fabricante
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar fabricante");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)"
                    + "VALUES ('" + fabricante.getCodigo()
                    + "','" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;

        }

    }
    
    //metodo para listar fabricantes
    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante producto = null;
            Collection<Fabricante> listaFabricantes = new ArrayList();
            while (resultado.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listaFabricantes.add(fabricante);
            }
            desconectarBase();
            return listaFabricantes;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }

    }
}

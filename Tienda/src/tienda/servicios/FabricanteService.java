/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Nicolas Romano
 */
public class FabricanteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FabricanteDAO dao = new FabricanteDAO();

    //metodo para crear fabricante
    public Fabricante crearFabricante() {
        Fabricante fabricante = new Fabricante();
        System.out.println("Ingrese codigo de fabricante:");
        fabricante.setCodigo(leer.nextInt());
        System.out.println("Ingrese nombre de fabricante:");
        fabricante.setNombre(leer.next());
        return fabricante;
    }

    //metodo para buscar fabricante por id
    public Fabricante buscarFabricantePorId(Integer id) throws Exception {

        try {

            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }

            Fabricante fabricante = dao.buscarFabricantePorId(id);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    //metodo para guardar fabricante
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }

    }

    //metodo para listar fabricantes
    public Collection<Fabricante> listaFabricantes() throws Exception {

        try {
            Collection<Fabricante> listaFabricantes = dao.listarFabricantes();
            for (Fabricante aux : listaFabricantes) {
                System.out.println(aux.toString());
            }
            return listaFabricantes;
        } catch (Exception e) {
            throw e;
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03.entidades;

import java.util.ArrayList;


/**
 *
 * @author Nicolas Romano
 */
public class Baraja {
    //atributos
    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> cartasMonton = new ArrayList();
    //constructor

    public Baraja() {
    }
    //get y set

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }
    
    
   
    //metodo to String

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author carlo
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vendedor ven = new Vendedor();
        Cocinero coc = new Cocinero();
        ven.seleccionarOrden();
        coc.crearComida(ven.getComidaSeleccionada());
        coc.crearBebida(ven.getBebidaSeleccionada());
        ven.recibirOrden(coc.getAlimento(), coc.getiBebida());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Vendedor {
    
    private String comidaSeleccionada;
    private String bebidaSeleccionada;
    
    // Presenta las opciones de comida y bebida y pide al usuario indicar cual desea por medio del numero
    public void seleccionarOrden(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione el numero de la comida que desea: ");
        System.out.println("1. Pizza ");
        System.out.println("2. Hamburguesa ");
        System.out.println("3. Perro Caliente");
        comidaSeleccionada = sc.nextLine();

        System.out.println("Seleccione el numero de la bebida que desea: ");
        System.out.println("1. Gaseosa ");
        System.out.println("2. Jugo");
        bebidaSeleccionada = sc.nextLine();
        
    }
    
    public void recibirOrden(Comida alimento, Bebida iBebida){
        
        System.out.println("Ya esta lista su orden aqui tiene su " + alimento.nombre);
        System.out.println("y aqui tiene su " + iBebida.nombre);
    }
    
    public String getComidaSeleccionada() {
        return comidaSeleccionada;
    }

    public void setComidaSeleccionada(String comidaSeleccionada) {
        this.comidaSeleccionada = comidaSeleccionada;
    }

    public String getBebidaSeleccionada() {
        return bebidaSeleccionada;
    }

    public void setBebidaSeleccionada(String bebidaSeleccionada) {
        this.bebidaSeleccionada = bebidaSeleccionada;
    }

}

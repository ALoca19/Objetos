/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author anita
 */
public class Bolso {
    
    public String marca;
    public int precio;
    public String material;

    public Bolso(String marca, int precio, String material) {
        this.marca = marca;
        this.precio = precio;
        this.material = material;
    }
    
    public Bolso() {
        this.marca = "Desconocido";
        this.precio = 0;
        this.material = "Desconocido";
    }
    
    public void informacionBolso()
    {
        System.out.println("El bolso de marca "+marca+" cuesta "+precio);
    }
}

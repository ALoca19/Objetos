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
public class Carro {
    public String marca;
    public int precio;
    public int numPuertas;

    public Carro(String marca, int precio, int numPuertas) {
        this.marca = marca;
        this.precio = precio;
        this.numPuertas = numPuertas;
    }
    
    public Carro() {
        this.marca = "Toyota";
        this.precio = 150000;
        this.numPuertas = 4;
    }
    
    public void informacionCarro() {
        System.out.println("El carro cuesta "+precio);
    }
    
    
}

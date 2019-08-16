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
public class Casa {
    public int numPuertas;
    public String direccion;
    public int numero;

    public Casa(int numPuertas, String direccion, int numero) {
        this.numPuertas = numPuertas;
        this.direccion = direccion;
        this.numero = numero;
    }
    
    public Casa() {
        this.numPuertas = 0;
        this.direccion = "Desconocido";
        this.numero = 0;
    }
    
    public Casa(String direccion, int numero)
    {
        this.direccion = direccion;
        this.numero = numero;
    }
    
}

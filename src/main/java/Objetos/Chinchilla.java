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
public class Chinchilla {
    public String genero;
    public String nombre;
    public int cantidad;

    public Chinchilla(String genero, String nombre, int cantidad) {
        this.genero = genero;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public Chinchilla() {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
        this.cantidad = 0;
    }
    
    public Chinchilla(String genero, String nombre) {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
    }
}

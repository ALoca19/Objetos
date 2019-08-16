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
public class Conejo {
    public String genero;
    public String nombre;
    public int tamaño;

    public Conejo(String genero, String nombre, int tamaño) {
        this.genero = genero;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    
    public Conejo() {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
        this.tamaño = 0;
    }
    
    public Conejo(String genero, String nombre) {
        this.genero = "Desconocido";
        this.nombre = "Desconocido";
    }
}

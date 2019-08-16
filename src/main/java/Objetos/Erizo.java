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
public class Erizo {
    public String genero;
    public String especie;
    public String nombre;

    public Erizo(String genero, String especie, String nombre) {
        this.genero = genero;
        this.especie = especie;
        this.nombre = nombre;
    }
    
    public Erizo() {
        this.genero = "Desconocido";
        this.especie = "Desconocido";
        this.nombre = "Desconocido";
    }
    
    public Erizo(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    } 
    
    
}

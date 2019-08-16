/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Alumno
 */
public class Tenni {
    public int precio;
    public String color;
    public String marca;

    public Tenni(int precio, String color, String marca) {
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }
    
    public Tenni() {
        this.precio = 0;
        this.color = "Desconocido";
        this.marca = "Desconocido";
    }
    
    public Tenni(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }
    
}

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
public class Gato {
    public String especie;
    public int edad;
    public String color;

    public Gato(String especie, int edad, String color) {
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }
    
    public Gato() {
        this.especie = "Desconocida";
        this.edad = 0;
        this.color = "Desconocida";
    }
    
    public void datos()
    {
        System.out.println("El gato "+especie+" es color "+color);
    }
    
}

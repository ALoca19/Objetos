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
public class Pelicula {
    public double duracion;
    public String titulo;
    public String genero;

    public Pelicula(double duracion, String titulo, String genero) {
        this.duracion = duracion;
        this.titulo = titulo;
        this.genero = genero;
    }
    
    public Pelicula() {
        this.duracion = 0.0;
        this.titulo = "Desconocido";
        this.genero = "Desconocido";
    }
    
    public void inforPeli()
    {
        System.out.println("La pelicula "+titulo+" dura "+duracion);
    }
    
    
    
}

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
public class Libro {
    public int numeroHojas;
    public String autor;
    public String titulo;

    public Libro(int numeroHojas, String autor, String titulo) {
        this.numeroHojas = numeroHojas;
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public Libro() {
        this.numeroHojas = 0;
        this.autor = "Desconocido";
        this.titulo = "Desconocido";
    }
    
    public Libro(String autor, String titulo) {
       
        this.autor = autor;
        this.titulo = titulo;
    }
    
}

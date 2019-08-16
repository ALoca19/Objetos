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
public class Alumno {
    public String nombre;
    public String grupo;
    public int semestre;

    public Alumno(String nombre, String grupo, int semestre) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.semestre = semestre;
    }
    
    public Alumno() {
        this.nombre = "Desconocido";
        this.grupo = "Desconocido";
        this.semestre = 0;
    }
    
    public void presentacion()
    {
        System.out.println("Mi nombre es "+nombre+" voy en "+semestre+" en el grupo "+grupo);
    }
    
    
            
}

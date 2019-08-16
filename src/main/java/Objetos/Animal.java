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
public class Animal {
    
    public String nombreTipo;
    public String enPeligro;
    public String numEjemplares;

    public Animal(String nombreTipo, String enPeligro, String numEjemplares) {
        this.nombreTipo = nombreTipo;
        this.enPeligro = enPeligro;
        this.numEjemplares = numEjemplares;
    }
    
    public Animal() {
        this.nombreTipo = "Desconocido";
        this.enPeligro = "Desconocido";
        this.numEjemplares = "Desconocido";
    }
    
    public void informacion()
    {
        System.out.println("Hay "+numEjemplares+" "+nombreTipo+" en el mundo");
    }
    
    
    
    
}

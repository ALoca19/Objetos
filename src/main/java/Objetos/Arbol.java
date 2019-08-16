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
public class Arbol {
    
    public String nombreArbol;
    public String fruto;
    public String region;

    public Arbol(String nombreArbol, String fruto, String region) {
        this.nombreArbol = nombreArbol;
        this.fruto = fruto;
        this.region = region;
    }
    
    public Arbol() {
        this.nombreArbol = "Desconocido";
        this.fruto = "Desconocido";
        this.region = "Desconocido";
    }
    
    public void informacionArbol()
    {
        System.out.println("El "+nombreArbol+" crece en "+region);
    }
    
}

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
public class Elefante {
    public String especie;
    public int numExistencia;
    public String region;

    public Elefante(String especie, int numExistencia, String region) {
        this.especie = especie;
        this.numExistencia = numExistencia;
        this.region = region;
    }
    
    public Elefante(String especie, String region) {
        this.especie = especie;
        this.region = region;
    }
    
    public Elefante() {
        this.especie = "Desconocida";
        this.region = "Desconocida";
    }
    
    
}

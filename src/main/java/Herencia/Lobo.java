/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author anita
 */
public class Lobo extends Canino{
    
    private String region;

    public Lobo(String region, String raza, double tamaño, String familia, int edad, double peso) {
        super(raza, tamaño, familia, edad, peso);
        this.region = region;
    }

    public Lobo(String region) {
        this.region = region;
    }

    

    

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "El Lobo es de la region " +region;
    }
    
    
}

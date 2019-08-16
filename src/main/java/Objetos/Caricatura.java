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
public class Caricatura {
    public String nombreCaricatura;
    public int numTemporadas;
    public int añoEstreno;

    public Caricatura(String nombreCaricatura, int numTemporadas, int añoEstreno) {
        this.nombreCaricatura = nombreCaricatura;
        this.numTemporadas = numTemporadas;
        this.añoEstreno = añoEstreno;
    }
    
    public Caricatura() {
        this.nombreCaricatura = "Desconocido";
        this.numTemporadas = 0;
        this.añoEstreno = 0;
    }
    
    public void informacionCaricatura()
    {
        System.out.println("La caricatura de "+nombreCaricatura+ "se creo en "+añoEstreno);
    }
}

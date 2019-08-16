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
public class Oso {
    
    public int peso;
    public String raza;
    public String genero;

    public Oso(int peso, String raza, String genero) {
        this.peso = peso;
        this.raza = raza;
        this.genero = genero;
    }
    
    public Oso() {
        this.peso = 0;
        this.raza = "Desconocido";
        this.genero = "Desconocido";
    }
    
    public void infoOso()
    {
        System.out.println("El oso "+raza+" pesa "+peso);
    }
    
}

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
public class Rectangulo {
    public int lado1;
    public int lado2;
    public int area;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = lado1*lado2;
    }
    
    public Rectangulo() {
        this.lado1 = 0;
        this.lado2 = 0;
        this.area = 0;
    }
    
    public Rectangulo(int lado1, int lado2, int area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }
    
    
}

package Objetos;

public class Perro {
    
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void infoPerro(String nombre, String raza) {
        System.out.println("mi perro "+nombre+ " es de raza "+raza);
    }
    
    public Perro() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.raza = "Desconocido";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }
    
    
}

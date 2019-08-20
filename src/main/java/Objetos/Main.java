package Objetos;


public class Main {
    
    //20 clases
    //3 atributos por clase
    // 2 constructores
    //un objeto de cada uno
    
    public static void main(String[] args) {
        Alumno alumno=new Alumno("Ana", "2CM1", 3);
        Animal animal=new Animal("Panda", "En extincion", "10000");
        AnimeAgretsuko anime=new AnimeAgretsuko("Retsuko", "Fenneko", "Haida");
        Arbol arbol=new Arbol("Abeto", "ninguno", "Alpes");
        Bolso bolso= new Bolso("Amore", 6500, "Cuero");
        Caricatura cartoon=new Caricatura("Danny Phantom", 3, 2009);
        Carro carro=new Carro("Toyota", 1500000, 2);
        Casa casa=new Casa("Chapultepec", 29);
        Chinchilla chin=new Chinchilla("Maculino", "Rufus");
        Conejo conejo=new Conejo("Cabeza de leon", "Bonnie");
        Elefante elefante=new Elefante("Elefante gris", "sudafrica");
        Erizo erizo=new Erizo("africano", "Tod");
        Gato gato=new Gato("Siames", 2, "Gris");
        Libro libro=new Libro("Sthepen King", "El fugitivo");
        Lobo lobo=new Lobo();
        Oso oso=new Oso();
        Pelicula movie=new Pelicula(3.50, "It 2", "Terror");
        Perro perro=new Perro("Connie", 3, "Chihuahua");
        Persona persona=new Persona("Ana", 19);
        Rectangulo rec=new Rectangulo(5, 10);
        Tenni teni=new Tenni(6500, "Puma");
        
        anime.setAmigadelPerPri("Prueba");
        System.out.println("Pueba: "+anime.getAmigadelPerPri());
        
        
        
        
        
        
    }
}

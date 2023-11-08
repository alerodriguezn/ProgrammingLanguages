public class Main {

    public static void main(String[] args) {

        Biblioteca bibliotecaTEC = new Biblioteca();

        bibliotecaTEC.addLibro(new Libro("Las Cronicas de Juancito", "Autor 1", "1A1A1A1"));
        bibliotecaTEC.addLibro(new Libro("Ana y Juan", "Autor 2", "2A2A2A2"));
        bibliotecaTEC.addLibro(new Libro("El pato Jorge", "Autor 3", "3A3A3A3"));
        bibliotecaTEC.addLibro(new Libro("Harry Potter", "Autor 4", "4A4A4A4"));
        bibliotecaTEC.addLibro(new Libro("El senor de los Anillos", "Autor 4", "212A4A4"));
        bibliotecaTEC.addLibro(new Libro("Hobbit 4", "Autor 6", "1231233"));


        bibliotecaTEC.addSocio(new Socio("Manuel Jimenez", "1S1S1S1", "Direccion 1"));
        bibliotecaTEC.addSocio(new Socio("Maria Zamora", "2S2S2S2", "Direccion 2"));

        bibliotecaTEC.addPrestamo(new Prestamo(bibliotecaTEC.getLibros().get(0), bibliotecaTEC.getSocios().get(0), "01/01/2020"));
        bibliotecaTEC.addPrestamo(new Prestamo(bibliotecaTEC.getLibros().get(1), bibliotecaTEC.getSocios().get(0), "01/01/2020"));
        bibliotecaTEC.addPrestamo(new Prestamo(bibliotecaTEC.getLibros().get(2), bibliotecaTEC.getSocios().get(1), "01/01/2020"));
        bibliotecaTEC.addPrestamo(new Prestamo(bibliotecaTEC.getLibros().get(3), bibliotecaTEC.getSocios().get(0), "01/01/2020"));
        bibliotecaTEC.addPrestamo(new Prestamo(bibliotecaTEC.getLibros().get(4), bibliotecaTEC.getSocios().get(0), "01/01/2020"));

        
        System.out.println("=== Libros disponibles: ===");
        bibliotecaTEC.printLibrosDisponibles();

        System.out.println("=== Libros prestados: ===");
        bibliotecaTEC.printLibrosPrestados();

       

        System.out.println("=== Socios con más de 3 libro prestados: ===");
        bibliotecaTEC.printSociosConMasLibrosPrestados();
        


    }
    
}

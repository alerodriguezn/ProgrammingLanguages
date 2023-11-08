import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
        this.socios = new ArrayList<Socio>();
        this.prestamos = new ArrayList<Prestamo>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void removeLibro(Libro libro) {
        this.libros.remove(libro);
    }

    public void removeSocio(Socio socio) {
        this.socios.remove(socio);
    }

    public void removePrestamo(Prestamo prestamo) {
        this.prestamos.remove(prestamo);
    }

    public void printLibros() {
        for (Libro libro : this.libros) {
            System.out.println(libro.getTitulo());
        }
    }

    public void printSocios() {
        for (Socio socio : this.socios) {
            System.out.println(socio.getNombre());
        }
    }

    public void printPrestamos() {
        for (Prestamo prestamo : this.prestamos) {
            System.out.println(prestamo.getLibro().getTitulo() + " - " + prestamo.getSocio().getNombre());
        }
    }

    public void printLibrosPrestados() {
        for (Prestamo prestamo : this.prestamos) {
            System.out.println(prestamo.getLibro().getTitulo());
        }
    }

    public void printLibrosDisponibles() {
        for (Libro libro : this.libros) {
            if (libro.getDisponible()) {
                System.out.println(libro.getTitulo());
            }
        }
    }

    // usando filter
    public void printSociosConMasLibrosPrestados() {
        this.socios.stream().filter(socio -> socio.getLibrosPrestados().size() > 3).forEach(socio -> System.out.println(socio.getNombre()));
    }

}

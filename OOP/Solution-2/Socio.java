import java.util.ArrayList;

public class Socio {

    private String nombre;
    private String numeroSocio;
    private String direccion;
    private ArrayList<Libro> librosPrestados;

    public Socio(String nombre, String numeroSocio, String direccion) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.direccion = direccion;
        this.librosPrestados = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void addLibroPrestado(Libro libro) {
        this.librosPrestados.add(libro);
    }
    
}

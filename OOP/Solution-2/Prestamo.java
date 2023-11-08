public class Prestamo {

    private Libro libro;
    private Socio socio;
    private String fecha;

    public Prestamo(Libro libro, Socio socio, String fecha) {
        this.libro = libro;
        this.socio = socio;
        this.fecha = fecha;
        this.socio.addLibroPrestado(this.libro);
        this.libro.setDisponible(false);
    }

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public String getFecha() {
        return fecha;
    }

    
}

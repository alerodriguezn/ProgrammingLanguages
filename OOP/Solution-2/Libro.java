public class Libro {

    private String titulo;
    private String autor;
    private Boolean disponible;
    private String codigoISBN;

    public Libro(String titulo, String autor, String codigoISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoISBN = codigoISBN;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }


    
}


public abstract class Contacto {

    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //toString
    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Telefono: " + this.telefono;
    }

    
}

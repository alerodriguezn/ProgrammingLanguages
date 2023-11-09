
public class Evento {

    private String nombre;
    private String fecha;

    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    //toString
    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Fecha: " + this.fecha;
    }
    
}



public class EventoParticular extends Evento{

    private String lugar;

    public EventoParticular(String nombre, String fecha, String lugar) {
        super(nombre, fecha);
        this.lugar = lugar;

    }

    //toString
    public String toString() {
        return super.toString() + "\n" + "Lugar: " + this.lugar + "\n";
    }

    
    
}

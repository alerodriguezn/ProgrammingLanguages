

public class EventoEspecial extends Evento {

    private String motivo;

    public EventoEspecial(String nombre, String fecha, String motivo) {
        super(nombre, fecha);
        this.motivo = motivo;
    }

    //toString
    public String toString() {
        return super.toString() + "\n" + "Motivo: " + this.motivo;
    }
    
}

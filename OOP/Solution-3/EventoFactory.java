
/*
 * 
 * Se crea la interfaz EventoFactory que contiene el metodo crearEvento
 * 
 */
public interface EventoFactory {

    public Evento crearEvento(String nombre, String fecha, String opt);

}

class EventoEspecialFactory implements EventoFactory {

    public Evento crearEvento(String nombre, String fecha , String motivo) {
        return new EventoEspecial(nombre, fecha, motivo);
    }

}

class EventoParticularFactory implements EventoFactory {

    public Evento crearEvento(String nombre, String fecha, String lugar) {
        return new EventoParticular(nombre, fecha, lugar);
    }

}
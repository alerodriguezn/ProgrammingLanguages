import java.util.ArrayList;

public class Documento {

    private String nombre;
    private ArrayList<Hoja> hojas;

    public Documento(String nombre) {
        this.nombre = nombre;
        this.hojas = new ArrayList<Hoja>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Hoja> getHojas() {
        return this.hojas;
    }

    public void agregarHoja(Hoja hoja) {
        this.hojas.add(hoja);
    }

    

   
    

}
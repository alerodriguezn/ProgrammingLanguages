
public class ContactoFamiliar extends Contacto {

    private String relacion;

    public ContactoFamiliar(String nombre, String telefono, String relacion) {
        super(nombre, telefono);
        this.relacion = relacion;
    }

    //toString

    public String toString() {
        return super.toString() + "\n" + "Relacion: " + this.relacion;
    }

}
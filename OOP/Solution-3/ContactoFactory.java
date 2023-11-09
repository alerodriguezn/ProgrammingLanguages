

/*
 * 
 * Se crea la interfaz ContactoFactory que contiene el metodo crearContacto
 */
public interface ContactoFactory {

    public Contacto crearContacto(String nombre, String telefono, String empresa);

}

class ContactoEmpresarialFactory implements ContactoFactory {

    public Contacto crearContacto(String nombre, String telefono, String empresa) {
        return new ContactoEmpresarial(nombre, telefono, empresa);
    }

}
class ContactoFamiliarFactory implements ContactoFactory {

    public Contacto crearContacto(String nombre, String telefono, String relacion) {
        return new ContactoFamiliar(nombre, telefono, relacion);
    }

}
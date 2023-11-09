

public class ContactoEmpresarial extends Contacto {

    private String empresa;

    public ContactoEmpresarial(String nombre, String telefono, String empresa) {
        super(nombre, telefono);
        this.empresa = empresa;
    }


    //toString
    public String toString() {
        return super.toString() + "\n" + "Empresa: " + this.empresa;
    }


  


     
}
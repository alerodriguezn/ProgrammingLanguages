import java.util.ArrayList;

public class Hoja {
    
    private String nombre;
    private ArrayList<ObjetoGeometrico> objetos = new ArrayList<>();

    public Hoja(String nombre) {
        this.nombre = nombre;
    }

    public void addObject(ObjetoGeometrico objeto) {
        this.objetos.add(objeto);
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<ObjetoGeometrico> getObjetos() {
        return this.objetos;
    }

  




}
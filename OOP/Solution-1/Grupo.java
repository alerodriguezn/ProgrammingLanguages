import java.util.ArrayList;

public class Grupo extends ObjetoGeometrico {

    
    private ArrayList<ObjetoGeometrico> objetos = new ArrayList<>();

    public void addObject(ObjetoGeometrico objeto) {
        this.objetos.add(objeto);
    }

    
}


//Eager Singleton
/*
 * Se crea la clase AgendaSingleton que contiene el metodo getInstance()
 * 
 */
import java.util.ArrayList;

public class AgendaSingleton {

    private static AgendaSingleton instance = new AgendaSingleton();
    private ArrayList<Object> elementos = new ArrayList<Object>();

    private AgendaSingleton() {
    }

    public static AgendaSingleton getInstance() {
        return instance;
    }

    public void addElemento(Object elemento) {
        this.elementos.add(elemento);
    }

    public void removeElemento(Object elemento) {
        this.elementos.remove(elemento);
    }

    public void imprimirElementos() {
        for (Object elemento : elementos) {
            System.out.println(elemento.toString());
        }
    }

   
    
}

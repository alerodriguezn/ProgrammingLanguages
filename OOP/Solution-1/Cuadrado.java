public class Cuadrado extends ObjetoGeometrico {

    private int lado;

    public Cuadrado(int posX, int posY, int lado) {
        this.setPosX(posX);
        this.setPosY(posY);
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }
    
}

public class Rectangulos extends ObjetoGeometrico {

    private int largo;
    private int ancho;

    public Rectangulos(int posX, int posY, int largo, int ancho) {
        this.setPosX(posX);
        this.setPosY(posY);
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return this.largo;
    }

    public int getAncho() {
        return this.ancho;
    }

}

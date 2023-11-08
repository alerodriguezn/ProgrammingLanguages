public class Circulo extends ObjetoGeometrico {
    private int radio;

    public Circulo(int posX, int posY, int radio) {
        this.setPosX(posX);
        this.setPosY(posY);
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }
    
}

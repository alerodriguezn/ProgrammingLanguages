public class Elipse extends ObjetoGeometrico {

    private int radio1;
    private int radio2;

    public Elipse(int posX, int posY, int radio1, int radio2) {
        this.setPosX(posX);
        this.setPosY(posY);
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    public int getRadio1() {
        return this.radio1;
    }

    public int getRadio2() {
        return this.radio2;
    }

    
}

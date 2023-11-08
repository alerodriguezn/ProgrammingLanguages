public class Linea extends ObjetoGeometrico {
        
        private int largo;
    
        public Linea(int posX, int posY, int largo) {
            this.setPosX(posX);
            this.setPosY(posY);
            this.largo = largo;
        }
    
        public int getLargo() {
            return this.largo;
        }
    
}

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Documento 1");
        Hoja hoja1 = new Hoja("Hoja 1");

        Grupo grupo1 = new Grupo();
        grupo1.setPosX(10);
        grupo1.setPosY(10);

        Linea linea1 = new Linea(10, 10, 100);
        Linea linea2 = new Linea(10, 20, 100);

        Circulo circulo1 = new Circulo(10, 10, 100);
        Cuadrado cuadrado1 = new Cuadrado(10, 10, 100);
        Elipse elipse1 = new Elipse(10, 10, 100, 50);


        grupo1.addObject(linea1);
        grupo1.addObject(linea2);
        grupo1.addObject(circulo1);
        grupo1.addObject(cuadrado1);
        grupo1.addObject(elipse1);

        hoja1.addObject(grupo1);

        documento.agregarHoja(hoja1);

        
      
    }
}


/*
Pregunta:
 Documente en el código las diferencias entre un Eager Singleton y un Lazy Singleton 
 y defina cual le parece que sea mejor utilizar en la implementación del problema y por qué?"
Respuesta:

La diferencia entre un Eager Singleton y un Lazy Singleton es que el Eager Singleton se crea al momento de la 
ejecución del programa, mientras que el Lazy Singleton se crea cuando se llama al método getInstance().
Si la inicializacion de la Agenda no es muy pesada y no se necesita inmediatamente, es mejor utilizar el Lazy Singleton
ya que se ahorra memoria y tiempo de ejecución. Si la inicializacion de la Agenda es pesada y se necesita inmediatamente,
es mejor utilizar el Eager Singleton ya que se ahorra tiempo de ejecución.
 */

public class Main {

    public static void main(String[] args) {
        AgendaSingleton agenda = AgendaSingleton.getInstance();

        ContactoFactory familiarFactory = new ContactoFamiliarFactory();
        ContactoFactory empresarialFactory = new ContactoEmpresarialFactory();

        Contacto contacto1 = familiarFactory.crearContacto("Juan", "123456789", "Hermano");
        Contacto contacto2 = familiarFactory.crearContacto("Pedro", "123456789", "Padre");

        Contacto contacto3 = empresarialFactory.crearContacto("Juan", "123456789", "Empresa 1");
        Contacto contacto4 = empresarialFactory.crearContacto("Pedro", "123456789", "Empresa 2");

        agenda.addElemento(contacto1);
        agenda.addElemento(contacto2);
        agenda.addElemento(contacto3);
        agenda.addElemento(contacto4);

        EventoFactory eventoFactory = new EventoEspecialFactory();
        EventoFactory eventoFactory2 = new EventoParticularFactory();

        Evento evento1 = eventoFactory.crearEvento("Evento 1", "01/01/2020", "Motivo 1");
        Evento evento2 = eventoFactory.crearEvento("Evento 2", "01/01/2020", "Motivo 2");

        Evento evento3 = eventoFactory2.crearEvento("Evento 3", "01/01/2020", "Lugar 1");
        Evento evento4 = eventoFactory2.crearEvento("Evento 4", "01/01/2020", "Lugar 2");

        agenda.addElemento(evento1);
        agenda.addElemento(evento2);

        agenda.addElemento(evento3);
        agenda.addElemento(evento4);


        agenda.imprimirElementos();


        

    }
    



}

package es.iespablopicasso.programacion.unidad02.actividad0201;

public class GranHermanoApp {

  public static void main(String[] args) {

    // Creamos 3 objetos de la clase GranHermano
    GranHermano hermano1 = new GranHermano(20);
    GranHermano hermano2 = new GranHermano(30);
    GranHermano hermano3 = new GranHermano(40);

    // Se deben haber creado 3 objetos
    System.out.println("Se han creado " + GranHermano.getNumeroObjetosCreados() + " objetos");

    // Creamos dos mas
    GranHermano hermano4 = new GranHermano(50);
    GranHermano hermano5 = new GranHermano(60);

    // Ahora deben aparecer 5
    System.out.println("Se han creado " + GranHermano.getNumeroObjetosCreados() + " objetos");

  }

}

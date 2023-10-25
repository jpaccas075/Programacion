
public class pentagono {

  public static void main(String[] args) {
    Punto inicio = new Punto(25, 55);
    Lapiz lapiz1 = new Lapiz();

    lapiz1.mueve(inicio);
    lapiz1.baja();
    lapiz1.desplaza(20);
    lapiz1.gira(72);
    lapiz1.desplaza(20);
    lapiz1.gira(72);
    lapiz1.desplaza(20);
    lapiz1.gira(72);
    lapiz1.desplaza(20);
    lapiz1.gira(72);
    lapiz1.desplaza(20);
    lapiz1.sube();

    System.out.print("Trazos: " + lapiz1.getNumTrazos());

  }

}


public class tri {

  public static void main(String[] args) {
    Punto punto1 = new Punto(20, 35);
    Lapiz lapiz1 = new Lapiz();

    lapiz1.mueve(punto1);
    lapiz1.baja();
    lapiz1.desplaza(30);
    lapiz1.gira(120);
    lapiz1.desplaza(30);
    lapiz1.gira(120);
    lapiz1.desplaza(30);
    lapiz1.sube();

    System.out.println("Trazos: " + lapiz1.getNumTrazos());

  }

}

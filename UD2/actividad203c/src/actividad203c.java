
public class actividad203c {

  public static void main(String[] args) {
    // Crear los puntos del cuadrado
    Punto punto1 = new Punto(0, 0);
    Punto punto2 = new Punto(-20, 0);
    Punto punto3 = new Punto(-20, -20);
    Punto punto4 = new Punto(0, -20);

    Lapiz lapiz1 = new Lapiz();

    lapiz1.baja();
    lapiz1.gira(180);
    lapiz1.mueve(punto2);
    lapiz1.gira(90);
    lapiz1.mueve(punto3);
    lapiz1.gira(90);
    lapiz1.mueve(punto4);
    lapiz1.gira(90);
    lapiz1.mueve(punto1);
    lapiz1.sube();

    System.out.println("Trazos: " + lapiz1.getNumTrazos());

  }

}

import java.util.Scanner;

public class Ejercicio28 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("EDADES LOCAS");
    System.out.println("------------");
    System.out.print("Introduce la edad de la primera persona: ");
    int edad1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce la edad de la segunda persona: ");
    int edad2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce la edad de la tercera persona: ");
    int edad3 = Integer.parseInt(sc.nextLine());

    boolean edadFinal = (edad1 > edad2) && (edad2 > edad3);

    System.out
        .println("\"True\" la edad de la primera persona es mayor que la de la segunda y ésta es mayor que la de la tercera: " + edadFinal);
  }

}

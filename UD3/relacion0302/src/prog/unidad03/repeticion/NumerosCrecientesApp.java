package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosCrecientesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("NÚMEROS CRECIENTES");
    System.out.print("Introduce un número entero: ");
    int numPrevio = Integer.parseInt(sc.nextLine());
    int numNuevo = numPrevio;

    do {
      numPrevio = numNuevo;
      System.out.print(
          "Introduce ahora un número mayor que " + numPrevio + " (Introduce un número menor o igual para terminar): ");
      numNuevo = Integer.parseInt(sc.nextLine());
    } while (numPrevio < numNuevo);
    System.out.println("El número " + numNuevo + " no es mayor que el número anterior " + numPrevio + ". Terminando");
  }

}

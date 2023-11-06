package prog.unidad03.repeticion;

import java.util.Scanner;

public class DetectorPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("DETECTOR DE NÚMEROS PRIMOS");
    System.out.print("Introduce un número entero mayor que 1 para ver si es primo o no: ");
    int numero = Integer.parseInt(sc.nextLine());

    boolean esPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        esPrimo = false;

      }
    }
    if (esPrimo) {
      System.out.println("El número " + numero + " es primo.");
    } else {
      System.out.println("El número " + numero + " NO es primo.");
    }

  }

}

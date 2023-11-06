package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero = 0;
    int contador = 0;

    System.out.println("CONTADOR DE POSITIVOS");

    while (numero >= 0) {
      System.out.print("Introduce un número positivo o cero (negativo para terminar): ");
      numero = Integer.parseInt(sc.nextLine());

      contador++;

    }
    System.out.println("Has introducido " + (contador - 1) + " números positivos.");

  }

}

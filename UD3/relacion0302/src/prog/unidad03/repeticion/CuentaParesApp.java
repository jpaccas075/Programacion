package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("CUENTA PARES");
    System.out.print("¿Cuántos números pares deseas introducir? ");
    int numNumeros = Integer.parseInt(sc.nextLine());

    int numPares = 0;

    do {
      System.out.print("Introduce un número entero: ");
      int numero = Integer.parseInt(sc.nextLine());

      if (numero % 2 == 0) {
        numPares++;
      }

      int numRestantes = numNumeros - numPares;

      if (numPares < numNumeros) {
        System.out.println("Te quedan " + numRestantes + " números pares por introducir.");

      }
    } while (numPares < numNumeros);

    System.out.println("¡Ya has introducido " + numNumeros + " pares!");

  }
}
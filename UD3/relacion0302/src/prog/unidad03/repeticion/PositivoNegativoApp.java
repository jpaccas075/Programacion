package prog.unidad03.repeticion;

import java.util.Scanner;

public class PositivoNegativoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 1;

    while (numero != 0) {
      System.out.print("Introduce un numero entero (0 para terminar): ");
      numero = Integer.parseInt(sc.nextLine());

      if (numero > 0) {
        System.out.println("El número " + numero + " es positivo.");
      } else if (numero == 0) {
        System.out.println("");
      } else {
        System.out.print("El número " + numero + " es negativo.\n");
      }

    }

  }

}

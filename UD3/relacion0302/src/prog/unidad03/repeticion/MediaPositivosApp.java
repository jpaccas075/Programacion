package prog.unidad03.repeticion;

import java.util.Scanner;

public class MediaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double numero = 0;
    double contador = 0;
    double suma = 0;

    System.out.println("CONTADOR DE POSITIVOS");

    while (numero >= 0) {
      System.out.print("Introduce un número positivo o cero (negativo para terminar): ");
      numero = Integer.parseInt(sc.nextLine());

      contador++;

      if (numero > 0) {
        suma = suma + numero;
      }

    }
    double media = suma / (contador - 1);
    System.out.println("La media de los " + (int) (contador - 1) + " números introducidos vale " + media);

  }

}

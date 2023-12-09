package prog.unidad04.actividad404.ejercicio05;

import java.util.Scanner;

import prog.unidad04.actividad404.ejercicio04.CalculadorMedia;

public class CalculaMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean valorCorrecto = false;
    int numNumeros = 0;

    do {
      try {
        System.out.print("Introduce la cantidad de números que vas a introducir (uno o mas): ");
        numNumeros = Integer.parseInt(sc.nextLine());

        if (numNumeros <= 0) {
          System.out.println("El número debe ser mayor que cero. Inténtalo de nuevo");
        } else {
          valorCorrecto = true;
        }

      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducino no es un número entero. Inténtalo de nuevo");
      }

    } while (!valorCorrecto);

    CalculadorMedia calculador = new CalculadorMedia(0);

    for (int i = 1; i <= numNumeros; i++) {
      try {
        System.out.print("Introduce el número (" + i + "): ");
        double numero = Double.parseDouble(sc.nextLine());
        calculador.add(numero);

      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducino no es un número entero. Inténtalo de nuevo");
        i--;
      }

    }

    System.out.println("La media de los números introducidos es " + calculador.getMedia());

  }

}

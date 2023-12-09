package prog.unidad04.actividad404.ejercicio08;

import java.util.Scanner;

import prog.unidad04.actividad404.ejercicio07.MayorMenor;

public class MayorMenorApp {

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

    MayorMenor calculador = new MayorMenor(0);

    for (int i = 1; i <= 1; i++) {
      try {
        System.out.print("Introduce el número (" + i + "): ");
        int numero = Integer.parseInt(sc.nextLine());
        calculador = new MayorMenor(numero);

      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducino no es un número entero. Inténtalo de nuevo");
        i--;
      }

    }

    for (int i = 2; i <= numNumeros; i++) {
      try {
        System.out.print("Introduce el número (" + i + "): ");
        int numero = Integer.parseInt(sc.nextLine());
        calculador.add(numero);

      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducino no es un número entero. Inténtalo de nuevo");
        i--;
      }

    }

    System.out.println(
        "El mayor de los números introducidos es " + calculador.getMayor() + " y el menor es " + calculador.getMenor());

  }

}

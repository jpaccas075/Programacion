package prog.unidad04.actividad404.ejercicio09;

import java.util.Scanner;

import prog.unidad04.actividad404.ejercicio07.MayorMenor;

public class MayorMenorPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MayorMenor calculador = new MayorMenor(0);

    int numero = 0;
    int contadorNumeros = 0;

    do {
      try {
        System.out.print("Introduce un número entero (negativo para terminar): ");
        numero = Integer.parseInt(sc.nextLine());
        calculador = new MayorMenor(numero);
        contadorNumeros++;
      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducido no es un número entero. Inténtalo de nuevo");
      }

    } while (contadorNumeros != 1);

    while (numero >= 0) {
      try {
        System.out.print("Introduce un número entero (negativo para terminar): ");
        numero = Integer.parseInt(sc.nextLine());
        calculador.add(numero);
        contadorNumeros++;
      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducido no es un número entero. Inténtalo de nuevo");
      }

    }

    if (contadorNumeros == 1) {
      System.out.println("No se introdujo ningún número, por lo que no hay resultado");
    } else {
      System.out
          .println("El mayor de los números es " + calculador.getMayor() + " y el menor es " + calculador.getMenor());
    }

  }

}

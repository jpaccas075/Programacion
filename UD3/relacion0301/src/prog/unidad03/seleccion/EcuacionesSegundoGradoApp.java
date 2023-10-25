package prog.unidad03.seleccion;

import java.util.Scanner;

public class EcuacionesSegundoGradoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // título
    System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");

    // solicitar valores para realizar la ecuación de segundo grado
    System.out.print("Introduce el valor del coeficiente a: ");
    double valorA = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor del coeficiente b: ");
    double valorB = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor del coeficiente c: ");
    double valorC = Double.parseDouble(sc.nextLine());

    if (((valorB * valorB) - 4 * (valorA * valorC)) > 0) {
      double primeraSolucion = ((-valorB) + Math.sqrt((valorB * valorB) - (4 * valorA * valorC))) / (2 * valorA);
      double segundaSolucion = ((-valorB) - Math.sqrt((valorB * valorB) - (4 * valorA * valorC))) / (2 * valorA);
      System.out.println("La ecuación tiene dos soluciones reales distintas.");
      System.out.println("La primera solución es: " + primeraSolucion);
      System.out.println("La segunda solución es: " + segundaSolucion);
    } else if (((valorB * valorB) - 4 * (valorA * valorC)) == 0) {
      double solucion = ((-valorB) - Math.sqrt((valorB * valorB) - (4 * valorA * valorC))) / (2 * valorA);
      System.out.println("La ecuación tiene una única solución real.");
      System.out.println("La solución es: " + solucion);
    } else {
      System.out.println("La ecuación no tiene solución real alguna.");
    }

  }

}

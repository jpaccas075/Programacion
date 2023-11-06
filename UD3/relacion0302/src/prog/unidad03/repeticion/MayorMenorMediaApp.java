package prog.unidad03.repeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("MAYOR, MENOR Y MEDIA");
    System.out.print("¿Cuántos números deseas introducir? ");
    double numNumeros = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce el número 1: ");
    double num = Double.parseDouble(sc.nextLine());

    double sumaTotal = num;
    double menor = num;
    double mayor = num;

    for (int i = 2; i <= numNumeros; i++) {
      System.out.print("Introduce el número " + i + ": ");
      double num2 = Double.parseDouble(sc.nextLine());

      sumaTotal = sumaTotal + num2;

      if (menor > num2) {
        menor = num2;
      }

      if (mayor < num2) {
        mayor = num2;
      }

      if (i == numNumeros) {
        double media = sumaTotal / numNumeros;
        System.out.println("El mayor de los números introducidos ha sido: " + mayor);
        System.out.println("El menor de los números introducidos ha sido: " + menor);
        System.out.println("La media de todos los números vale " + media);
      }

    }

  }
}
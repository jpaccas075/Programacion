package prog.unidad03.repeticion;

import java.util.Scanner;

public class SumaIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("SUMA DE UN INTERVALO");

    int comienzoIntervalo;
    int finIntervalo;
    int suma = 0;

    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      finIntervalo = Integer.parseInt(sc.nextLine());

      if (comienzoIntervalo > finIntervalo) {
        System.out.println("Error. El número " + finIntervalo + " es mayor que " + comienzoIntervalo + ".");
      }

    } while (comienzoIntervalo > finIntervalo);

    for (int i = comienzoIntervalo; i <= finIntervalo; i++) {
      suma = suma + i;
    }

    System.out.println("La suma de los numeros vale " + suma);
  }

}

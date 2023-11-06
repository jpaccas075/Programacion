package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("CÁLCULO DE FACTORIAL");
    System.out.print("Introduce un número entero mayor que cero para calcular su factorial: ");
    long numero = Long.parseLong(sc.nextLine());

    long acumulador = 1;

    for (int i = 1; i <= numero; i++) {
      acumulador = acumulador * i;

    }
    System.out.println("El factorial de " + numero + " vale " + acumulador);
  }

}

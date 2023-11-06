package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaDivisoresApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("DIVISORES DE UN NÚMERO");
    System.out.print("Introduce un número entero para que calcule sus divisores: ");
    int num = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.println("Es divisible por " + i);
      }
    }

  }

}

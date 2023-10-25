package prog.unidad03.seleccion;

import java.util.Scanner;

public class ClasificaTriangulosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
    System.out.print("Introduce la longitud del primer lado: ");
    double lado1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del segundo lado: ");
    double lado2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del tercer lado: ");
    double lado3 = Double.parseDouble(sc.nextLine());

    if ((lado1 == lado2) && (lado2 == lado3)) {
      System.out.println("Es un triángulo equilátero.");
    } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
      System.out.println("Es un triángulo isósceles.");
    } else {
      System.out.println("Es un triángulo escaleno.");
    }

  }

}

package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesImparesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("CUENTA PARES O IMPARES");
    System.out.print("¿Cuántos números deseas introducir? ");
    int numNumeros = Integer.parseInt(sc.nextLine());

    int par = 0;
    int impar = 0;
    
    for (int i = 1; i <= numNumeros; i++) {
      System.out.print("Introduce el número " + i + ": ");
      int valor = Integer.parseInt(sc.nextLine());

      if (valor % 2 == 0) {
      	par++;
      	System.out.println("El numero " + i + " es par.");
      } else {
      	impar++;
      	System.out.println("El numero " + i + " es impar.");
      }

      if (i == numNumeros) {
        System.out.println("Se han introducido " + par + " números pares y " + impar + " números impares.\nFin del programa.");
      }
    }
  }

}

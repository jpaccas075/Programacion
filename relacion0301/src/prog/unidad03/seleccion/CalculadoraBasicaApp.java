package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out
        .print("Introduce la operación a realizar (S para suma, R para resta, P para producto y D para división): ");
    char letraOperacion = sc.nextLine().charAt(0);
    System.out.print("Introduce el primer operando: ");
    double primerOperando = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el segundo operando: ");
    double segundoOperando = Double.parseDouble(sc.nextLine());

    switch (letraOperacion) {
    case 'S':
      System.out.println("El resultado de sumar " + primerOperando + " y " + segundoOperando + " es: "
          + (primerOperando + segundoOperando));
      break;
    case 'R':
      System.out.println("El resultado de restar " + primerOperando + " y " + segundoOperando + " es: "
          + (primerOperando - segundoOperando));
      break;
    case 'P':
      System.out.println("El resultado de multiplicar " + primerOperando + " por " + segundoOperando + " es: "
          + (primerOperando * segundoOperando));
      break;
    case 'D':
      System.out.println("El resultado de dividir " + primerOperando + " entre " + segundoOperando + " es: "
          + (primerOperando / segundoOperando));
      break;
    default:
      System.out.println("Se ha introducido una letra de operación incorrecta.");
    }

  }

}

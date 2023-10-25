import java.util.Scanner;

public class VentasComisionApp {
  public static final double COMISIONPORVENTA = 10.0 / 100.0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("CALCULADORA DE SALARIO");
    System.out.println("----------------------");
    System.out.print("Introduce el salario base: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la primera venta: ");
    double venta1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la segunda venta: ");
    double venta2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la tercera venta: ");
    double venta3 = Double.parseDouble(sc.nextLine());

    double sumaVentas = venta1 + venta2 + venta3;
    double salarioTotal = sumaVentas * COMISIONPORVENTA + base;

    System.out.println("Este mes tu salario asciende a " + salarioTotal + " euros.");

  }

}

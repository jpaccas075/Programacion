import java.util.Scanner;

public class Ejercicio19 {
  public static final double PI = 3.1416;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ÁREA Y LONGITUD DE LA CIRCUNFERENCIA");
    System.out.println("------------------------------------");
    System.out.print("Introduce el radio de la circunferencia; ");
    double radio = Double.parseDouble(sc.nextLine());

    double area = PI * (radio * radio);
    double longitud = 2 * PI * radio;

    System.out.println("Dado el radio " + radio + ", el área de la circunferencia es " + area + " y su longitud " + longitud);

  }

}

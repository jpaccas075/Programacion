import java.util.Scanner;

public class OperarDosNumerosApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(sc.nextLine());

    System.out.println("El valor de su suma es: " + (num1 + num2));
    System.out.println("La diferencia es: " + (num1 - num2));
    System.out.println("El producto es: " + (num1 * num2));
    System.out.println("Su división da como cociente: " + (num1 / num2));
    System.out.println("Su módulo es: " + (num1 % num2));

  }

}
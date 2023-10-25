import java.util.Scanner;

public class ConversorPesetasEurosApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double euros = 166.386;

    System.out.print("Introduce la cantidad de pesetas a convertir: ");
    double valorReal = Double.parseDouble(sc.nextLine());

    System.out.println("El equivalente es " + valorReal / euros + " euros.");
  }

}
import java.util.Scanner;

public class Ejercicio30 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    double numero = Double.parseDouble(sc.nextLine());

    boolean dosDigitos = ((numero >= 10) && (numero <= 99)) || ((numero <= -10) && (numero >= -99));

    System.out
        .println("\"True\" significa que tiene dos dígitos y \"False\" que solo tiene uno (o más de dos): " + dosDigitos);

  }

}

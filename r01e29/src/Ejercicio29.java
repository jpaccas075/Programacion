import java.util.Scanner;

public class Ejercicio29 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número cualquiera: ");
    double numero = Double.parseDouble(sc.nextLine());

    // Se acotan los valores comprendidos entre 20 y 30 (incluyendo 20 pero no 30).
    boolean valorAcotado = (numero >= 20) && (numero < 30);

    System.out.println("¿Está " + numero + " comprendido entre 20 y 29?: " + valorAcotado);

  }

}

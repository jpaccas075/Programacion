import java.util.Scanner;

public class Ejercicio24 {
public static final int SEGUNDOS_POR_MINUTO = 60;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("LLAMADA TELEFÓNICA");
    System.out.println("------------------");
    System.out.print("Duración de la llamada (en segundos): ");
    int duracion = Integer.parseInt(sc.nextLine());
    System.out.print("Coste por minuto: ");
    double costeMinuto = Double.parseDouble(sc.nextLine());
    System.out.print("Coste de establecimiento de la llamada: ");
    double costeEstablecimiento = Double.parseDouble(sc.nextLine());

    int minutos = duracion / SEGUNDOS_POR_MINUTO;
    double costeTotal = minutos * costeMinuto + costeEstablecimiento;

    System.out.println("Coste total de la llamada: " + costeTotal + " euros.");

  }

}

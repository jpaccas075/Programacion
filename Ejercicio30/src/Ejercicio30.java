import java.util.Scanner;

public class Ejercicio30 {
  public static final double ACELERACION_GRAVEDAD = 9.8;
  public static final double METROS_A_PIES = 3.28;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pedimos al usuario el dato que nos interesa para iniciar los cálculos
    System.out.println("EXAMEN DE JORGE PACHECO CASTRO. CALCULO DE LANZAMIENTO VERTICAL");
    System.out.print("Introduzca la velocidad inicial del objeto (en m/s): ");
    double velocidadInicial = Double.parseDouble(sc.nextLine());

    // Declaramos variables, su tipo y los cálculos que realiza el programa
    double tiempo = velocidadInicial / ACELERACION_GRAVEDAD;
    double altura = (velocidadInicial * tiempo) - (ACELERACION_GRAVEDAD * (tiempo * tiempo) / 2);
    double metrosPies = altura * METROS_A_PIES;

    // Datos que se muestran por pantalla (forzando la altura a mostrar un valor entero)
    System.out.println("La altura máxima en metros es de " + altura);
    System.out.println("Esta altura equivale a " + (int) metrosPies + " pies");
    System.out.println("El tiempo necesario es " + tiempo + " segundos");

    sc.close();
  }

}

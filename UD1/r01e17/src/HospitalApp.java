import java.util.Scanner;

public class HospitalApp {
  public static final double PORCENTAJE_GINECOLOGIA = 40.0 / 100.0;
  public static final double PORCENTAJE_TRAUMATOLOGIA = 35.0 / 100.0;
  public static final double PORCENTAJE_PEDIATRIA = 25.0 / 100.0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("REPARTO PRESUPUESTARIO HOSPITAL");
    System.out.println("-------------------------------");
    System.out.print("Introduce el presupuesto anual del hospital: ");
    double presupuesto = Double.parseDouble(sc.nextLine());

    double presupuestoGinecologia = presupuesto * PORCENTAJE_GINECOLOGIA;
    double presupuestoTraumatologia = presupuesto * PORCENTAJE_TRAUMATOLOGIA;
    double presupuestoPediatria = presupuesto * PORCENTAJE_PEDIATRIA;

    System.out.println("A Ginecología le corresponderían " + presupuestoGinecologia + " euros, a Traumatología "
        + presupuestoTraumatologia + " euros, y a Pediatría " + presupuestoPediatria + " euros.");
  }

}

import java.util.Scanner;

public class LecturaTecladoApp {
  public static void main(String[] args) {
    
    final double PORCENTAJEUNIDADES = 55.0 / 100.0;
    final double PORCENTAJEEXAMENFINAL = 30.0 / 100.0;
    final double PORCENTAJETRABAJO = 15.0 / 100.0;

    Scanner scan = new Scanner(System.in);

    System.out.println("CÁLCULO DE CALIFICACIONES");
    System.out.println("--------------------------");
    System.out.print("Introduce la calificacion del examen de la primera unidad: ");
    double calificacionUnidad1 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificacion del examen de la segunda unidad: ");
    double calificacionUnidad2 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificacion del examen de la tercera unidad: ");
    double calificacionUnidad3 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificacion del examen final del trimestre: ");
    double calificacionExamenFinal = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificacion del trabajo: ");
    double calificacionTrabajo = Double.parseDouble(scan.nextLine());
    
    double calificacionFinal = ((calificacionUnidad1 + calificacionUnidad2 + calificacionUnidad3) / 3) * PORCENTAJEUNIDADES
      + calificacionExamenFinal * PORCENTAJEEXAMENFINAL
      + calificacionTrabajo * PORCENTAJETRABAJO;

    System.out.println("La calificación final del trimestre es de " + calificacionFinal);
  }
}
  
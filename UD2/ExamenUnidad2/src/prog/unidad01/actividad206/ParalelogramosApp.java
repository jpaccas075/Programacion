package prog.unidad01.actividad206;

import java.util.Scanner;
import java.util.Random;
import es.iespablopicasso.programacion.bloque02.figuras.Paralelogramo;

public class ParalelogramosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Solicitamos los valores que nos interesan al usuario
    System.out.println("EXAMEN DE JORGE PACHECO CASTRO. PROPIEDADES DE LOS PARALELOGRAMOS");
    System.out.print("Introduzca la longitud de los lados horizontales: ");
    double ladoHorizontal = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el límite mínimo de los posibles valores de la longitud del lado vertical: ");
    double minimoVertical = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca ahora el límite maximo de los posibles valores de la longitud del lado vertical: ");
    double maximoVertical = Double.parseDouble(sc.nextLine());

    // Creamos el número aleatorio
    Random random = new Random();
    double longitudVertical = random.nextDouble() * (maximoVertical - minimoVertical) + minimoVertical;

    System.out.println("La longitud del lado vertical obtenida al azar es de: " + longitudVertical);

    // Creamos el paralelogramo (lo creo con el minimoVertical porque no sé hacerlo con el número aleatorio)
    Paralelogramo paralelogramo = new Paralelogramo(ladoHorizontal, minimoVertical);

    // Creo una cadena para seleccionar los valores dentro de ella
    String cadena = paralelogramo.getAreaPerimetro();
    System.out.println("El área del paralelogramo vale " + cadena + " y el perímetro vale " + cadena);

    // Se pide al usuario que introduzca el factor real para ampliar o reducir el paralelogramo
    System.out.print("Introduzca el factor real positivo por el que se quiere ampliar (mayor que 1) o reducir (menor que 1) el paralelogramo: ");
    double factorReal = Double.parseDouble(sc.nextLine());

    // Se escala
    paralelogramo.escala(factorReal);

    // Se muestran por pantalla los valores escalados
    System.out.println("Después del escalado, el área del paralelogramo vale ahora " + paralelogramo.getAreaPerimetro()
        + " y el perimetro " + paralelogramo.getAreaPerimetro());

  }

}

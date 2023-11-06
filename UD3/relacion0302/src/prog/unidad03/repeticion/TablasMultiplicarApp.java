package prog.unidad03.repeticion;

public class TablasMultiplicarApp {

  public static void main(String[] args) {

    System.out.println("TABLAS DE MULTIPLICAR");

    for (int i = 1; i <= 10; i++) {
      System.out.println("\nTabla del " + i);
      System.out.println("-----------");

      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }

    }

  }

}

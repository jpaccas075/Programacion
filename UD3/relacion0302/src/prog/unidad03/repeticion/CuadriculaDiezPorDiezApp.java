package prog.unidad03.repeticion;

public class CuadriculaDiezPorDiezApp {

  public static void main(String[] args) {

    System.out.println("NÚMEROS DEL 1 AL 100");
    for (int i = 1; i <= 100; i++) {
      System.out.print(i + "\t");
      if (i % 10 == 0) {
        System.out.print("\n");
      }

    }

  }

}

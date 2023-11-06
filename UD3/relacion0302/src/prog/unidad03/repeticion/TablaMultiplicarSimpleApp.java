package prog.unidad03.repeticion;

import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("TABLA DE MULTIPLICAR DE.....");

    System.out.print("¿De qué número entero quieres mostrar su tabla de multiplicar? ");
    int numeroAMultiplicar = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= 10; i++) {
      System.out.println(numeroAMultiplicar + " X " + i + " = " + (numeroAMultiplicar * i));
      
    }

  }

}

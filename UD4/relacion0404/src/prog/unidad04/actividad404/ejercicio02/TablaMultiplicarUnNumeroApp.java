package prog.unidad04.actividad404.ejercicio02;

import java.util.Scanner;

import prog.unidad04.actividad404.ejercicio01.TablaMultiplicar;

public class TablaMultiplicarUnNumeroApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número entero superior a cero para calcular su tabla de multiplicar: ");
    int numero = Integer.parseInt(sc.nextLine());
    TablaMultiplicar tabla = new TablaMultiplicar(numero);

    tabla.imprimeTabla();

  }

}

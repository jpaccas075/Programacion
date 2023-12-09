package prog.unidad04.actividad404.ejercicio06;

import java.util.Scanner;

import prog.unidad04.actividad404.ejercicio04.CalculadorMedia;

public class MediaSeriePositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    CalculadorMedia calculador = new CalculadorMedia(0);
    
    double numero = 0;
    int contadorNumeros = 0;
    
    do {
      try {
        System.out.print("Introduce un número entero (negativo para terminar): ");
        numero = Double.parseDouble(sc.nextLine());
        calculador.add(numero);
        contadorNumeros++;
      } catch (NumberFormatException e) {
        System.out.println("Lo que se ha introducido no es un número entero. Inténtalo de nuevo");
      }
        
    } while (numero >= 0);
    
    if (contadorNumeros == 1) {
      System.out.println("No se introdujo ningún número, por lo que no hay resultado");
    } else {
      System.out.println("La media de los números es " + calculador.getMedia());
    }

  }

}

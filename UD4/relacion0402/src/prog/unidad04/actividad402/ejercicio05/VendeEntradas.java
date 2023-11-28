package prog.unidad04.actividad402.ejercicio05;

import prog.unidad04.actividad402.ejercicio05.Zona;

import java.util.Scanner;

public class VendeEntradas {
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Se crean las zonas
    Zona platea = new Zona(150);
    Zona palco = new Zona(50);
    Zona atico = new Zona(100);
    
    int opcion = 0;
    
    do {
    	System.out.println("GESTIÓN DE ENTRADAS");
      System.out.println("-------------------");
      System.out.println("1.- Mostrar asientos libres por zona\n2.- Vender asientos\n3.- Salir del programa");
      System.out.print("Elija una opción (1, 2, 3): ");
      opcion = Integer.parseInt(sc.nextLine());
      
      switch (opcion) {
      case 1:
      	System.out.println("ASIENTOS LIBRES POR ZONA");
      	System.out.println("------------------------");
      	System.out.println("Zona Platea: " + platea.getEntradasPorVender());
      	System.out.println("Zona Palco: " + palco.getEntradasPorVender());
      	System.out.println("Zona Atico: " + atico.getEntradasPorVender());
      	break;
      case 2:
      	System.out.println("VENTA DE ENTRADAS");
      	System.out.println("-----------------");
      	System.out.print("Seleccione la zona en la que se localizan los asientos a vender (1 = Platea, 2 = Palco, 3 = Ático): ");
      	int seleccionZona = Integer.parseInt(sc.nextLine());
      	System.out.print("Introduzca el número de asientos a vender: ");
      	int entradas = Integer.parseInt(sc.nextLine());
      	
      		if (seleccionZona == 1) {
      			platea.vender(entradas);
      		} else if (seleccionZona == 2) {
      			palco.vender(entradas);
      		} else if (seleccionZona == 3) {
      			atico.vender(entradas);
      		}
      	break;
      case 3:
      	System.out.println("Saliendo del programa.....");
      }
    } while ((opcion == 1) || (opcion == 2));
    
  }

}

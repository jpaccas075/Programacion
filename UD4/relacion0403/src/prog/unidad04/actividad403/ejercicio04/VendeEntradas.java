package prog.unidad04.actividad403.ejercicio04;

import prog.unidad04.actividad403.ejercicio04.Zona;

import java.util.Scanner;

public class VendeEntradas {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Se crean zonas con valores correctos (salvo atico, que tiene un valor incorrecto)
    Zona platea = null;
    try {
      platea = new Zona(150);
    } catch (ZonaException e) {
      System.out.println("OK. Se ha impedido la creación de una zona ya que el número de entradas mínimo es menor a 1 (zona platea)");
    }
    Zona palco = null;
    try {
      palco = new Zona(50);
    } catch (ZonaException e) {
      System.out.println("OK. Se ha impedido la creación de una zona ya que el número de entradas mínimo es menor a 1 (zona palco)");
    }
    Zona atico = null;
    try {
      atico = new Zona(-1);
    } catch (ZonaException e) {
      System.out.println("OK. Se ha impedido la creación de una zona ya que el número de entradas mínimo es menor a 1 (zona ático)");
    }
    
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
        //System.out.println("Zona Atico: " + atico.getEntradasPorVender());
        break;
      case 2:
        System.out.println("VENTA DE ENTRADAS");
        System.out.println("-----------------");
        System.out.print("Seleccione la zona en la que se localizan los asientos a vender (1 = Platea, 2 = Palco, 3 = Ático): ");
        int seleccionZona = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el número de asientos a vender: ");
        int entradas = Integer.parseInt(sc.nextLine());
        
          if (seleccionZona == 1) {
            try {
              platea.vender(entradas);
            } catch (ZonaException e) {
              System.out.println("No se pudo realizar la venta de entradas ya que no hay entradas suficientes.");
            }
          } else if (seleccionZona == 2) {
            try {
              palco.vender(entradas);
            } catch (ZonaException e) {
              System.out.println("No se pudo realizar la venta de entradas ya que no hay entradas suficientes.");
            }
          } else if (seleccionZona == 3) {
            try {
              atico.vender(entradas);
            } catch (ZonaException e) {
              System.out.println("No se pudo realizar la venta de entradas ya que no hay entradas suficientes.");
            }
          }
        break;
      case 3:
        System.out.println("Saliendo del programa.....");
      }
    } while ((opcion == 1) || (opcion == 2));
    
  }

}

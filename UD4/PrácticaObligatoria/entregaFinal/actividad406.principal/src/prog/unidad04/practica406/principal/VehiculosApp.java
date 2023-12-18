package prog.unidad04.practica406.principal;

import java.time.LocalDate;
import java.util.Scanner;

import prog.unidad04.practica406.libreria.Automovil;
import prog.unidad04.practica406.libreria.Fecha;
import prog.unidad04.practica406.libreria.Motocicleta;
import prog.unidad04.practica406.libreria.Vehiculo;

public class VehiculosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Se inicializan los objetos a null para poder usarlos a lo largo del programa
		Fecha fechaMatriculaAuto = null;
		Fecha fechaMatriculaMoto = null;
		Automovil auto = null;
		Motocicleta moto = null;
		
		// Se inicializan las variables que se van a usar a lo largo del programa
		String matricula = "";
		int diaMatriculacion = 0;
    int mesMatriculacion = 0;
    int anyoMatriculacion = 0;
    int plazas = 0;
    String matriculaMoto = "";
    int diaMatriculacionMoto = 0;
    int mesMatriculacionMoto = 0;
    int anyoMatriculacionMoto = 0;
    int cilindrada = 0;
    boolean valorCorrecto = false;
    
		// Cabecera
		System.out.println("PRÁCTICA DE JORGE PACHECO CASTRO. GESTIÓN DE VEHÍCULOS");
		
		// CREACIÓN DEL AUTOMÓVIL
		// Ciclo que se encargará de que no puedan crearse objetos de la clase Automovil hasta que TODOS los valores sean correctos
		do {
		  // Aquí se vuelve a poner fecha a null para evitar que el programa continúe en el caso de que el valor que se guarde en una
		  // primera vuelta sea correcto y genere el objeto con esa fecha (independientemente de que la que se haya introducido en vueltas
		  // sucesivas no lo sea). En resumen, evita que se creen objetos con una fecha errónea
		  fechaMatriculaAuto = null;
		  
		  // Se solicita la información necesaria para la creación de un objeto de la clase Automovil
	    try {
	    	System.out.print("Introduce la matrícula del automóvil (4 números, 0 ó más espacios y tres letras mayúsculas): ");
		    matricula = sc.nextLine();
	    } catch (IllegalArgumentException e) {
	    	System.out.println("La matrícula no cumple la especificación");
	    }
	    
	    // Se comprueba que los valores de fecha sean los permitidos
	    try {
	      System.out.print("Introduzca el día de la fecha de matriculación del automóvil: ");
	      diaMatriculacion = Integer.parseInt(sc.nextLine());
	      System.out.print("Introduzca el mes de la fecha de matriculación del automóvil: ");
	      mesMatriculacion = Integer.parseInt(sc.nextLine());
	      System.out.print("Introduzca el año de la fecha de matriculación del automóvil: ");
	      anyoMatriculacion = Integer.parseInt(sc.nextLine());
	    } catch (IllegalArgumentException e) {
	      System.out.println("Los valores de fecha deben ser números enteros");
	    }
	      
	    // Se crea un objeto de la clase Fecha si los valores son correctos, en caso contrario se lanza una excepción
	    try {
	      fechaMatriculaAuto = new Fecha(diaMatriculacion, mesMatriculacion, anyoMatriculacion);
	    } catch (IllegalArgumentException e) {
	      System.out.println("La fecha no es una fecha válida. Revise los valores e inténtelo de nuevo");
	    }
	    
	    System.out.print("Introduzca el color del automóvil (blanco, negro o azul): ");
	    String color = sc.nextLine();
	    
	    // Se comprueba que el valor número de plazas sea el permitido (también lanza la excepción en el caso de quedar vacío)
	    try {
	      System.out.print("Introduzca el número de plazas del vehículo (1 ó mas): ");
	      plazas = Integer.parseInt(sc.nextLine());
	    } catch (NumberFormatException e) {
	      System.out.println("El valor número de plazas debe ser numérico");
	    }
	    
	    // Se crea un objeto de la clase Automovil si los valores son correctos, en caso contrario se lanza una excepción y se vuelve a empezar
	    try {
	      auto = new Automovil(matricula, fechaMatriculaAuto, color, plazas);
	      valorCorrecto = true;
	    } catch (IllegalArgumentException e) {
	      System.out.println("No se pudo crear el automóvil. Revise los datos para comprobar que todos son correctos");
	    }

		} while (!valorCorrecto);
		
		// CREACIÓN DE LA MOTOCICLETA
		// Se cambia el valor de la variable para repetir el proceso a la hora de crear el objeto de la clase Motocicleta
		valorCorrecto = false;
		
		do {
		  // Mismo caso que antes, la fecha pasa a ser null para evitar que se creen objetos con fecha incorrecta
		  fechaMatriculaMoto = null;
		  
		  // Se solicita la información necesaria para la creación de un objeto de la clase Motocicleta
	    try {
	    	System.out.print("Introduce la matrícula de la motocicleta (4 números, 0 ó más espacios y tres letras mayúsculas): ");
		    matriculaMoto = sc.nextLine();
	    } catch (IllegalArgumentException e) {
	    	System.out.println("La matrícula no cumple la especificación");
	    }
	    
	    // Se comprueba que los valores de fecha sean los permitidos
	    try {
	      System.out.print("Introduzca el día de la fecha de matriculación de la motocicleta: ");
        diaMatriculacionMoto = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el mes de la fecha de matriculación de la motocicleta: ");
        mesMatriculacionMoto = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el año de la fecha de matriculación de la motocicleta: ");
        anyoMatriculacionMoto = Integer.parseInt(sc.nextLine());
	    } catch (IllegalArgumentException e) {
	      System.out.println("Los valores de fecha deben ser números enteros");
	    }
	      
	    // Se crea un objeto de la clase Fecha si los valores son correctos, en caso contrario se lanza una excepción
	    try {
	      fechaMatriculaMoto = new Fecha(diaMatriculacionMoto, mesMatriculacionMoto, anyoMatriculacionMoto);
	      } catch (IllegalArgumentException e) {
	        System.out.println("La fecha no es una fecha válida. Revise los valores e inténtelo de nuevo");
	      }
	    
	    // Se comprueba que el valor de la cilindrada sea el permitido (también lanza la excepción en el caso de quedar vacío)
	    try {
	      System.out.print("Introduzca la cilindrada de la motocicleta (50 ó mas): ");
        cilindrada = Integer.parseInt(sc.nextLine());
	    } catch (NumberFormatException e) {
	      System.out.println("El valor de la cilindrada debe ser numérico");
	    }
	    
	    // Se crea un objeto de la clase Motocicleta si los valores son correctos, en caso contrario se lanza una excepción y se vuelve a empezar
	    try {
	      moto = new Motocicleta(matriculaMoto, fechaMatriculaMoto, cilindrada);
	      valorCorrecto = true;
	    } catch (IllegalArgumentException e) {
	      System.out.println("No se pudo crear la motocicleta. Revise los datos para comprobar que todos son correctos");
	    }
	    
		} while (!valorCorrecto);
		
		// IMPRESIÓN EN CONSOLA
		// Se imprimen los datos de los objetos a través de métodos estáticos que reciben a los mismos por parámetro
		System.out.println("Datos de Automóvil: " + convertibleAuto(auto));
    System.out.println("Datos de Motocicleta: " + convertibleMoto(moto));
    
    // Se obtiene la fecha actual utilizando la clase LocalDate
    LocalDate fechaActual = LocalDate.now();
    int diaActual = fechaActual.getDayOfMonth();
    int mesActual = fechaActual.getMonthValue();
    int anyoActual = fechaActual.getYear();
    
    // Se crea un nuevo objeto de la clase Fecha con los valores obtenidos en el paso anterior
    // para poder acceder a sus métodos
    Fecha diaDeHoy = new Fecha(diaActual, mesActual, anyoActual);
    
    // Se calculan los días transcurridos entre las fechas de matriculación y la actual y se imprimen
    System.out.println("El automóvil lleva matriculado " + fechaMatriculaAuto.diasEntre(diaDeHoy) + " dias");
    System.out.println("La motocicleta lleva matriculada " + fechaMatriculaMoto.diasEntre(diaDeHoy) + " dias");
    
    // Si alguno de los vehículos (o ambos) fueron matriculados en año bisiesto se mostrará por consola
    if(fechaMatriculaAuto.esBisiesto()) {
      System.out.println("El automóvil fue matriculado en un año bisiesto");
    }
    
    if(fechaMatriculaMoto.esBisiesto()) {
      System.out.println("La motocicleta fue matriculada en un año bisiesto");
    }
    
    // Se comparan las fechas de matriculación y se determina cual se matriculó antes (o si ambos se matricularon el mismo día)
    if(fechaMatriculaAuto.compara(fechaMatriculaMoto) == 0) {
      System.out.println("Ambos vehículos fueron matriculados el mismo día");
    } else if (fechaMatriculaAuto.compara(fechaMatriculaMoto) < 0) {
      System.out.println("El automóvil se matriculó antes que la motocicleta");
    } else if (fechaMatriculaAuto.compara(fechaMatriculaMoto) > 0) {
      System.out.println("La motocicleta se matriculó antes que el automóvil");
    }
    
    // Muestra el número de vehículos matriculados hasta el momento
    System.out.println("Número de vehículos matriculados: " + Vehiculo.getVehiculosMatriculados());
    
  }
  
	/**
	 * Método que recibe un objeto de la clase Automovil e imprime por pantalla sus datos
	 * @param auto - Objeto de la clase Automovil
	 * @return Cadena con información del objeto en formato texto
	 */
  public static String convertibleAuto(Automovil auto) {
    return (auto.aTexto());
  }
  
  /**
   * Método que recibe un objeto de la clase Motocicleta e imprime por pantalla sus datos
   * @param moto - Objeto de la clase Motocicleta
   * @return Cadena con información del objeto en formato texto
   */
  public static String convertibleMoto(Motocicleta moto) {
    return (moto.aTexto());
  }

}

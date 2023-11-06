package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("NOMBRES DE MES I Y II");
		System.out.print("Introduce un número entero del 1 al 12 y te diré que mes ocupa esa posición: ");
		String numeroMes = new String(sc.nextLine());

		switch (numeroMes) {
		case "1":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Enero.");
			break;
		case "2":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Febrero.");
			break;
		case "3":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Marzo.");
			break;
		case "4":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Abril.");
			break;
		case "5":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Mayo.");
			break;
		case "6":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Junio.");
			break;
		case "7":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Julio.");
			break;
		case "8":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Agosto.");
			break;
		case "9":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Septiembre.");
			break;
		case "10":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Octubre.");
			break;
		case "11":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Noviembre.");
			break;
		case "12":
			System.out.println("El mes con la posición " + numeroMes + " tiene el nombre Diciembre.");
			break;
		default:
			System.out.println("El número introducido no es correcto. Introduzca un número del 1 al 12.");
		}

	}

}

package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CIFRAS DE UN NÚMERO");
		System.out.print("Introduce un número entero y te diré cuantas cifras tiene: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		if ((numero >= 0) && (numero <= 9)) {
			System.out.println("El número " + numero + " tiene una cifra.");
		} else if ((numero >= 10) && (numero <= 99)) {
			System.out.println("El número " + numero + " tiene dos cifras.");
		} else if ((numero >= 100) && (numero <= 999)) {
			System.out.println("El número " + numero + " tiene tres cifras.");
		} else {
			System.out.println("El número " + numero + " tiene mas de tres cifras.");
		}

	}

}

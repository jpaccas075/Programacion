package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿PAR o IMPAR?");
		System.out.print("Introduce el número entero: ");
		int numero = Integer.parseInt(sc.nextLine());

		String parImpar = (numero % 2 == 0) ? "par" : "impar";
		System.out.println("El número " + numero + " es " + parImpar);

	}

}

package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosParesImparesEntreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int limiteInferior;
		int limiteSuperior;
		System.out.println("PARES O IMPARES EN UN INTERVALO");
		do {
			System.out.print("Introduce el número de comienzo del intervalo: ");
			limiteInferior = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el número de fin del intervalo: ");
			limiteSuperior = Integer.parseInt(sc.nextLine());
			if (limiteInferior > limiteSuperior) {
				System.out.println("Error. El número " + limiteInferior + " es mayor que " + limiteSuperior + ".");
			}
		} while (limiteInferior > limiteSuperior);

		// if (limiteInferior > limiteSuperior) {
		// System.out.println("El número de inicio es mayor que el del final.
		// Terminado");
		// } else {
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			String mensaje = (i % 2 == 0 ? "par" : "impar");
			System.out.println("El número " + i + " es " + mensaje);
		}
		// }

	}

}

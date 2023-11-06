package prog.unidad03.repeticion;

import java.util.Scanner;

public class FactoresPrimosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("CÁLCULO DE FACTORES PRIMOS");
		System.out.print("Introduce un número entero mayor que 1 para descomponerlo en factores primos: ");
		int cociente = Integer.parseInt(sc.nextLine());
		int divisor = 2;

		while (cociente > 1) {

			if (cociente % divisor == 0) {
				System.out.println(divisor + " es un factor primo");
				cociente = cociente / divisor;
			} else {
				divisor++;
			}
		}
	}
}
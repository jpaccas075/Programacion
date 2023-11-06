package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaImporteApp {
	public static final double DESCUENTO = 20.0 / 100.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("DESCUENTOS AL COMPRAR");
		System.out.print("Introduce el importe de la compra en euros: ");
		double importe = Double.parseDouble(sc.nextLine());

		double dto = importe * DESCUENTO;

		if (importe >= 100) {
			System.out.println(
					"Como la compra es superior a 100 euros, la compra tiene un descuento del 20%. El importe a pagar es de "
							+ (importe - dto));
		} else {
			System.out.println(
					"Como la compra es inferior a 100 euros, la compra no tiene descuento. El importe a pagar es de " + importe);
		}

	}

}

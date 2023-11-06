package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PROMOCIONA O NO PROMOCIONA");
		System.out.print("Introduce la calificación de Matemáticas: ");
		double notaMatematicas = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la calificación de Lengua: ");
		double notaLengua = Double.parseDouble(sc.nextLine());

		if (notaMatematicas >= 5 && notaLengua >= 5) {
			System.out.println("El alumno pasa sin pendientes.");
		} else if (notaMatematicas < 5 && notaLengua < 5) {
			System.out.println("El alumno repite.");
		} else {
			System.out.println("El alumno promociona con una asignatura pendiente.");
		}

	}

}

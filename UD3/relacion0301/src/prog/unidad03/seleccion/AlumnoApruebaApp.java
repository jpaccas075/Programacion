package prog.unidad03.seleccion;

import java.util.Scanner;

public class AlumnoApruebaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("APROBADOS Y SUSPENSOS");
		System.out.print("Introduce la calificación de la primera evaluación: ");
		double nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la calificación de la segunda evaluación: ");
		double nota2 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la calificación de la tercera evaluación: ");
		double nota3 = Double.parseDouble(sc.nextLine());
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 5) {
			System.out.println("El alumno ha aprobado con una media de " + media);
		} else {
			System.out.println("El alumno ha suspendido con una media de " + media);
		}

	}

}

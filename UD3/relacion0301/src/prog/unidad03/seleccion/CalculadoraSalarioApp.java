package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {
	
	// Declaramos las constantes
	public static final int HORA_NORMAL = 16;
	public static final int HORA_EXTRA = 20;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el dato que se necesita
		System.out.println("PROGRAMA CALCULADOR DE SALARIOS");
		System.out.print("Introduce las horas trabajadas esta semana: ");
		double horasTrabajadas = Double.parseDouble(sc.nextLine());

		// Equivalencia de horas
		double horasNormales = 40;
		double horasExtra = horasTrabajadas - 40;

		// Se muestran por pantalla los posibles resultados en función del valor introducido
		if (horasTrabajadas <= 40) {
			double salario = (horasTrabajadas * HORA_NORMAL);
			System.out.println("El salario por trabajar " + horasTrabajadas + " es: " + salario);
		} else {
			double salarioTotal = (horasNormales * HORA_NORMAL) + (horasExtra * HORA_EXTRA);
			System.out.println("El salario por trabajar " + horasNormales + " horas normales y " + horasExtra
					+ " horas extra es de " + salarioTotal);
		}

	}

}

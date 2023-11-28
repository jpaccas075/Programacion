package prog.unidad04.actividad402.ejercicio06;

import prog.unidad04.actividad402.ejercicio06.Punto;

/**
 * Clase que representa a un círculo
 */
public class Circulo {
	// Atributos constantes
	private static final double PI = 3.1415;
	
	// Atributos
	private double radio;
	private double area;
	private double perimetro;
	
	// Constructor
	/**
	 * Crea un círculo con el centro y radio dados
	 * @param centro - Punto que será el centro del círculo
	 * @param radio - Radio del círculo (debería ser mayor que cero)
	 */
	public Circulo(Punto centro, double radio) {
		this.radio = radio;
	}
	
	// Métodos
	/**
	 * Obtiene el área del círculo
	 * @return Area del círculo
	 */
	public double area() {
		this.area = PI*(radio*radio);
		return area;
	}
	
	/**
	 * Obtiene el perímetro (circunferencia) del círculo
	 * @return Perimetro del círculo
	 */
	public double perimetro() {
		this.perimetro = (2*PI)*radio;
		return perimetro;
	}

}

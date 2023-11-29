package prog.unidad04.actividad402.ejercicio06;

/**
 * Representa a un triángulo
 */
public class Triangulo {
	// Atributos
	private double lado1;
	private double lado2;
	private double lado3;
	private double area;
	private double perimetro;
	
	// Constructor
	/**
	 * Crea un triángulo a partir de los tres vértices (es importante que no formen parte de la misma línea)
	 * @param vertice1 - Primer vértice del triángulo
	 * @param vertice2 - Segundo vértice del triángulo
   * @param vertice3 - Tercer vértice del triángulo
	 */
	public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
	  this.lado1 = Math.sqrt(Math.pow(vertice2.getX() - vertice1.getX(), 2) + Math.pow(vertice2.getY() - vertice1.getY(), 2));
	  this.lado2 = Math.sqrt(Math.pow(vertice3.getX() - vertice2.getX(), 2) + Math.pow(vertice3.getY() - vertice2.getY(), 2));
	  this.lado3 = Math.sqrt(Math.pow(vertice1.getX() - vertice3.getX(), 2) + Math.pow(vertice1.getY() - vertice3.getY(), 2));
	}
	
	// Métodos
	/**
	 * Obtiene el área del triángulo
	 * @return Área del triángulo
	 */
	public double area() {
	  double semiperimetro = ((lado1 + lado2 + lado3) / 2);
	  this.area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
	  
	  return area;
	}
	
	/**
	 * Obtiene el perímetro del triángulo
	 * @return Perímetro del triángulo
	 */
	public double perimetro() {
	  this.perimetro = lado1 + lado2 + lado3;
	  
	  return perimetro;
	}
}

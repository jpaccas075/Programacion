package prog.unidad04.actividad403.ejercicio05;

import prog.unidad04.actividad403.ejercicio05.Punto;

/**
 * Clase que representa a un rectángulo
 */
public class Rectangulo {
  // Atributos
  private double base;
  private double altura;
  private double area;
  private double perimetro;
  private boolean esCuadrado;
  
  // Constructor
  /**
   * Crea un nuevo rectángulo a partir de dos esquinas opuestas del mismo
   * @param esquina1 - Punto de una esquina del rectángulo
   * @param esquina2 - Punto de la esquina opuesta del rectángulo
   */
  public Rectangulo(Punto esquina1, Punto esquina2) {
    this.base = Math.abs(esquina2.getX() - esquina1.getX());
    this.altura = Math.abs(esquina2.getY() - esquina1.getY());
  }
  
  // Métodos
  /**
   * Obtiene el área del rectángulo
   * @return Área del rectángulo
   */
  public double area() {
    this.area = base * altura;
    return area;
  }
  
  /**
   * Obtiene el perímetro del rectángulo
   * @return Perímetro del rectángulo
   */
  public double perimetro() {
    this.perimetro = (2 * altura) + (2 * base);
    return perimetro;
  }
  
  /**
   * Determina si el rectángulo es realmente un cuadrado
   * @return true si el rectángulo es un cuadrado (tiene los cuatro lados iguales) o false si no.
   */
  public boolean esCuadrado() {
    if (base == altura) {
      this.esCuadrado = true;
    } else {
      this.esCuadrado = false;
    }
    return esCuadrado;
  }
  
}

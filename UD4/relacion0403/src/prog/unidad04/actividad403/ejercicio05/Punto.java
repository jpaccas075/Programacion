package prog.unidad04.actividad403.ejercicio05;

/**
 * Representa un punto del plano
 */
public class Punto {
  // Atributos
  private double x;
  private double y;
  
  // Constructor
  /**
   * Constructor
   * @param x - Coordenada X del punto
   * @param y - Coordenada Y del punto
   */
  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

//Métodos
  /**
   * Obtiene la coordenada X del punto
   * @return Coordenada X del punto
   */
  public double getX() {
    return x;
  }

  /**
   * Obtiene la coordenada Y del punto
   * @return Coordenada Y del punto
   */
  public double getY() {
    return y;
  }
}

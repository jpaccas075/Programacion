package prog.unidad04.actividad404.ejercicio04;

/**
 * Esta clase calcula la media de una serie de números
 */
public class CalculadorMedia {
  private double valorInicial;
  private int numNumeros = 0;
  
  /**
   * Construye el objeto con el primer valor de la serie
   * @param valorInicial - Primer valor de la serie (y de la media)
   */
  public CalculadorMedia(double valorInicial) {
    this.valorInicial = valorInicial;
  }
  
  /**
   * Añade un nuevo número a la serie
   * @param numero - Nuevo número a añadir a la serie
   */
  public void add(double numero) {
    if (numero < 0) {
      numNumeros = numNumeros;
    } else {
      valorInicial += numero;
      numNumeros++;
    }
    
  }
  
  /**
   * Obtiene el valor actual de la media, correspondiente a la media de los números añadidos hasta el momento.
   * @return Valor actual de la media
   */
  public double getMedia() {
    return valorInicial / numNumeros;
  }

}

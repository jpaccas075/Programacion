package prog.unidad04.actividad404.ejercicio07;

/**
 * Permite calcular el mayor y menor de una serie de números enteros
 */
public class MayorMenor {
  private int numero;
  private int mayor;
  private int menor;
  
  /**
   * Construye un nuevo objeto con el primer número de la serie
   * @param numero - Primer número de la serie
   */
  public MayorMenor (int numero) {
    this.numero = numero;
    this.mayor = numero;
    this.menor = numero;
  }
  
  /**
   * Añade un número a la serie
   * @param numero - Nuevo número a añadir a la serie
   */
  public void add(int numero) {
    if (numero < 0) {
      numero = this.menor;
    }
    
    if (this.menor > numero) {
      this.menor = numero;
    }
    
    if (this.mayor < numero) {
      this.mayor = numero;
    }
  }
  
  /**
   * Obtiene el mayor número visto en la serie hasta el momento
   * @return Mayor número visto hasta el momento
   */
  public int getMayor() {
    return this.mayor;
  }
  
  /**
   * Obtiene el menor número visto en la serie hasta el momento
   * @return Menor número visto hasta el momento
   */
  public int getMenor() {
    return this.menor;
  }

}

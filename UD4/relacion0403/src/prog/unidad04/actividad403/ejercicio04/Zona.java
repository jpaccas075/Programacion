package prog.unidad04.actividad403.ejercicio04;

/**
 * Zona de asientos en un teatro
 */
public class Zona {
  // Atributos
  private int entradas;
  
  // Constructor
  /**
   * Crea una zona con el número de entradas por vender especificado
   * @param entradasIniciales - Número inicial de entradas por vender. Debe ser superior a cero
   * @throws ZonaException - Si el número inicial de entradas es inferior a 1
   */
  public Zona(int entradas) throws ZonaException {
    this.entradas = entradas;
    
    if (this.entradas < 1) {
      throw new ZonaException();
    }
  }
  
  // Métodos
  /**
   * Obtiene el número de entradas por vender
   * @return Número de entradas por vender en la zona
   */
  public int getEntradasPorVender() {
    return entradas;
  }
  
  /**
   * Intenta vender el número de entradas indicado, si es que quedan suficientes
   * @param entradas - Número de entradas a vender
   * @throws ZonaException - Si no hay suficientes entradas para satisfacer la venta
   */
  public int vender(int entradas) throws ZonaException {
    if (entradas > this.entradas) {
      throw new ZonaException();
    } else {
      System.out.println("Venta realizada correctamente.");
      this.entradas -= entradas;
    }
    return entradas;
  }
}

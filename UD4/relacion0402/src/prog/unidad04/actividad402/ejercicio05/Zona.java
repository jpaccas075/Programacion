package prog.unidad04.actividad402.ejercicio05;

/**
 * Zona de asientos en un teatro
 */
public class Zona {
  // Atributos
  private int entradas;
  
  // Constructor
  /**
   * Crea una zona con el número de entradas por vender especificado
   * @param entradasIniciales - Número inicial de entradas por vender
   */
  public Zona(int entradas) {
    this.entradas = entradas;
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
   * Intenta vender el número de entradas indicado. Si no hay suficientes entradas para satisfacer la venta, esta no se realiza
   * @param entradas - Número de entradas a vender
   * @return Número de entradas vendidas. Será igual al número de entradas solicitadas si se pudo hacer la venta o 0 si no se pudo realizar ésta
   */
  public int vender(int entradas) {
  	if (entradas > this.entradas) {
  		System.out.println("No se pudo realizar la venta de entradas. Probablemente no haya entradas suficientes en la zona elegida\n");
  		return 0;
  	} else {
  		System.out.println("Venta realizada correctamente.");
  		this.entradas -= entradas;
  	}
  	return entradas;
  }
}

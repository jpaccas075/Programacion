package prog.unidad04.actividad403.ejercicio06;

import java.util.Random;

/**
 * Representa una tarjeta de regalo de Manego
 */
public class TarjetaRegalo {
  // Atributos
  private double saldo;
  private int numID;
  
  // Constructor
  /**
   * Crea una nueva tarjeta con el saldo indicado y un nuevo número identificativo
   * @param saldo - Saldo de la nueva tarjeta. Debe ser positivo o cero
   * @throws IllegalArgumentException - Si el saldo especificado no es positivo
   */
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.generarNumID();
    
    if (this.saldo < 0) {
      throw new IllegalArgumentException();
    }
  }
  
  // Métodos
  /**
   * Gasta la cantidad indicada de la tarjeta regalo, si es que hay saldo suficiente
   * @param cantidad - Cantidad a gastar
   * @throws InsufficientFundsException - Si la cantidad especificada es superior al saldo
   */
  public void gasta(double cantidad) {
    if (saldo >= cantidad) {
      saldo -= cantidad;
    } else {
      throw new InsufficientFundsException();
    }
  }
  
  /**
   * Crea una nueva tarjeta regalo fusionando dos existentes.
   * Las tarjetas existentes se quedan a saldo cero.
   * @param otra - Otra tarjeta a fusionar con ésta
   * @return Nueva tarjeta cuyo saldo es la suma del de las dos tarjetas
   */
  public TarjetaRegalo fusionaCon(TarjetaRegalo otra) {
    TarjetaRegalo tarjetaNueva = new TarjetaRegalo(saldo + otra.saldo);
    saldo = 0;
    otra.saldo = 0;
    
    return tarjetaNueva;
  }
  
  /**
   * Obtiene una representación imprimible del contenido de la tarjeta en formato
   * Tarjeta nº NNNNN - Saldo DDDDD€
   * donde NNNNNN es el número identificativo de la tarjeta y DDDD el saldo
   * @return Representación imprimible de la tarjeta
   */
  public String obtenerCadena() {
    String obtenerCadena = ("Tarjeta nº " + numID + " - Saldo " + saldo + "€"); 
    return obtenerCadena;
  }
  
  // Método privado para generar el número identificativo de las tarjetas
  private int generarNumID() {
    Random generador = new Random();
    numID = generador.nextInt(00000, 99999);
    
    return numID;
  }

}

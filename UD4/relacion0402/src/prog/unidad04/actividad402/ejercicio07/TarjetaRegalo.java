package prog.unidad04.actividad402.ejercicio07;

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
   * @param saldo - Saldo de la nueva tarjeta
   */
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.generarNumID();
  }
  
  // Métodos
  /**
   * Gasta la cantidad indicada de la tarjeta regalo, si es que hay saldo suficiente
   * Si no hay saldo suficiente se muestra un error y no se hace nada.
   * @param cantidad - Cantidad a gastar
   */
  public void gasta(double cantidad) {
    if (saldo >= cantidad) {
      saldo -= cantidad;
    } else {
      System.out.println("Error. No se puede gastar ese importe porque la tarjeta tiene un saldo inferior");
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

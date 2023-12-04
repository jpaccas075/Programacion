package prog.unidad04.actividad403.ejercicio07;

import prog.unidad04.actividad403.ejercicio07.IntervaloTiempo;

/**
 * Representa un intervalo de tiempo en horas, minutos y segundos
 */
public class IntervaloTiempo {
  // Atributos
  private int horas;
  private int minutos;
  private int segundos;

  // Constructor
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    this.segundos = segundos;
    this.minutos = minutos;
    this.horas = horas;
    
    if ((this.segundos < 0) || (this.segundos > 59)) {
      throw new IllegalArgumentException();
    }
    if ((this.minutos < 0) || (this.minutos > 59)) {
      throw new IllegalArgumentException();
    }
  }

  // Métodos
  public IntervaloTiempo suma(IntervaloTiempo otro) {
    int segundos = this.segundos + otro.segundos;
    int minutos = this.minutos + otro.minutos;
    int horas = this.horas + otro.horas;
    return new IntervaloTiempo(horas, minutos, segundos);
  }

  public IntervaloTiempo resta(IntervaloTiempo otro) throws IntervaloTiempoException {
    int segundos = this.segundos - otro.segundos;
    int minutos = 0;
    if (segundos < 0) {
      segundos += 60;
      minutos = 1;
    }
    minutos = this.minutos - otro.minutos - minutos;
    int horas = 0;
    if (minutos < 0) {
      minutos += 60;
      horas = 1;
    }
    horas = this.horas - otro.horas - horas;
    if (horas >= 0) {
      return new IntervaloTiempo(horas, minutos, segundos);
    } else {
      throw new IntervaloTiempoException();
    }

  }

  public String obtenerCadena() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }

}

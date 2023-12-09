package prog.unidad04.actividad404.ejercicio01;

/**
 * Clase que representa la tabla de multiplicar de un número entero determinado
 */
public class TablaMultiplicar {

  private int numero;
  
  /**
   * Crea la tabla de multiplicar del número dado
   * @param numero - Número de la tabla de multiplicar (tabla del ....). Debe ser mayor que cero
   * @throws IllegalArgumentException - Si el número proporcionado es menor o igual a cero
   */
  public TablaMultiplicar(int numero) {
    this.numero = numero;
    
    if (numero <= 0) {
      throw new IllegalArgumentException();
    }
  }
  
  /**
   * Imprime la tabla por consola La tabla se imprime en 10 líneas del formato "N x M = R", donde N es el número dado en constructor, M es un número que va cambiando de 1 a 10 y R es el resultado de multiplicar N por M
   */
  public void imprimeTabla() {
    System.out.println("TABLA DE MULTIPLICAR DEL " + this.numero);
      for (int i = 1;i <= 10;i++) {
        System.out.println(this.numero + " x " + i + " = " + (this.numero * i));
      }
  }
}

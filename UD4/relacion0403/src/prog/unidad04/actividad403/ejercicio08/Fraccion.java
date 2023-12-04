package prog.unidad04.actividad403.ejercicio08;

import prog.unidad04.actividad403.ejercicio08.Fraccion;

/**
 * Clase que representa un numero racional (fracción)
 */
public class Fraccion {
  // Atributos
  private int numerador;
  private int denominador;

  // Constructor
  /**
   * Crea una nueva fracción con el numerador y denominador dados
   * 
   * @param numerador   - Numerador de la nueva fracción
   * @param denominador - Denominador de la nueva fracción (no puede ser cero)
   * @throws IllegalArgumentException - Si se intenta proporcionar un denominador con valor cero
   */
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    
    if (this.denominador == 0) {
      throw new IllegalArgumentException();
    }
  }

  // Métodos
  /**
   * Obtiene el valor del numerador
   * 
   * @return Valor del numerador
   */
  public int getNumerador() {
    return numerador;
  }

  /**
   * Obtiene el valor del denominador
   * 
   * @return Valor del denominador
   */
  public int getDenominador() {
    return denominador;
  }

  /**
   * Obtiene una cadena con la representación de la fracción en la forma numerador
   * / denominador
   * 
   * @return Representacion en cadena de la fraccion
   */
  public String obtieneString() {
    return numerador + " / " + denominador;
  }

  /**
   * Suma a esta fracción la fracción proporcionada. El resultado no estará
   * simplificado
   * 
   * @param otra - Fracción que vamos a sumar a ésta
   * @return Nueva fracción con el resultado de la suma
   */
  public Fraccion suma(Fraccion otra) {

    if (denominador == otra.denominador) {
      return new Fraccion(numerador + otra.numerador, denominador);
    } else {
      int num = (this.numerador * otra.denominador) + (this.denominador * otra.numerador);
      int denom = this.denominador * otra.denominador;

      return new Fraccion(num, denom);
    }

  }

  /**
   * Resta a esta fracción la otra fracción proporcionada. El resultado no estará
   * simplificado
   * 
   * @param otra - Fracción que vamos a restar de esta
   * @return Nueva fracción con el resultado de la resta
   */
  public Fraccion resta(Fraccion otra) {

    if (denominador == otra.denominador) {
      return new Fraccion(numerador - otra.numerador, denominador);
    } else {
      int num = (this.numerador * otra.denominador) - (this.denominador * otra.numerador);
      int denom = this.denominador * otra.denominador;

      return new Fraccion(num, denom);
    }

  }

  /**
   * Multiplica esta fracción por la otra que se proporciona. El resultado no se
   * simplifica
   * 
   * @param otra - Otra fracción a multiplicar con ésta
   * @return Nueva fracción con el resultado de la multiplicación
   */
  public Fraccion multiplica(Fraccion otra) {
    int num = (this.numerador * otra.numerador);
    int denom = (this.denominador * otra.denominador);

    return new Fraccion(num, denom);
  }

  /**
   * Divide esta fracción por la otra que se proporciona. El resultado no se
   * simplifica
   * 
   * @param otra - Otra fracción que dividirá a ésta
   * @return Nueva fracción con el resultado de la división
   */
  public Fraccion divide(Fraccion otra) {
    int num = (this.numerador * otra.denominador);
    int denom = (this.denominador * otra.numerador);

    return new Fraccion(num, denom);
  }

  /**
   * Simplifica la fracción. Al terminar la fracción estará reducida a su forma
   * canónica
   */
  public void simplifica() {
    int n = mcd(); // se calcula el mcd de la fracción
    numerador = numerador / n;
    denominador = denominador / n;
  }

  //Cálculo del máximo común divisor por el algoritmo de Euclides                                               
  private int mcd() {
    int u = Math.abs(numerador); // valor absoluto del numerador
    int v = Math.abs(denominador); // valor absoluto del denominador
    if (v == 0) {
      return u;
    }
    int r;
    while (v != 0) {
      r = u % v;
      u = v;
      v = r;
    }
    return u;
  }
}

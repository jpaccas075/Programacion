package prog.unidad04.actividad403.ejercicio03;

/**
 * Clase que representa una lavadora
 */
public class Lavadora {
  // Atributos constantes
  public static final String COLOR_AZUL = "azul";
  public static final String COLOR_BLANCO = "blanco";
  public static final String COLOR_GRIS = "gris";
  public static final String COLOR_NEGRO = "negro";
  public static final String COLOR_ROJO = "rojo";

  // Atributos
  private double precioBase;
  private double precioFinal;
  private String color;
  private char consumoEnergetico;
  private double peso;
  private double carga;

  // Constructores
  /**
   * Constructor por defecto. Usa los valores por defecto: precioBase = 200 color = "blanco" consumoEnergetico = 'F' peso = 15 carga = 5
   */
  public Lavadora() {
    precioBase = 200;
    color = COLOR_BLANCO;
    consumoEnergetico = 'F';
    peso = 15;
    carga = 5;
  }

  /**
   * Constructor con precio y peso Para el resto usa los valores por defecto:
   * color = "blanco" consumoEnergetico = 'F' carga = 5
   * 
   * @param precioBase - Precio base de la nueva lavadora. Debe ser positivo
   * @param peso - Peso de la nueva lavadora. Debe ser mayor que cero
   * @throws IllegalArgumentException - si alguno de los parámetros no es válido
   */
  public Lavadora(double precioBase, double peso) {
    this();

    if (precioBase < 0) {
      throw new IllegalArgumentException();
    } else {
      this.precioBase = precioBase;
    }

    if (peso < 0) {
    	throw new IllegalArgumentException();
    } else {
      this.peso = peso;
    }
  }

  /**
   * Constructor con todos los valores
   * 
   * @param precioBase - Precio base. Debe ser positivo
   * @param color - Color. Debe ser uno de "blanco", "negro", "azul", "rojo", "gris"
   * @param consumoEnergetico - Consumo energético. Debe ser una letra entre la 'A' y la 'F', ambas incluidas y en mayúsculas
   * @param peso - Peso. Debe ser mayor de cero
   * @param carga - Carga máxima de la lavadora. Debe ser mayor de cero
   */
  public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
    this(precioBase, peso);
    this.comprobarConsumo(consumoEnergetico);
    this.comprobarColor(color);

    // Si el color no es correcto, se muestra error
    // if (!(color.equals(COLOR_BLANCO)) && !(color.equals(COLOR_NEGRO)) &&
    // !(color.equals(COLOR_AZUL)) && !(color.equals(COLOR_ROJO)) &&
    // !(color.equals(COLOR_GRIS))) {
    // System.out.println("Error. El color debería ser uno de \"blanco\", \"negro\",
    // \"azul\", \"rojo\", \"gris\"");
    // } else {
    // this.color = color;
    // }

    // Si el consumo energético es correcto, se mantiene, si no muestra error
    // if ((consumoEnergetico == 'A') || (consumoEnergetico == 'B') ||
    // (consumoEnergetico == 'C') || (consumoEnergetico == 'D') ||
    // (consumoEnergetico == 'E') || (consumoEnergetico == 'F')) {
    // this.consumoEnergetico = consumoEnergetico;
    // } else {
    // System.out.println("Error. El consumo debería ser una entre la 'A' y la
    // 'F'");
    // }

    // Si la carga es mayor que 0, es correcto, si no lanza una excepción
    if (carga > 0) {
      this.carga = carga;
    } else {
      throw new IllegalArgumentException();
    }
  }

  // Métodos
  /**
   * Obtiene el precio base de la lavadora
   * 
   * @return Precio base de la lavadora
   */
  public double getPrecioBase() {
    return precioBase;
  }

  /**
   * Obtiene el color de la lavadora
   * 
   * @return color de la lavadora
   */
  public String getColor() {
    return color;
  }

  /**
   * Obtiene el consumo energético de la lavadora
   * 
   * @return Consumo energético de la lavadora
   */
  public char getConsumoEnergetico() {
    return consumoEnergetico;
  }

  /**
   * Obtiene el peso de la lavadora
   * 
   * @return Peso de la lavadora
   */
  public double getPeso() {
    return peso;
  }

  /**
   * Obtiene la carga máxima de la lavadora
   * 
   * @return Carga máxima de la lavadora
   */
  public double getCarga() {
    return carga;
  }

  /**
   * Obtiene el precio final de la lavadora. El precio final se obtiene sumando al
   * precio base un plus según el consumo energético, el peso y la carga máxima
   * 
   * @return Precio final de la lavadora
   */
  public double getPrecioFinal() {
    precioFinal = precioBase;

    // Plus por consumo
    if (consumoEnergetico == 'A') {
      precioFinal += 100;
    } else if (consumoEnergetico == 'B') {
      precioFinal += 80;
    } else if (consumoEnergetico == 'C') {
      precioFinal += 60;
    } else if (consumoEnergetico == 'D') {
      precioFinal += 50;
    } else if (consumoEnergetico == 'E') {
      precioFinal += 30;
    } else if (consumoEnergetico == 'F') {
      precioFinal += 10;
    }

    // Plus por peso
    if (peso < 20) {
      precioFinal += 10;
    } else if ((peso >= 20) && (peso <= 49)) {
      precioFinal += 50;
    } else if ((peso >= 50) && (peso <= 79)) {
      precioFinal += 80;
    } else {
      precioFinal += 100;
    }

    // Plus por carga
    if (carga > 30) {
      precioFinal += 50;
    }

    return precioFinal;
  }

  // Métodos privados
  // Comprobar consumo: Devuelve la misma letra de entrada, si esta es correcta o
  // lanza una excepción si no lo es.
  private char comprobarConsumo(char consumoEnergetico) {

    if ((consumoEnergetico == 'A') || (consumoEnergetico == 'B') || (consumoEnergetico == 'C')
        || (consumoEnergetico == 'D') || (consumoEnergetico == 'E') || (consumoEnergetico == 'F')) {
      this.consumoEnergetico = consumoEnergetico;
    } else {
      throw new IllegalArgumentException();
    }

    return this.consumoEnergetico;
  }

  // Comprobar color: Devuelve el mismo color de entrada, si es correcto o lanza
  // una excepción si no lo es.
  private String comprobarColor(String color) {
    
    if (!(color.equals(COLOR_BLANCO)) && !(color.equals(COLOR_NEGRO)) && !(color.equals(COLOR_AZUL))
        && !(color.equals(COLOR_ROJO)) && !(color.equals(COLOR_GRIS))) {
    	throw new IllegalArgumentException();
    } else {
      this.color = color;
    }

    return this.color;
  }
}

package prog.unidad04.actividad403.ejercicio01;

/**
 * Clase que representa a una pizza
 */
public class Pizza {

  // Atributos constantes
  /**
   * Estado pedida
   */
  public static final String ESTADO_PEDIDA = "pedida";
  /**
   * Estado servida
   */
  public static final String ESTADO_SERVIDA = "servida";
  /**
   * Tamaño familiar
   */
  public static final String TAMANYO_FAMILIAR = "familiar";
  /**
   * Tamaño mediana
   */
  public static final String TAMANYO_MEDIANA = "mediana";
  /**
   * Tipo cuatro quesos
   */
  public static final String TIPO_CUATRO_QUESOS = "cuatro quesos";
  /**
   * Tipo margarita
   */
  public static final String TIPO_MARGARITA = "margarita";
  /**
   * Tipo funghi
   */
  public static final String TIPO_FUNGHI = "funghi";

  // Atributos (primero de clase, después de instancia)
  private static int pizzasCreadas = 0;
  private static int pizzasServidas = 0;
  private String estado = ESTADO_PEDIDA;
  private String tamanyo;
  private String tipo;
  private double coste = 0;

  /**
   * Constructor. Lanza excepción cuando el tamaño o el tipo no es uno de los permitidos
   * 
   * @param tamanyo - Tamaño de la pizza. Debe ser "mediana" o "familiar"
   * @param tipo    - Tipo de la pizza. Debe ser uno de "margarita", "cuatro
   *                quesos" o "funghi"
   * @throws IllegalArgumentException - Si el tamaño o el tipo no es uno de los permitidos
   */
  public Pizza(String tamanyo, String tipo) {
    this.tamanyo = tamanyo;
    this.tipo = tipo;

    // Suponiendo que los parámetros sean correctos
    boolean bParametrosOK = true;

    // Si el tamaño no es correcto, lanza excepción
    if (!tamanyo.equals("mediana") && !tamanyo.equals("familiar")) {
      throw new IllegalArgumentException();
    }

    // Si el tipo no es correcto, lanza excepción
    if (!tipo.equals("cuatro quesos") && !tipo.equals("margarita") && !tipo.equals("funghi")) {
      throw new IllegalArgumentException();
    }

    if (bParametrosOK) {
      pizzasCreadas++;
    }

  }

  // Métodos
  /**
   * Obtiene el estado de la pizza
   * 
   * @return Estado de la pizza. Puede ser uno de pedida o servida
   */
  public String getEstado() {
    return estado;
  }

  /**
   * Obtiene el tamaño de la pizza
   * 
   * @return Tamaño de la pizza. Puede ser uno de mediana o familiar
   */
  public String getTamanyo() {
    return tamanyo;
  }

  /**
   * Obtiene el tipo de la pizza
   * 
   * @return Tipo de la pizza. Puede ser uno de margarita, cuatro quesos o funghi
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * Obtiene el número de pizzas creadas hasta el momento
   * 
   * @return Número de pizzas creadas hasta el momento
   */
  public static int getPizzasCreadas() {
    return pizzasCreadas;
  }

  /**
   * Obtiene el número de pizzas servidas hasta el momento
   * 
   * @return Número de pizzas servidas hasta el momento
   */
  public static int getPizzasServidas() {
    return pizzasServidas;
  }

  /**
   * Sirve la pizza.
   * @throws PizzaAlreadyServedException Si la pizza ya está servida
   */
  public void sirve() throws PizzaAlreadyServedException {
    if (estado.equals(ESTADO_SERVIDA)) {
      throw new PizzaAlreadyServedException();
    } else {
      estado = ESTADO_SERVIDA;
      pizzasServidas++;
    }
  }

  /**
   * Devuelve el coste de la pizza según el tamaño y tipo
   * 
   * @return Coste de la pizza según tamaño y tipo
   */
  public double coste() {
    if (tamanyo.equals(TAMANYO_MEDIANA)) {
      coste = 5;
    }

    if (tamanyo.equals(TAMANYO_FAMILIAR)) {
      coste = 7.5;
    }

    if (tipo.equals(TIPO_MARGARITA)) {
      coste += 2;
    }

    if (tipo.equals(TIPO_CUATRO_QUESOS)) {
      coste += 4;
    }

    if (tipo.equals(TIPO_FUNGHI)) {
      coste += 3;
    }

    return coste;
  }
}

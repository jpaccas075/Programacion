package prog.unidad04.actividad402.ejercicio01;

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

  /**
   * Constructor. Imprime error si alguno de los parámetros no son correctos
   * 
   * @param tamanyo - Tamaño de la pizza. Debe ser "mediana" o "familiar"
   * @param tipo    - Tipo de la pizza. Debe ser uno de "margarita", "cuatro
   *                quesos" o "funghi"
   */
  public Pizza(String tamanyo, String tipo) {
    this.tamanyo = tamanyo;
    this.tipo = tipo;

    // Suponiendo que los parámetros sean correctos
    boolean bParametrosOK = true;

    // Si el tamaño no es correcto, se muestra error
    if (!tamanyo.equals("mediana") && !tamanyo.equals("familiar")) {
      System.out.println("El parámetro tamanyo no es correcto. Debe ser uno de \"mediana\" o \"familiar\"");
      bParametrosOK = false;
    }

    // Si el tipo no es correcto, se muestra error
    if (!tipo.equals("cuatro quesos") && !tipo.equals("margarita") && !tipo.equals("funghi")) {
      System.out
          .println("El parámetro tipo no es correcto. Debe ser uno de \"margarita\", \"cuatro quesos\" o \"funghi\"");
      bParametrosOK = false;
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
   * Sirve la pizza. Imprime error si la pizza ya está servida
   */
  public void sirve() {
    if (estado.equals(ESTADO_SERVIDA)) {
      System.out.println("Error. Esta pizza ya se ha servido");
    } else {
      estado = ESTADO_SERVIDA;
      pizzasServidas++;
    }
  }
}

package prog.unidad04.practica406.libreria;

/**
 * Clase que representa un automovil. Es un vehiculo de cuatro ruedas con un
 * color y un número de plazas
 */
public class Automovil extends Vehiculo implements ConvertibleATexto {

  // Atributos estáticos (Constantes)
  /**
   * Color azul
   */
  public static final String COLOR_AZUL = "azul";

  /**
   * Color blanco
   */
  public static final String COLOR_BLANCO = "blanco";

  /**
   * Color negro
   */
  public static final String COLOR_NEGRO = "negro";

  // Atributos de instancia
  /**
   * Color del coche
   */
  protected String color;

  /**
   * Plazas del coche
   */
  protected int plazas;

  /**
   * Constructor
   * 
   * @param matricula          - Matrícula del vehiculo. Debe tener un formato
   *                           válido NNNN AAA donde NNNN son 4 dígitos y AAA son
   *                           tres letras MAYÚSCULAS. Entre ellas puede haber
   *                           cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion - Fecha de matriculación del vehiculo. No puede ser
   *                           null
   * @param color              - Color del vehículo. Sólo se permite uno de
   *                           COLOR_BLANCO, COLOR_NEGRO, COLOR_AZUL
   * @param plazas             - Número de plazas del vehiculo. Debe ser mayor que
   *                           0 (por lo menos tiene que tener una para el
   *                           conductor
   * @throws IllegalArgumentException - Si alguno de los parámetros no es válido
   */
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) {
    super(matricula, fechaMatriculacion);

    // Si el color es null, se lanza excepción
    if (color == null) {
      throw new IllegalArgumentException();
    }

    // Si el color es correcto, se guarda el valor, si no lo es se lanza excepción
    if (color.equals(COLOR_AZUL) || color.equals(COLOR_BLANCO) || color.equals(COLOR_NEGRO)) {
      this.color = color;
    } else {
      throw new IllegalArgumentException();
    }

    // Si el número de plazas es mayor que cero, se guarda el valor, si no lo es se
    // lanza excepción
    if (plazas > 0) {
      this.plazas = plazas;
    } else {
      throw new IllegalArgumentException();
    }

    // Si la fecha de matriculación del vehículo es correcta, se sumará 1 al número
    // de vehículos matriculados (se hereda del constructor
    // del padre), con esta condición se pretende evitar esa suma si alguno de sus
    // otros parámetros no es correcto
    if ((color == null) || (plazas <= 0) || !(color.equals(COLOR_AZUL)) || !(color.equals(COLOR_BLANCO))
        || !(color.equals(COLOR_NEGRO))) {
      vehiculosMatriculados--;
    }

  }

  // Métodos
  /**
   * Obtiene el color del automovil
   * 
   * @return Color del automovil
   */
  public String getColor() {
    return color;
  }

  /**
   * Obtiene el número de plazas del automóvil
   * 
   * @return Número de plazas del automóvil
   */
  public int getPlazas() {
    return plazas;
  }

  /**
   * Obtiene una representación en texto del automóvil El formato es Matricula:
   * MMMM, Fecha Matriculacion: FFFF, Color: CCCC, Num. Plazas: PPPPP donde MMMM
   * es la matricula, FFFF es la fecha de matriculacion, CCCC es el color, PPPP es
   * el número de plazas
   * 
   * @return Cadena con la información del objeto en formato texto
   */
  @Override
  public String aTexto() {
    String cadena = ("Matricula: " + matricula + ", Fecha Matriculacion: " + fechaMatriculacion.aTexto() + ", color: "
        + getColor() + ", Num. Plazas: " + getPlazas());
    return cadena;
  }

}

package prog.unidad04.practica406.libreria;

/**
 * Motocicleta. Es un vehiculo con cilindrada
 */
public class Motocicleta extends Vehiculo implements ConvertibleATexto {

  // Atributo de instancia
  protected int cilindrada;

  /**
   * Constructor
   * 
   * @param matricula          - Matrícula del vehiculo. Debe tener un formato
   *                           válido NNNN AAA donde NNNN son 4 dígitos y AAA son
   *                           tres letras MAYÚSCULAS. Entre ellas puede haber
   *                           cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion - Fecha de matriculación del vehiculo. No puede ser
   *                           null
   * @param cilindrada         - Cilindrada de la motocicleta (debe ser superior o
   *                           igual a 50)
   * @throws IllegalArgumentException - Si alguno de los parametros no es válido
   */
  public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindrada) {
    super(matricula, fechaMatriculacion);

    // Si el valor de la cilindrada es menor a 50, se lanza excepción
    if (cilindrada < 50) {
      throw new IllegalArgumentException();
    } else {
      this.cilindrada = cilindrada;
    }

    // Si la fecha de matriculación del vehículo es correcta, se sumará 1 al número
    // de vehículos matriculados (se hereda del constructor
    // del padre), con esta condición se pretende evitar esa suma si el parámetro
    // cilindrada no es correcto
    if (cilindrada < 50) {
      vehiculosMatriculados--;
    }

  }

  // Métodos
  /**
   * Obtiene la cilindrada de la motocicleta
   * 
   * @return Cilindrada de la motocicleta
   */
  public int getCilindrada() {
    return cilindrada;
  }

  /**
   * Obtiene una representación en texto del contenido del objeto El formato es:
   * Matricula: MMMM, Fecha Matriculacion: FFFF, Cilindrada: CCCC donde MMMM es la
   * matrícula, FFFF es la fecha de matriculación y CCCC es la cilindrada
   * 
   * @return Cadena con la información del objeto en formato texto
   */
  @Override
  public String aTexto() {
    String cadena = ("Matricula: " + getMatricula() + ", Fecha Matriculacion: " + getFechaMatriculacion().aTexto()
        + ", cilindrada: " + getCilindrada());
    return cadena;
  }

}

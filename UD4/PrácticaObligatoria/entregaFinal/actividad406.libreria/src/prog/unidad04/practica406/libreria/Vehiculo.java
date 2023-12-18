package prog.unidad04.practica406.libreria;

/**
 * Clase que representa a un vehículo
 */
public class Vehiculo {

  // Atributos (Constantes)
  private String ABECEDARIO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String NUMEROS_PERMITIDOS = "1234567890";

  // Atributos estáticos
  /**
   * Número de vehiculos matriculados hasta el momento
   */
  protected static int vehiculosMatriculados;

  // Atributos de instancia
  /**
   * Matricula del vehiculo
   */
  protected String matricula;

  /**
   * Fecha de matriculación del vehiculo
   */
  protected Fecha fechaMatriculacion;

  /**
   * Constructor protegido para que no pueda usarse para crear objetos desde
   * clases que no hereden de esta
   * 
   * @param matricula          - Matrícula del vehiculo. Debe tener un formato
   *                           válido NNNN AAA donde NNNN son 4 dígitos y AAA son
   *                           tres letras MAYÚSCULAS. Entre ellas puede haber
   *                           cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion - Fecha de matriculación del vehiculo. No puede ser
   *                           null
   * @throws IllegalArgumentException - Si alguno de los parámetros no es válido
   */
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
    // Se comprueba con un metodo privado si la matrícula es correcta (la devolverá
    // únicamente en el caso de que lo sea)
    this.matricula = comprobarMatricula(matricula);

    // Si la fecha de matriculación del vehiculo es null, se lanza excepción
    if (fechaMatriculacion == null) {
      throw new IllegalArgumentException();
    } else {
      // Si la fecha es correcta, se guardan los valores y se añade 1 a la cantidad de
      // vehiculos matriculados
      this.fechaMatriculacion = fechaMatriculacion;
      vehiculosMatriculados++;
    }

  }

  // Métodos
  /**
   * Obtiene la cantidad de vehículos matriculados hasta el momento
   * 
   * @return Cantidad de vehículos matriculados hasta el momento
   */
  public static int getVehiculosMatriculados() {
    return vehiculosMatriculados;
  }

  /**
   * Obtiene la matricula del vehículo
   * 
   * @return Matrícula del vehículo
   */
  public String getMatricula() {
    return matricula;
  }

  /**
   * Obtiene la fecha de matriculación del vehículo
   * 
   * @return Fecha de matriculacion del vehículo
   */
  public Fecha getFechaMatriculacion() {
    return fechaMatriculacion;
  }

  // Método que comprueba si las tres partes que conforman la matrícula (4
  // números, 0 o más espacios en blanco y 3 letras mayúsculas) contienen
  // los valores permitidos, en el caso de que no sea así se lanza excepción
  private String comprobarMatricula(String matricula) {
    if (matricula.length() < 7) {
    	throw new IllegalArgumentException();
    }
  	
  	for (int i = 0; i <= 3; i++) {
      char caracter = matricula.charAt(i);
      if (!NUMEROS_PERMITIDOS.contains(String.valueOf(caracter))) {
        throw new IllegalArgumentException();
      }
    }

    for (int i = matricula.length() - 3; i <= matricula.length() - 1; i++) {
      char caracter = matricula.charAt(i);
      if (!ABECEDARIO.contains(String.valueOf(caracter))) {
        throw new IllegalArgumentException();
      }
    }

    for (int i = 4; i <= matricula.length() - 4; i++) {
      char caracter = matricula.charAt(i);
      if (' ' != caracter) {
        throw new IllegalArgumentException();
      }
    }

    return matricula;

  }

}

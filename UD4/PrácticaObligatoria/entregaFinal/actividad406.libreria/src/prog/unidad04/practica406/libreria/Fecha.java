package prog.unidad04.practica406.libreria;

/**
 * Clase que representa una fecha a partir del 1/1/1900
 */
public class Fecha implements ConvertibleATexto {

  // Atributos estáticos (Constantes)
  private static final int MES_FECHA_INICIO = 1;
  private static final int ANYO_FECHA_INICIO = 1900;

  // Atributos de instancia
  private int dia;
  private int mes;
  private int anyo;

  /**
   * Constructor con dia mes y año
   * 
   * @param dia - Dia de la fecha. Debe valer entre 1 y la cantidad de días del mes. Tiene en cuenta los años bisiestos
   * @param mes - Mes de la fecha. Debe valer entre 1 y 12
   * @param anyo - Año de la fecha. Debe ser mayor o igual a 1900
   * @throws IllegalArgumentException - Si los parámetros no se corresponden con una fecha válida
   */
  public Fecha(int dia, int mes, int anyo) {
    // Si el mes es inferior a uno o mayor que 12 se lanza excepción
    if ((mes < 1) || (mes > 12)) {
      throw new IllegalArgumentException();
    } else {
      this.mes = mes;
    }

    // Si el año es inferior a 1900 se lanza excepción
    if (anyo < 1900) {
      throw new IllegalArgumentException();
    } else {
      this.anyo = anyo;
    }

    // Para determinar el número de días que tiene el mes, se crea un método privado
    // (diasDelMes) que tendrá en cuenta si el año es bisiesto o no
    // Si es inferior a 1 o mayor que los días que tenga el mes (sea bisiesto o no)
    // se lanza excepción
    if ((dia < 1) || (dia > diasDelMes(mes, anyo))) {
      throw new IllegalArgumentException();
    } else {
      this.dia = dia;
    }
  }

  // Métodos
  /**
   * Obtiene el día de la fecha
   * 
   * @return Dia de la fecha
   */
  public int getDia() {
    return dia;
  }

  /**
   * Obtiene el mes de la fecha
   * 
   * @return Mes de la fecha
   */
  public int getMes() {
    return mes;
  }

  /**
   * Obtiene el año de la fecha
   * 
   * @return Año de la fecha
   */
  public int getAnyo() {
    return anyo;
  }

  /**
   * Devuelve si el año es bisiesto o no
   * 
   * @return true si el año es bisiesto, false en caso contrario
   */
  public boolean esBisiesto() {
    return compruebaBisiesto(anyo);
  }

  /**
   * Obtiene el número de días transcurridos entre esta fecha y la fecha de inicio del calendario (1/1/1900)
   * 
   * @return Número de días transcurridos entre esta fecha y la fecha de inicio del calendario
   */
  public long diasTranscurridos() {
    long sumaDias = 0;

    for (int i = ANYO_FECHA_INICIO; i < anyo; i++) {
      if (compruebaBisiesto(i)) {
        sumaDias += 366;
      } else {
        sumaDias += 365;
      }
    }

    for (int i = MES_FECHA_INICIO; i < mes; i++) {
      sumaDias += diasDelMes(i, anyo);
    }

    sumaDias += dia - 1;

    return sumaDias;
  }

  /**
   * Obtiene el número de días transcurridos entre esta fecha y otra posterior que
   * se proporciona.
   * 
   * @param fecha - Otra fecha posterior a ésta
   * @return Número de días transcurridos entre esta fecha y la proporcionada
   * @throws FechaException - Si la fecha proporcionada es anterior a ésta
   */
  public long diasEntre(Fecha fecha) {
    long diasEntre = 0;
    diasTranscurridos();
    fecha.diasTranscurridos();

    if (fecha.diasTranscurridos() < diasTranscurridos()) {
      throw new FechaException();
    } else {
      diasEntre = fecha.diasTranscurridos() - diasTranscurridos();
    }

    return diasEntre;
  }

  /**
   * Compara esta fecha con otra
   * 
   * @param fecha - Fecha con la que se quiere comparar ésta
   * @return Menor que 0 si esta fecha es anterior a la otra, 0 si las dos fechas
   *         son iguales y mayor que cero si esta fecha es posterior a la otra
   */
  public int compara(Fecha fecha) {
    int numDias = 0;
    diasTranscurridos();
    fecha.diasTranscurridos();

    if (diasTranscurridos() == fecha.diasTranscurridos()) {
      return numDias = 0;
    } else if (diasTranscurridos() < fecha.diasTranscurridos()) {
      return numDias = -1;
    } else if (diasTranscurridos() > fecha.diasTranscurridos()) {
      return numDias = 1;
    }
    return numDias;
  }

  /**
   * Obtiene una representación de la fecha en formato texto El formato es DDDD de
   * MMMMM de AAAAA donde DDDD es el día del mes (en número), MMMM es el mes (en
   * letra y minúsculas) y AAAA es el año (en número)
   * 
   * @return Cadena con la información del objeto en formato texto
   */
  @Override
  public String aTexto() {
    String cadena = (dia + " de " + cadenaMes(mes) + " de " + anyo);
    return cadena;
  }

  private boolean compruebaBisiesto(int anyo) {
    // Un año es bisiesto si es divisible entre 4 y NO es divisible entre 100 o es
    // divisible entre 100 Y 400
    if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  // Método privado que determina el número de días
  private int diasDelMes(int mes, int anyo) {
    // Se inicializa la variable dias a 0 y se hace un switch con el número del mes
    // para determinar el número de días
    int dias = 0;
    switch (mes) {
    // Si el año es bisiesto, febrero tiene 29 días, si no lo es tiene 28
    case 2:
      if (compruebaBisiesto(anyo)) {
        dias = 29;
      } else {
        dias = 28;
      }
      break;
    // Abril, junio, septiembre y noviembre tienen 30 dias
    case 4:
    case 6:
    case 9:
    case 11:
      dias = 30;
      break;
    // El resto 31
    default:
      dias = 31;
      break;
    }

    return dias;
  }

  // Método para que cada mes se corresponda con su análogo en texto
  private String cadenaMes(int mes) {
    String nombreMes = "";
    switch (mes) {
    case 1:
      nombreMes = "enero";
      break;
    case 2:
      nombreMes = "febrero";
      break;
    case 3:
      nombreMes = "marzo";
      break;
    case 4:
      nombreMes = "abril";
      break;
    case 5:
      nombreMes = "mayo";
      break;
    case 6:
      nombreMes = "junio";
      break;
    case 7:
      nombreMes = "julio";
      break;
    case 8:
      nombreMes = "agosto";
      break;
    case 9:
      nombreMes = "septiembre";
      break;
    case 10:
      nombreMes = "octubre";
      break;
    case 11:
      nombreMes = "noviembre";
      break;
    case 12:
      nombreMes = "diciembre";
      break;
    }

    return nombreMes;
  }

}

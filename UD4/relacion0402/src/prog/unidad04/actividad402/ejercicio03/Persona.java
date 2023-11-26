package prog.unidad04.actividad402.ejercicio03;

import java.util.Random;

/**
 * Clase que representa a una persona
 */
public class Persona {

  // Atributos
  private String nombre = "";
  private int edad = 0;
  private char sexo = 'M';
  private double peso = 0;
  private double altura = 0;
  private String dni;
  private double getIMC = 0;
  private char comprobarSexo = 'M';

  // Constructores
  /**
   * Constructor por defecto Crea el objeto con los siguientes valores: nombre = "" edad = 0 sexo = 'M' peso = 0 altura = 0 DNI = Valor generado al azar
   */
  public Persona() {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    this.generarDNI();
  }

  /**
   * Constructor con algunos parámetros. El resto toma los valores por defecto
   * 
   * @param nombre - Nombre de la nueva persona
   * @param edad   - Edad de la nueva persona
   * @param sexo   - sexo de la nueva persona. Si no es 'H' o 'M' se usa el valor por defecto ('M')
   */
  public Persona(String nombre, int edad, char sexo) {
    this();
    this.nombre = nombre;
    this.edad = edad;
    this.comprobarSexo(sexo);
  }

  /**
   * Constructor con todos los parámetros
   * 
   * @param nombre - Nombre de la nueva persona
   * @param edad   - Edad de la nueva persona
   * @param sexo   - Sexo de la nueva persona ('H' o 'M'). Si no es correcto se toma 'M'
   * @param peso   - Peso de la persona (en kilogramos)
   * @param altura - Altura de la persona (en metros)
   */
  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this(nombre, edad, sexo);
    this.peso = peso;
    this.altura = altura;
  }

  // Métodos

  /**
   * Determina si la persona es o no mayor de edad
   * 
   * @return true si la persona es mayor de edad o false si no lo es
   */
  public boolean esMayorDeEdad() {
    boolean esMayorDeEdad;

    if (edad >= 18) {
      esMayorDeEdad = true;
    } else {
      esMayorDeEdad = false;
    }
    
    return esMayorDeEdad;
  }

  /**
   * Obtiene el Indice de Masa Corporal (IMC) de la persona según su peso y altura
   * 
   * @return Indice de masa corporal de la persona
   */
  public double getIMC() {
    
    if (altura == 0) {
      getIMC = 0;
    }

    if (altura != 0) {
      getIMC = (peso / (altura * altura));
    }

    return getIMC;
  }

  /**
   * Determina si la persona tiene o no el peso correcto
   * 
   * @return -1 si el peso es inferior al correcto, 0 si el peso es correcto y 1
   *         si el peso es superior al correcto
   */
  public int getPesoCorrecto() {
    int getPesoCorrecto = 0;

    if (getIMC < 20) {
      getPesoCorrecto = -1;
    } else if ((getIMC >= 20) && (getIMC <= 25)) {
      getPesoCorrecto = 0;
    } else if (getIMC > 25) {
      getPesoCorrecto = 1;
    }

    return getPesoCorrecto;
  }
  
  /**
   * Obtiene una representación en cadena de la persona en formato:
   * Nombre: "NNNN", Edad: EEEE, Sexo: S, Peso: PPPP, Altura: AAAA, DNI: DDDDDD
   * donde NNNN es el nombre de la persona, EEEE es la edad, S es el sexo (H o M), PPPP es el peso , AAAA es la altura y DDDDD es el DNI.
   * @return Cadena con la representación de la persona
   */
  public String obtenerCadena() {
    String obtenerCadena = ("Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + comprobarSexo + ", Peso: " + peso + ", Altura: " + altura + ", DNI: " + dni);
    
    return obtenerCadena;
  }
  
  
  //Genera el DNI de la persona calculando 8 dígitos al azar y la letra correspondiente.
  private String generarDNI() {
    this.dni = "";
    
    // Generar número aleatorio de 8 dígitos.
    Random generador = new Random();
    int dniEnt = generador.nextInt(10000000, 99999999);
    
    // Convierto de int a String.
    String dni = Integer.toString(dniEnt);
    
    // Se calcula la letra y se concatena con la parte numérica.
    if (dniEnt % 23 == 0) {
      this.dni = (dni + 'T');
    } else if (dniEnt % 23 == 1) {
      this.dni = (dni + 'R');
    } else if (dniEnt % 23 == 2) {
      this.dni = (dni + 'W');
    } else if (dniEnt % 23 == 3) {
      this.dni = (dni + 'A');
    } else if (dniEnt % 23 == 4) {
      this.dni = (dni + 'G');
    } else if (dniEnt % 23 == 5) {
      this.dni = (dni + 'M');
    } else if (dniEnt % 23 == 6) {
      this.dni = (dni + 'Y');
    } else if (dniEnt % 23 == 7) {
      this.dni = (dni + 'F');
    } else if (dniEnt % 23 == 8) {
      this.dni = (dni + 'P');
    } else if (dniEnt % 23 == 9) {
      this.dni = (dni + 'D');
    } else if (dniEnt % 23 == 10) {
      this.dni = (dni + 'X');
    } else if (dniEnt % 23 == 11) {
      this.dni = (dni + 'B');
    } else if (dniEnt % 23 == 12) {
      this.dni = (dni + 'N');
    } else if (dniEnt % 23 == 13) {
      this.dni = (dni + 'J');
    } else if (dniEnt % 23 == 14) {
      this.dni = (dni + 'Z');
    } else if (dniEnt % 23 == 15) {
      this.dni = (dni + 'S');
    } else if (dniEnt % 23 == 16) {
      this.dni = (dni + 'Q');
    } else if (dniEnt % 23 == 17) {
      this.dni = (dni + 'V');
    } else if (dniEnt % 23 == 18) {
      this.dni = (dni + 'H');
    } else if (dniEnt % 23 == 19) {
      this.dni = (dni + 'L');
    } else if (dniEnt % 23 == 20) {
      this.dni = (dni + 'C');
    } else if (dniEnt % 23 == 21) {
      this.dni = (dni + 'K');
    } else if (dniEnt % 23 == 22) {
      this.dni = (dni + 'E');
    }
    
    return this.dni;
  }
  
  // Devuelve el sexo proporcionado, si este es correcto o el sexo por defecto (M) si no lo es.
  private char comprobarSexo(char sexo) {
    
    if (sexo == 'H') {
      comprobarSexo = 'H';
    } else if (sexo == 'M') {
      comprobarSexo = 'M';
    } else {
      comprobarSexo = 'M';
    }
    
    return comprobarSexo;
  }
}

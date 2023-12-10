package prog.unidad04.actividad405.ejercicio01;

import prog.unidad04.actividad405.comun.Persona;
import prog.unidad04.actividad405.comun.Alumno;
import prog.unidad04.actividad405.comun.Becario;
import prog.unidad04.actividad405.comun.Profesor;

public class Universidad {

  private static String matriculaAlumno = "";
  private static String matriculaBecario = "";

  public static void imprimir(Persona persona) {
    System.out.println("Nombre: " + persona.getNombre() + ", DNI: " + persona.getDNI());
  }

  public static void imprimir(Alumno alumno) {
    System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDNI() + ", Matricula: "
        + alumno.getMatricula() + " " + matriculaAlumno);
  }

  public static void imprimir(Becario becario) {
    System.out.println("Nombre: " + becario.getNombre() + ", DNI: " + becario.getDNI() + ", Matricula: "
        + becario.getMatricula() + " " + matriculaBecario + ", Cuenta Corriente: " + becario.getCuentaCorriente());
  }

  public static void imprimir(Profesor profesor) {
    System.out.println("Nombre: " + profesor.getNombre() + ", DNI: " + profesor.getDNI() + ", Titulación: "
        + profesor.getTitulacion());
  }

  public static void matricular(Persona persona, String matricula) {
    System.out.println("Una persona puede no ser un alumno, por tanto no se puede matricular");
  }

  public static void matricular(Alumno alumno, String matricula) {
    System.out.println("El alumno se ha matriculado correctamente");
    Universidad.matriculaAlumno = matricula;
  }

  public static void matricular(Becario becario, String matricula) {
    System.out.println("El becario se ha matriculado correctamente");
    Universidad.matriculaBecario = matricula;
  }
  
  public static void matricular(Profesor profesor, String matricula) {
    System.out.println("Un profesor no es un alumno, por tanto no se puede matricular");
  }

}

import java.util.Scanner;

public class Actividad202Recont {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();

    System.out.println("DATOS PERSONALES");
    System.out.println("----------------");

    System.out.print("¿Edad de la persona? ");
    int edad1 = Integer.parseInt(sc.nextLine());
    System.out.print("¿Número de hijos? ");
    int hijos1 = Integer.parseInt(sc.nextLine());
    System.out.print("¿Peso? ");
    double peso1 = Double.parseDouble(sc.nextLine());
    
    System.out.print("¿Edad de la segunda persona? ");
    int edad2 = Integer.parseInt(sc.nextLine());
    System.out.print("¿Número de hijos de la segunda persona? ");
    int hijos2 = Integer.parseInt(sc.nextLine());
    System.out.print("¿Peso de la segunda persona? ");
    double peso2 = Double.parseDouble(sc.nextLine());

    persona1.edad = edad1;
    persona1.numeroHijos = hijos1;
    persona1.peso = peso1;
    
    persona2.edad = edad2;
    persona2.numeroHijos = hijos2;
    persona2.peso = peso2;

    System.out.println("Edad de la persona: " + persona1.edad + " años.");
    System.out.println("Número de hijos: " + persona1.numeroHijos);
    System.out.println("Peso: " + persona1.peso + " kilogramos.");
    System.out.println("Edad de la segunda persona: " + persona2.edad + " años.");
    System.out.println("Número de hijos de la segunda persona: " + persona2.numeroHijos);
    System.out.println("Peso de la segunda persona: " + persona2.peso + " kilogramos.");

  }

}

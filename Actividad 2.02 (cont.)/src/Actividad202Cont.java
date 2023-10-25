
public class Actividad202Cont {

  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.edad = 25;
    persona1.peso = 40.5;

    Persona persona2 = new Persona();
    persona2.edad = 35;
    persona2.peso = 55.6;

    Persona persona3 = persona2;
    persona3.edad = 40;
    persona3 = null;

    System.out.println("Edad persona1: " + persona1.edad);
    System.out.println("Edad persona2: " + persona2.edad);
    System.out.println("Edad persona3: " + persona3.edad);

  }

}

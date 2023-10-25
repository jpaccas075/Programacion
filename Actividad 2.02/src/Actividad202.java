
public class Actividad202 {

  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.edad = 25;
    persona1.peso = 75.4;

    Persona persona2 = new Persona();
    persona2.edad = 65;
    persona2.numeroHijos = 3;
    persona2.peso = 65;

    boolean apuntanObjeto = persona1 == persona2;

    System.out.println("Edad de la primera persona: " + persona1.edad + " años, y peso: " + persona1.peso + " kilos.");
    System.out.println("Edad de la segunda persona: " + persona2.edad + " años, número de hijos: "
        + persona2.numeroHijos + " y peso: " + persona2.peso + " kilos.");
    System.out.println("¿Apuntan al mismo objeto? " + apuntanObjeto);

  }

}

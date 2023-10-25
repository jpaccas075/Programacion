import java.util.Scanner;

public class NavajaSuizaCadenasApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe la primera cadena: ");
    String cadena1 = new String(sc.nextLine());
    System.out.print("Escribe la segunda cadena: ");
    String cadena2 = new String(sc.nextLine());

    System.out.println("Has escrito: " + cadena1 + " " + cadena2);
    System.out.println("La longitud de las cadenas es: " + cadena1.length() + " y " + cadena2.length());
    System.out.println("¿Están vacías?: " + cadena1.isEmpty() + " y " + cadena2.isEmpty());
    System.out.println("¿Contienen caracteres blancos?: " + cadena1.isBlank() + " y " + cadena2.isBlank());
    System.out.println("¿Son iguales? (case sensitive): " + cadena1.equals(cadena2));
    System.out.println("¿Son iguales? (no case sensitive): " + cadena1.equalsIgnoreCase(cadena2));
    System.out.println("Comparación alfabética (case sensitive): " + cadena1.compareTo(cadena2));
    System.out.println("Comparación alfabética (no case sensitive): " + cadena1.compareToIgnoreCase(cadena2));
    System.out.println("¿La primera contiene a la segunda?: " + cadena1.contains(cadena2));
    System.out.println("¿La primera empieza por la segunda?: " + cadena1.startsWith(cadena2));
    System.out.println("¿La primera acaba por la segunda?: " + cadena1.endsWith(cadena2));
    System.out.println("Primer y último caracter de la primera cadena: " + cadena1.charAt(0) + " y "
        + (cadena1.charAt(cadena1.length() - 1)));
    System.out.println("Primera cadena eliminando el primer caracter: " + cadena1.substring(1));
    System.out.println("Primera cadena todas mayúsculas: " + cadena1.toUpperCase());
    System.out.println("Primera cadena todas minúsculas: " + cadena1.toLowerCase());

    System.out.println("" + cadena1.substring(2, 8));

    sc.close();

  }

}

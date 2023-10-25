import java.util.Scanner;

public class EdadConducirApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce tu edad para saber si puedes obtener el permiso de conducir: ");
    int edad = Integer.parseInt(sc.nextLine());
    
    System.out.println("\"True\" significa que puedes y \"false\" que no puedes: " + (edad >= 18));
    
  }

}
import java.util.Scanner;

public class ParImparApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un número para saber si es par o impar: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    System.out.println("\"True\" significa par y \"false\" impar: " + (numero % 2 == 0));
  }

}
import java.util.Scanner;

public class MediaTrimestreApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la nota del primer trimestre: ");
    double nota1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la nota del segundo trimestre: ");
    double nota2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la nota del tercer trimestre: ");
    double nota3 = Double.parseDouble(sc.nextLine());
    
    double notaMedia = (nota1 + nota2 + nota3) / 3;

    System.out.println("\"True\" significa que apruebas y \"false\" que no: " + (notaMedia >= 5));

  }

}

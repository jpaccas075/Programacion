import java.util.Scanner;

public class actividad203b {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la parte real del primer número: ");
    double numero1real = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la parte imaginaria del primer número: ");
    double numero1imaginaria = Double.parseDouble(sc.nextLine());

    System.out.print("Introduce la parte real del segundo número: ");
    double numero2real = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la parte imaginaria del segundo número: ");
    double numero2imaginaria = Double.parseDouble(sc.nextLine());

    Complejo numero1 = new Complejo(numero1real, numero1imaginaria);
    Complejo numero2 = new Complejo(numero2real, numero2imaginaria);

    Complejo sumar = numero1.sumar(numero2);
    Complejo restar = numero1.restar(numero2);
    Complejo producto = numero1.multiplicar(numero2);
    Complejo division = numero1.dividir(numero2);

    double sumaReal = sumar.getParteReal();
    double sumaImaginaria = sumar.getParteImaginaria();
    double restaReal = restar.getParteReal();
    double restaImaginaria = restar.getParteImaginaria();
    double productoReal = producto.getParteReal();
    double productoImaginaria = producto.getParteImaginaria();
    double divisionReal = division.getParteReal();
    double divisionImaginaria = division.getParteImaginaria();

    System.out.println("La suma vale: " + sumaReal + " + " + sumaImaginaria + "i.");
    System.out.println("La resta vale: " + restaReal + " + " + restaImaginaria + "i.");
    System.out.println("La multiplicación vale: " + productoReal + " + " + productoImaginaria + "i.");
    System.out.println("La división vale: " + divisionReal + " + " + divisionImaginaria + "i.");

  }

}

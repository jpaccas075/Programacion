import java.util.Scanner;

public class estudio {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //pedir las dos partes de los dos numeros complejos
    System.out.print("parte real del primer complejo: ");
    double parteReal = Double.parseDouble(sc.nextLine());
    System.out.print("parte imaginaria del primer complejo: ");
    double parteImaginaria = Double.parseDouble(sc.nextLine());
    System.out.print("parte real del segundo complejo: ");
    double parteReal2 = Double.parseDouble(sc.nextLine());
    System.out.print("parte imaginaria del segundo complejo: ");
    double parteImaginaria2 = Double.parseDouble(sc.nextLine());
    
    //crear los complejos
    Complejo complejo1 = new Complejo(parteReal, parteImaginaria);
    Complejo complejo2 = new Complejo(parteReal2, parteImaginaria2);
    
    //operar con los complejos
    Complejo suma = complejo1.sumar(complejo2);
    Complejo resta = complejo1.restar(complejo2);
    Complejo producto = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);
    
    //traduccion registros en valores
    double sumaParteReal = suma.getParteReal();
    double sumaParteImaginaria = suma.getParteImaginaria();
    double restaParteReal = resta.getParteReal();
    double restaParteImaginaria = resta.getParteImaginaria();
    double productoParteReal = producto.getParteReal();
    double productoParteImaginaria = producto.getParteImaginaria();
    double divisionParteReal = division.getParteReal();
    double divisionParteImaginaria = division.getParteImaginaria();
    
    //mostrar por pantalla los resultados
    System.out.println("suma vale: " + sumaParteReal + " / " + sumaParteImaginaria + "i.");
    System.out.println("resta vale: " + restaParteReal + " / " + restaParteImaginaria + "i.");
    System.out.println("producto vale: " + productoParteReal + " / " + productoParteImaginaria + "i.");
    System.out.println("division vale: " + divisionParteReal + " / " + divisionParteImaginaria + "i.");

  }

}

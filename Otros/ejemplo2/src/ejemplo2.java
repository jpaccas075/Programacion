import paquete1.Fraccion;
import java.util.Scanner;

public class ejemplo2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // solicitamos los datos necesarios de las dos fracciones
    System.out.print("numerador primera fraccion: ");
    int numerador1 = Integer.parseInt(sc.nextLine());
    System.out.print("denominador primera fraccion: ");
    int denominador1 = Integer.parseInt(sc.nextLine());
    System.out.print("numerador segunda fraccion: ");
    int numerador2 = Integer.parseInt(sc.nextLine());
    System.out.print("denominador segunda fraccion: ");
    int denominador2 = Integer.parseInt(sc.nextLine());

    // creamos las fracciones
    Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
    Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

    // operamos con las fracciones
    Fraccion suma = fraccion1.suma(fraccion2);
    Fraccion resta = fraccion1.resta(fraccion2);
    Fraccion producto = fraccion1.producto(fraccion2);
    Fraccion division = fraccion1.division(fraccion2);

    // mostrar resultados por pantalla
    System.out.println("suma vale: " + suma.getNumerador() + " / " + suma.getDenominador());
    System.out.println("resta vale: " + resta.getNumerador() + " / " + resta.getDenominador());
    System.out.println("producto vale: " + producto.getNumerador() + " / " + producto.getDenominador());
    System.out.println("division vale: " + division.getNumerador() + " / " + division.getDenominador());

    // creamos las fracciones a simplificar (y las simplificamos)
    paquete2.Fraccion sumaSimplificada = new paquete2.Fraccion(suma.getNumerador(), suma.getDenominador()).simplifica();
    paquete2.Fraccion restaSimplificada = new paquete2.Fraccion(resta.getNumerador(), resta.getDenominador()).simplifica();
    paquete2.Fraccion productoSimplificado = new paquete2.Fraccion(producto.getNumerador(), producto.getDenominador()).simplifica();
    paquete2.Fraccion divisionSimplificada = new paquete2.Fraccion(division.getNumerador(), division.getDenominador()).simplifica();

    // mostrar resultados por pantalla
    System.out.println("suma simplificada vale: " + sumaSimplificada.getNum() + " / " + sumaSimplificada.getDen());
    System.out.println("resta simplificada vale: " + restaSimplificada.getNum() + " / " + restaSimplificada.getDen());
    System.out.println("producto simplificado vale: " + productoSimplificado.getNum() + " / " + productoSimplificado.getDen());
    System.out.println("division simplificada vale: " + divisionSimplificada.getNum() + " / " + divisionSimplificada.getDen());

  }

}

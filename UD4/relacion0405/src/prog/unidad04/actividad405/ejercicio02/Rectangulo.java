package prog.unidad04.actividad405.ejercicio02;

public class Rectangulo implements Figura {

  private double base;
  private double altura;
  private double area;
  private double perimetro;
  private boolean esRegular;

  public Rectangulo(Punto esquina1, Punto esquina2) {
    this.base = Math.abs(esquina2.getX() - esquina1.getX());
    this.altura = Math.abs(esquina2.getY() - esquina1.getY());
  }

  @Override
  public double area() {
    this.area = base * altura;
    return area;
  }

  @Override
  public double perimetro() {
    this.perimetro = (2 * altura) + (2 * base);
    return perimetro;
  }

  @Override
  public boolean esRegular() {
    if (base == altura) {
      esRegular = true;
    } else {
      esRegular = false;
    }
    return esRegular;
  }

}

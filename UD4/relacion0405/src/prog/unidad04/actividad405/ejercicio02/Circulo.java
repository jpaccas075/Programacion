package prog.unidad04.actividad405.ejercicio02;

public class Circulo implements Figura {
  
  private static final double PI = 3.141592653589793;
  private double radio;
  private double area;
  private double perimetro;
  
  public Circulo(Punto centro, double radio) {
    this.radio = radio;
    
    if (this.radio < 0) {
      throw new IllegalArgumentException();
    }
  }
  

  @Override
  public double area() {
    this.area = PI*(radio*radio);
    return area;
  }

  @Override
  public double perimetro() {
    this.perimetro = (2*PI)*radio;
    return perimetro;
  }

  @Override
  public boolean esRegular() {
    return true;
  }

}

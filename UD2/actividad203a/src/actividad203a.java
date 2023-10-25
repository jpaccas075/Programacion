
public class actividad203a {

  public static void main(String[] args) {
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    
    cuenta.ingresar(1000);
    System.out.println("El saldo es " + cuenta.getSaldo());
    
    cuenta.retirar(900);
    System.out.println("El saldo después de retirar 900 es " + cuenta.getSaldo());
    
    cuenta.retirar(100);
    System.out.println("El saldo después de retirar 1000 es " + cuenta.getSaldo());
    cuenta.ingresar(350);
    
    System.out.println("El saldo después de retirar 1000 e ingresar 350 es " + cuenta.getSaldo());
    cuenta.retirar(400);

  }

}

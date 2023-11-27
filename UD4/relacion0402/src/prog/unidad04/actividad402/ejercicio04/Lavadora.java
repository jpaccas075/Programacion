package prog.unidad04.actividad402.ejercicio04;

/**
 * Clase que representa una lavadora
 */
public class Lavadora {
	// Atributos constantes
	public static final String COLOR_AZUL = "azul";
	public static final String COLOR_BLANCO = "blanco";
	public static final String COLOR_GRIS = "gris";
	public static final String COLOR_NEGRO = "negro";
	public static final String COLOR_ROJO = "rojo";
	
	// Atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	private double carga;
	
	// Constructores
	/**
	 * Constructor por defecto. Usa los valores por defecto:
	 * precioBase = 200
	 * color = "blanco"
   * consumoEnergetico = 'F'
	 * peso = 15
	 * carga = 5
	 */
	public Lavadora() {
		precioBase = 200;
		color = COLOR_BLANCO;
		consumoEnergetico = 'F';
		peso = 15;
		carga = 5;
	}
	
	/**
	 * Constructor con precio y peso
	 * Para el resto usa los valores por defecto:
	 * color = "blanco"
	 * consumoEnergetico = 'F'
	 * carga = 5
	 * @param precioBase - Precio base de la nueva lavadora (no debería ser menor de cero)
	 * @param peso - Peso de la nueva lavadora (no debería ser cero o menor)
	 */
	public Lavadora(double precioBase, double peso) {
		this();
		
		if (precioBase < 0) {
			System.out.println("Error. El precio base de la lavadora no debería ser menor a 0");
		} else {
			this.precioBase = precioBase;
		}
		
		if (peso < 0) {
			System.out.println("Error. El peso de la lavadora no debería ser 0 o menor");
		} else {
			this.peso = peso;
		}
	}
	
	/**
	 * Constructor con todos los valores
	 * @param Precio base. No debería ser menor de cero
	 * @param color - Color. Debería ser uno de "blanco", "negro", "azul", "rojo", "gris"
	 * @param consumoEnergetico - Consumo energético. Debería ser una letra entre la 'A' y la 'F', ambas incluidas
	 * @param peso - Peso. Debería ser mayor de cero
	 * @param carga - Carga máxima de la lavadora. Debería ser mayor de cero 
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		this(precioBase, peso);
		this.carga = carga;
		
		// Si el color no es correcto, se muestra error
		if (!(color.equals(COLOR_BLANCO)) && !(color.equals(COLOR_NEGRO)) && !(color.equals(COLOR_AZUL)) && !(color.equals(COLOR_ROJO)) && !(color.equals(COLOR_GRIS))) {
			System.out.println("Error. El color debería ser uno de \"blanco\", \"negro\", \"azul\", \"rojo\", \"gris\"");
		} else {
			this.color = color;
		}
		
		// Si el consumo energético es correcto, se mantiene, si no muestra error
		if ((consumoEnergetico == 'A') || (consumoEnergetico == 'B') || (consumoEnergetico == 'C') || (consumoEnergetico == 'D') || (consumoEnergetico == 'E') || (consumoEnergetico == 'F')) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			System.out.println("Error. El consumo debería ser una entre la 'A' y la 'F'");
		}
		
		// Hacer condición de carga...
	}

}

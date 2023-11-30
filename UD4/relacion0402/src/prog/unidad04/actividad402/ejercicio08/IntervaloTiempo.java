package prog.unidad04.actividad402.ejercicio08;

/**
 * Representa un intervalo de tiempo en horas, minutos y segundos
 */
public class IntervaloTiempo {
	// Atributos
	private int horas;
	private int minutos;
	private int segundos;

	// Constructor
	public IntervaloTiempo(int horas, int minutos, int segundos) {
		// Almacenar en los segundos el módulo de dividir los segundos entre 60
		this.segundos = segundos % 60;
		// Sumamos a los minutos los que nos pasemos de 60 segundos
		minutos += segundos / 60;
		// Almacenar en los minutos el módulo de dividir los minutos entre 60
		this.minutos = minutos % 60;
		// Sumamos a las horas los que nos pasemos de 60 minutos
		horas += minutos / 60;
		this.horas = horas;
	}

	// Métodos
	public IntervaloTiempo suma(IntervaloTiempo otro) {
		int segundos = this.segundos + otro.segundos;
		int minutos = this.minutos + otro.minutos;
		int horas = this.horas + otro.horas;
		return new IntervaloTiempo(horas, minutos, segundos);
	}

	public IntervaloTiempo resta(IntervaloTiempo otro) {
		int segundos = this.segundos - otro.segundos;
		int minutos = 0;
		if (segundos < 0) {
			segundos += 60;
			minutos = 1;
		}
		minutos = this.minutos - otro.minutos - minutos;
		int horas = 0;
		if (minutos < 0) {
			minutos += 60;
			horas = 1;
		}
		horas = this.horas - otro.horas - horas;
		if (horas >= 0) {
			return new IntervaloTiempo(horas, minutos, segundos);
		} else {
			return null;
		}

	}

	public String obtenerCadena() {
		return horas + "h " + minutos + "m " + segundos + "s";
	}

}

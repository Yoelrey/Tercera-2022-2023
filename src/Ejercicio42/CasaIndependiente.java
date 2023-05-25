package Ejercicio42;

public class CasaIndependiente extends CasaUrbana {

	protected static double valorArea = 3000000;

	public CasaIndependiente(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños, int númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
	}

	/**
	 * Método que muestra en pantalla los datos de una casa independiente
	 */

	@Override
	public String toString() {
		return "CasaIndependiente [númeroPisos=" + númeroPisos + ", númeroHabitaciones=" + númeroHabitaciones
				+ ", númeroBaños=" + númeroBaños + ", identificadorInmobiliario=" + identificadorInmobiliario
				+ ", área=" + area + ", dirección=" + dirección + ", precioVenta=" + precioVenta + "]";
	}

}

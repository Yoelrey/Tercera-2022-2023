package Ejercicio42;

public class CasaUrbana extends Casa {

	public CasaUrbana(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños, int númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
	}

	/**
	 * Método que muestra en pantalla los datos de una casa urbana
	 */

	@Override
	public String toString() {
		return super.toString()+"CasaUrbana [númeroPisos=" + númeroPisos + ", númeroHabitaciones=" + númeroHabitaciones
				+ ", númeroBaños=" + númeroBaños + ", identificadorInmobiliario=" + identificadorInmobiliario
				+ ", área=" + area + ", dirección=" + dirección + ", precioVenta=" + precioVenta + "]";
	}

}

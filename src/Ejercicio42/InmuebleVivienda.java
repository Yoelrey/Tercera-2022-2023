package Ejercicio42;

public class InmuebleVivienda extends Inmueble {

	protected int númeroHabitaciones;

	protected int númeroBaños;

	public InmuebleVivienda(int identificadorInmobiliario, int area, String dirección, int númeroHabitaciones,
			int númeroBaños) {
		super(identificadorInmobiliario, area, dirección);
		this.númeroHabitaciones = númeroHabitaciones;
		this.númeroBaños = númeroBaños;
	}

	@Override
	public String toString() {
		return super.toString() + "InmuebleVivienda [númeroHabitaciones=" + númeroHabitaciones + ", númeroBaños="
				+ númeroBaños + "]";
	}

}

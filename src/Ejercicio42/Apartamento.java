package Ejercicio42;

public class Apartamento extends InmuebleVivienda {

	public Apartamento(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
	}

	@Override
	public String toString() {
		return super.toString()+"Apartamento [númeroHabitaciones=" + númeroHabitaciones + ", númeroBaños=" + númeroBaños
				+ ", identificadorInmobiliario=" + identificadorInmobiliario + ", área=" + area + ", dirección="
				+ dirección + ", precioVenta=" + precioVenta + "]";
	}

}

package Ejercicio42;

public class Casa extends InmuebleVivienda {

	protected int númeroPisos;

	public Casa(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños,
			int númeroPisos) {
// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
		this.númeroPisos = númeroPisos;
	}

	@Override
	public String toString() {
		return super.toString()+"Casa [númeroPisos=" + númeroPisos + "]";
	}

	public int getNúmeroPisos() {
		return númeroPisos;
	}

	public void setNúmeroPisos(int númeroPisos) {
		this.númeroPisos = númeroPisos;
	}

}

package Ejercicio42;

public class ApartamentoFamiliar extends Apartamento {

	protected static double valorArea = 2000000;

	protected int valorAdministración;

	public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños, int valor) {

		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
		this.valorAdministración = valorAdministración;
	}

	@Override
	public String toString() {
		return super.toString()+ "ApartamentoFamiliar [valorAdministración=" + valorAdministración + "]";
	}

	
	
}

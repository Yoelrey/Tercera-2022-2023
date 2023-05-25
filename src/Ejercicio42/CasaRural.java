package Ejercicio42;

public class CasaRural extends Casa {
	protected static double valorArea = 1500000;

	
	
	protected int distanciaCabera;

	protected int altitud;

	public CasaRural(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños,
			int númeroPisos, int distanciaCabera, int altitud) {

		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
		this.distanciaCabera = distanciaCabera;
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return super.toString()+"CasaRural [distanciaCabera=" + distanciaCabera + ", altitud=" + altitud + ", númeroPisos=" + númeroPisos
				+ ", númeroHabitaciones=" + númeroHabitaciones + ", númeroBaños=" + númeroBaños
				+ ", identificadorInmobiliario=" + identificadorInmobiliario + ", área=" + area + ", dirección="
				+ dirección + ", precioVenta=" + precioVenta + "]";
	}

	
}

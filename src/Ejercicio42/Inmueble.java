package Ejercicio42;

public class Inmueble {
	protected int identificadorInmobiliario;
	protected int area;
	protected String dirección;
	protected double precioVenta;
	protected static double valorArea=3500;

	Inmueble(int identificadorInmobiliario, int área, String dirección) {
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.area = área;
		this.dirección = dirección;
	}

	double calcularPrecioVenta(double valorArea) {
		precioVenta = area * valorArea;
		return precioVenta;
	}

	@Override
	public String toString() {
		return "Inmueble [identificadorInmobiliario=" + identificadorInmobiliario + ", área=" + area + ", dirección="
				+ dirección + ", precioVenta=" + precioVenta + "]";
	}

	public static double getValorArea() {
		return valorArea;
	}

	public static void setValorArea(double valorArea) {
		Inmueble.valorArea = valorArea;
	}

	

}

package Ejemplo84;

public class Cubo extends FiguraGeometrica{

	private static double lado;

	
	public Cubo(double lado) {
		super();
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Cubo [lado=" + lado + "]";
	}
	
	public static double calcularVolumen() {
		return Math.pow(lado,3);	}
	public static double calcularSuperficie() {
		return 6*Math.pow(lado,2);	}
	
	
}

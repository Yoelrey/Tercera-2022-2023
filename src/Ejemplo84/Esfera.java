package Ejemplo84;

public class Esfera extends FiguraGeometrica{

	private double radio;

	public Esfera(double radio) {
		this.setSuperficie(calcularSuperficie());
		this.setVolumen(calcularVolumen());
		this.radio = radio;
	}
	
	public double calcularVolumen() {
		double volumen =1.333* Math.PI *Math.pow(this.radio, 3.0);
		return volumen;
	}
	
	public double calcularSuperficie() {
		double superficie = 4.0* Math.PI* Math.pow(this.radio, 2.0);
		return superficie;
	}

	@Override
	public String toString() {
		return "Esfera [radio=" + radio + "]";
	}
	
}

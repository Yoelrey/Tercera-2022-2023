package Ejemplo84;

public class Cilindro extends FiguraGeometrica{

	
	private double radio;
	private double altura;
	public Cilindro(double radio, double altura) {
		this.setSuperficie(calcularSuperficie());
		this.setVolumen(calcularVolumen());
		this.radio = radio;
		this.altura = altura;
	}
	
	public double calcularVolumen() {
		double volumen= Math.PI*altura*Math.pow(radio,2.0);
		return volumen;
	}
	public double calcularSuperficie() {
	double areaLadoA = 2.0* Math.PI*radio * altura;
	double areaLadoB=2.0*Math.PI*altura*Math.pow(radio,2.0);
	return areaLadoA+areaLadoB;
	}

	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}
	
}

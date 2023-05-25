package Ejemplo84;

public class Piramide extends FiguraGeometrica{

	private double apotema;
	private double base;
	private double altura;
	public Piramide(double apotema, double base, double altura) {
		this.setSuperficie(calcularSuperficie());
		this.setVolumen(calcularVolumen());
		this.apotema = apotema;
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularVolumen() {
		double volumen =(Math.pow(base, 2.0)*altura)/3.0;
		return volumen;
	}
	
	public double calcularSuperficie() {
		double areaBase= Math.pow(base, 2.0);
		double areaLado=2.0*base*apotema;
		return areaBase+areaLado;
	}

	@Override
	public String toString() {
		return "Piramide [apotema=" + apotema + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
}

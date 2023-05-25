package Equipos;

public class Escalador extends Ciclista{

	private double aceleracionPromedio;
	private double gradoRampa;
	public Escalador(String nombre, double totalTiempo, String pais, int identificador, String nombre2,
			int tiempoAcumulado, double aceleracionPromedio, double gradoRampa) {
		super(nombre, totalTiempo, pais, identificador, nombre2, tiempoAcumulado);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}
	protected double getAceleracionPromedio() {
		return aceleracionPromedio;
	}
	protected void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}
	protected double getGradoRampa() {
		return gradoRampa;
	}
	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}
	@Override
	public String toString() {
		return "Escalador [aceleracionPromedio=" + aceleracionPromedio + ", gradoRampa=" + gradoRampa + "]";
	}
	
	
	
}

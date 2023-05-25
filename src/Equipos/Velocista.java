package Equipos;

public class Velocista extends Ciclista{

	protected double potenciaPromedio;
	
	protected double velocidadPromedio;

	
	
	public Velocista(String nombre, double totalTiempo, String pais, int identificador, String nombre2,
			int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
		super(nombre, totalTiempo, pais, identificador, nombre2, tiempoAcumulado);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}



	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}



	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}



	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}



	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}



	@Override
	public String toString() {
		return "Velocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio=" + velocidadPromedio + "]";
	}
	
}

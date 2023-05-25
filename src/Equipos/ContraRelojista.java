package Equipos;

public class ContraRelojista extends Ciclista{
	protected double velocidadMaxima;

	
	
	
	public ContraRelojista(String nombre, double totalTiempo, String pais, int identificador, String nombre2,
			int tiempoAcumulado, double velocidadMaxima) {
		super(nombre, totalTiempo, pais, identificador, nombre2, tiempoAcumulado);
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "ContraRelojista [velocidadMaxima=" + velocidadMaxima + "]";
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	
}

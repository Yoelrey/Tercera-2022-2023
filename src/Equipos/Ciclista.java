package Equipos;

public abstract class Ciclista extends Equipo {

	protected int identificador;
	protected String nombre;
	protected int tiempoAcumulado;
	private int posicionGeneral;

	public Ciclista(String nombre, double totalTiempo, String pais, int identificador, String nombre2,
			int tiempoAcumulado) {
		super(nombre, totalTiempo, pais);
		this.identificador = identificador;
		nombre = nombre2;
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + "]";
	}

	protected void getPosicionGeneral() {
	}

	protected void setPosiciónGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;

	}
	
}

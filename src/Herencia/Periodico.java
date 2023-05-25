package Herencia;

public class Periodico {

	//Atributos
	public String Nombre;
	public String Fecha;
	public Periodico(int ndp,float p, String nombre, String fecha) {
		super();
		Nombre = nombre;
		Fecha = fecha;
	}
	public Periodico() {
		super();
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "Periodico [Nombre=" + Nombre + ", Fecha=" + Fecha + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

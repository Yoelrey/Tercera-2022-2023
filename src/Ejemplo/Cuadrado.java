package Ejemplo;

import java.awt.Color;

public class Cuadrado extends Figura{

	protected double lado;
	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cuadrado(Color color, int[] Posicion) {
		super(color, Posicion);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}


	@Override
	public double calculaArea() {
		return lado*lado;
	}
	

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Figura c = (Figura) o;
		if(this.calculaArea()>c.calculaArea()) {
			return 1;
		
		}else if(this.calculaArea()==c.calculaArea()) {
			return 0;
		}else {
			return -1;
		}
	}
	

	
}

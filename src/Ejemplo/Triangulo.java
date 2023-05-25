package Ejemplo;

import java.awt.Color;
import java.util.Arrays;

public class Triangulo extends Figura{

	protected double base;
	protected double altura;
	
	public Triangulo(double base,double altura) {
		setAltura(altura);
		setBase(base);
	}
	Triangulo(double base,double altura,Color color){
		super(color);
		setBase(base);
		setAltura(altura);
	}
	Triangulo(double base,double altura,Color color,int[]Posicion){
		super(color,Posicion);
		setBase(base);
		setAltura(altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", ColorFigura=" + ColorFigura + ", Posicion="
				+ Arrays.toString(Posicion) + "]";
	}
	@Override
	//Metodo muy interesante
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

package Ejemplo;

import java.awt.Color;
import java.util.Arrays;

public class Circulo extends Figura{
	 protected double Radio;
	 
	 Circulo(double Radio) {
	 setRadio(Radio);
	  }
	 
	  Circulo(double Radio,Color color) {
	  super(color);
	  setRadio(Radio);
	  }
	 
	  Circulo(double Radio, Color color, int[] Posicion) {
	  super(color, Posicion);
	  setRadio(Radio);
	  }
	 
	  public void setRadio(double Radio) {
	  this.Radio = Radio;
	  }
	 
	  public double getRadio() {
	  return Radio;
	  }

	@Override
	public String toString() {
		return "Circulo [Radio=" + Radio + ", ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion)
				+ "]";
	}
	@Override
	public double calculaArea() {
	
		return 4;
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
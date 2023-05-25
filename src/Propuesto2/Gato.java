package Propuesto2;

import java.awt.Color;

public class Gato extends Mascota {

	protected float longSalto;
	protected float AltSalto;
	public Gato(String nombre, int edad, Color color, float longSalto, float altSalto) {
		super(nombre, edad, color);
		this.longSalto = longSalto;
		AltSalto = altSalto;
	}
	@Override
	public String toString() {
		return "Gato [longSalto=" + longSalto + ", AltSalto=" + AltSalto + "]";
	}
	
	public static String sonido(){
		return "Los gatos mauyan y ronronean";
	}
	
}

package Ejercicio47B;

import java.util.ArrayList;

public class test {

	
	public static void main(String[] args) {
		ArrayList<Animal>animales=new ArrayList<>();
		
		
		
		
		for(Animal a:animales) {
			System.out.println(a.getAlimentos());
			System.out.println(a.getHabitat());
			System.out.println(a.getNombreCientifico());
			System.out.println(a.getSonido());
			
		}
	}
}

package Ejercicio42;

import java.util.ArrayList;

public class testApartamentos {

	
	public static ArrayList<Inmueble> Lista= new ArrayList<>();
	public static void main(String[] args) {
		
		Casa c= new Casa(45,32,"hispanidad",23,543,65);
		Lista.add(c);
		for (Inmueble i:Lista) {
			System.out.println(i);
		}
		
	}
	
}

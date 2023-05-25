package Propuesto2;

import java.awt.Color;
import java.util.ArrayList;

public class TestMascota {
	public static ArrayList<Mascota>Mascotas=new ArrayList<>();
	
public static void main(String[] args) {
	Mascota m =new Mascota("Misco", 4,Color.black);
	Perro p= new Perro("Peter", 6, Color.white, 20, false);
	Gato g=new Gato("Leo", 10, Color.black, 15f, 0.5f);
	
	
	
	
	Mascotas.add(m);
	Mascotas.add(p);
	Mascotas.add(g);
	
	for(Mascota masc:Mascotas) {
		System.out.println(masc.toString());
		if(masc instanceof Perro)
			((Perro) masc).sonido();
		if(masc instanceof Gato)
			Gato.sonido();
		if(masc instanceof Mascota)
			System.out.println("Aclarate claval");
	}
}
}

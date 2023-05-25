package Ejemplo3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class test2 {
	public static void main(String[] args) {

		// Vehiculo vehiculo = new Vehiculo(Color.yellow, (byte)4, (short)3500,
		// (short)300);
		EstacionServicio zito = new Coche(Color.cyan, (byte) 4, (short) 4, (short) 1200, 5);
		
		Motocicleta MotoBarata = new Motocicleta(Color.red, (short) 125, (short) 25);
		EstacionServicio MotoBarata2 = new Motocicleta(Color.red, (short) 125, (short) 25);
		Motocicleta MotoCara = new Motocicleta(Color.yellow, (short) 1000, (short) 90);

		Camion CamionNormal = new Camion(Color.red, (byte) 4, (byte) 2, (short) 4000, (short) 300);
		EstacionServicio CamionEnorme = new Camion(Color.red, (byte) 24, (byte) 6, (short) 15000, (short) 800);
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add((Vehiculo) CamionEnorme);
		lista.add(CamionNormal);
		lista.add(MotoBarata);
		lista.add((Vehiculo) MotoBarata2);
		lista.add(MotoCara);
		// lista.add(vehiculo);

		ArrayList<EstacionServicio> paganos = new ArrayList<>();
		paganos.add(MotoBarata2);
		paganos.add(CamionEnorme);
		for (Vehiculo v : lista) {
			System.out.println(v.pagarCarburante());
		}
		
		for (Vehiculo v : lista)
			System.out.println(v);

		for (Vehiculo v : lista)
			System.out.println(v + " tiene que pagar " + v.pagarRodaje());
		Collections.sort(lista);
		System.out.println("ORdenados de mayor a menor");
		for (Vehiculo v : lista) {
			System.out.println(v);
		}
		
		
		System.out.println("Repostamos");
		for (Vehiculo v : lista) {
			System.out.println(v.pagarCarburante());
		}
	}
}

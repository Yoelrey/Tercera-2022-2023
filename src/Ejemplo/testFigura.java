package Ejemplo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testFigura {

	
	public static void main(String[] args) {
		ArrayList<Figura> ListaDeFiguras=new ArrayList<Figura>();
		int[] Posicion = { 10, 20 };
		double[] Lados = { 50d, 100d };
	
		Triangulo v16=new Triangulo(23.5,6.2,Color.blue,Posicion);
		Circulo MiCirculo = new Circulo(3d, Color.red, Posicion);
		Rectangulo MiRectangulo = new Rectangulo(Lados, Color.blue, Posicion);

		ListaDeFiguras.add(MiCirculo);
		ListaDeFiguras.add(MiRectangulo);
		ListaDeFiguras.add(v16);
		
		System.out.println(MiCirculo);
		int[] Centro = MiCirculo.getCentro();
		System.out.println(Centro[0]);
		System.out.println(Centro[1]);

		System.out.println(MiRectangulo.getColor());
		
		System.out.println(MiCirculo.calculaArea());
		System.out.println(MiRectangulo.calculaArea());
		System.out.println(v16.calculaArea());
		System.out.println(v16.toString());
		
		for(Figura f:ListaDeFiguras) {
			System.out.println(f);
			System.out.println("su area es: "+f.calculaArea());
		}
			
			Collections.sort(ListaDeFiguras);
		
			for(Figura f:ListaDeFiguras) {
				System.out.println(f);
				System.out.println("su area es: "+f.calculaArea());
			}
	}

}
